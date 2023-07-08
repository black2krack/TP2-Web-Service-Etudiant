package Service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import domaine.Etudiant;

@WebService
public class GestionEtudiant 
{
    private static final ArrayList<Etudiant> ListeEtudiants = new ArrayList<Etudiant>();
    
    public String ajouter (@WebParam (name="nom") String nom, @WebParam (name="prenom") String prenom)
     {
    	Etudiant etudiant = new Etudiant (nom, prenom);
    	ListeEtudiants.add(etudiant);
    	
    	return String.format("Ajout effectué avec succès (ID = %d", etudiant.getId());
    }
    
     @WebMethod
    public ArrayList<Etudiant> lister(){
    	return ListeEtudiants;
    }
     public String supprimer (@WebParam (name="id") int id)
     {
    	for (Etudiant etudiant : ListeEtudiants) {
    		if (etudiant.getId()== id) {
    			ListeEtudiants.remove(etudiant);
    			return String.format("Suppression effectuée avec succès (ID = %d", id);
    		}
    	}
    	
    	return String.format("Echec de la suprression, l'étudiant N°" + id + " n'existe pas !");
    }
}

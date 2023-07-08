package app;

import Service.GestionEtudiantService;

import service.Etudiant;
import service.GestionEtudiant;
import service.GestionEtudiantService;

public class gestionEtudiantClient {
	 public static void main(String[] args) {
		 GestionEtudiantService stub = new GestionEtudiantService().getGestionEtudiantPort();
		 
		 String resultatAjout = stub.ajouter("Ndiaye","Mamadou");
		 System.out.println(resulatAjout);
		 
		 ArrayList<Etudiant> etudiants = stub.lister();
		 
		 for (Etudiant etudiant : etudiants)  {
			 System.out.println("Etudiant N°" + etudiant.getId());
			 System.out.println("Prenom : " + etudiants.getPrenom());
			 System.out.println("Nom : " + etudiants.getNom());
			 System.out.println("============================");
		 }
	 }

}

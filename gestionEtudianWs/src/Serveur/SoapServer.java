package Serveur;

import javax.xml.ws.Endpoint;

import Service.GestionEtudiant;

public class SoapServer {
	
	public static void main (String[] args) {
		String url = "http://localhost:1234/";
		Endpoint.publish(url,new GestionEtudiant());
		System.out.println("Serveur à l'écoute sur le sport" + url + "GestionEtudiant?wsdl");
	}

}
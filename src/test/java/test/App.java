package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import gestionFoot.model.Arbitre;
import gestionFoot.model.Attaquant;
import gestionFoot.model.Defenseur;
import gestionFoot.model.Entraineur;
import gestionFoot.model.Equipe;
import gestionFoot.model.Gardien;
import gestionFoot.model.Joueur;
import gestionFoot.model.Match;
import gestionFoot.model.Milieu;
import gestionFoot.model.Pays;
import gestionFoot.model.Personne;
import gestionFoot.model.Stade;

public class App {
	
	
	
	/************ FONCTIONS DE SAISIE ************/
	
	public static int saisieInt(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int val =sc.nextInt();
		return val;
	}

	public static double saisieDouble(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextDouble();
	}

	public static String saisieString(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextLine();
	}

	public static boolean saisieBoolean(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextBoolean();
	}


	
	
	/************ FONCTIONS DE MENUS ************/
	
	
	
	
	

	public static void main(String[] args) {
		
		Arbitre orsato = new Arbitre("Orsato","Daniele",LocalDate.parse("1975-11-23"),63.0);
		Arbitre turpin = new Arbitre("Clément","Turpin",LocalDate.parse("1969-05-25"),0.1);
		

		Gardien courtois = new Gardien("Courtois","Thibaut",LocalDate.parse("1992-05-11"),40,50.5,67,80,0,0);
		Gardien vanDerSar = new Gardien("Van Der","Sar",LocalDate.parse("1980-05-11"),60,80.5,67,80,0,0);
		Gardien loris = new Gardien("Loris","Hugo",LocalDate.parse("1992-05-11"),40,50.5,70,80,0,0);

		Defenseur mendy = new Defenseur("Mendy","Ferland",LocalDate.parse("1995-06-08"),79.1,65.4,90.3,44.9,0,59.7);	
		Defenseur kimpembe = new Defenseur("Presnel","Kimpembe",LocalDate.parse("1995-04-25"),0.5,0.4,0.7,0.8,0,25.0);	
		Defenseur Maguire = new Defenseur("Harry","Maguire",LocalDate.parse("1995-04-25"),0.5,0.4,0.7,0.8,0,25.9);
		
		
		Attaquant neymar = new Attaquant ("neymar","da Silva Santos Júnior",LocalDate.parse("1992-02-05"),0.7,0.94,0.65,0.45,15,25);
		Attaquant Cr7 = new Attaquant ("Cristiano","Ronaldo",LocalDate.parse("1985-02-05"),0.5,0.7,0.95,0.68,5,30);
		Attaquant Benzema = new Attaquant ("Karim","Benzema",LocalDate.parse("1987-12-19"),0.8,0.8,0.8,0.7,25,10);
		
		Milieu pogba = new Milieu ("Paul","Pogba",LocalDate.parse("1993-05-15"),0.76,0.79,0.5,0.8,20,10);
		Milieu dybala = new Milieu ("Paulo","Dybala",LocalDate.parse("1993-11-15"),0.5,0.4,0.7,0.8,0.5,25);
		Milieu pirlo = new Milieu ("Andrea","Pirlo",LocalDate.parse("1979-05-19"),0.5,0.4,0.7,0.8,0.5,25);
		
		
		

		
		//Stade 	OldTrafford = new Stade("OldTrafford", "75000", "Sir Matt Busby Way,Manchester",90.0);
		//Stade 	Anfield = new Stade("Anfield", "80000", "Anfield Rd, Anfield, Liverpool L4 0TH, United Kingdom",95.0);
		//Stade 	StadeDeLumiere= new Stade("StadeDeLumiere", "60000", "10 Av. Simone Veil, 69150 Decines-Charpieu",80.0);
		//Stade 	StadiumToulouse= new Stade("StadiumToulouse", "45000", "1 All. Gabriel Bienes, 31000 Toulouse",70.0);
		//Stade 	AnjalayIleMaurice= new Stade("AnjalayIleMaurice", "16000", "Mapou, Maurice" , 60.0);
		
		Entraineur mourinho = new Entraineur("José","Mourinho",LocalDate.parse("1965-04-25"),0.6,0.89,0.1,0.90,0.99);
		Entraineur ancelotti = new Entraineur("Ancelotti","Carlo",LocalDate.parse("1965-04-25"),0.6,0.89,0.1,0.90,0.99);
		
		List<Joueur> listeJoueur1 = new ArrayList();
		Collections.addAll(listeJoueur1,vanDerSar,neymar,pogba,kimpembe);
		
		List<Joueur> listeJoueurBelgique = new ArrayList();
		Collections.addAll(listeJoueurBelgique,courtois,Benzema,pirlo,mendy);
		
		List<Joueur> listeJoueurMaurice = new ArrayList();
		Collections.addAll(listeJoueurMaurice,Cr7,dybala,Maguire,loris);
		
		Equipe equipe1 = new Equipe(Pays.France,"Bleu",3,listeJoueur1,mourinho);
		Equipe equipe2 = new Equipe(Pays.Allemagne,"Rouge",2,listeJoueurBelgique,ancelotti);
		
		
		
		//Match match = new Match(orsato,equipe1,equipe2,Anfield);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceJPA-eshop");
		EntityManager em = emf.createEntityManager();
		
		
		
		em.getTransaction().begin();
		em.persist(mendy);
		em.persist(kimpembe);
		em.persist(Maguire);
		
		em.persist(courtois);
		em.persist(vanDerSar);
		em.persist(loris);
		
		em.persist(neymar);
		em.persist(Cr7);
		em.persist(Benzema);
		
		em.persist(pogba);
		em.persist(dybala);
		em.persist(pirlo);
		
		em.persist(mourinho);
		em.persist(ancelotti);

		em.persist(orsato);
		em.persist(turpin);
		
		em.persist(equipe1);
		em.persist(equipe2);
		
		
		em.getTransaction().commit();
		
		em.close();
		
		//em.persist(fournisseur2);
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(achat1);
		
		
		
		
		
		
		// Interface de connexion/enscription
		// Possibilité de choisir des perso déjà créer ou en créer d'autres
		// par semaine : nombre de point, choix d'attribution de ces points 
		// via une méthodes dans l'objet Entraineur, qui va permettre de redistribuer ces points
	
		 
		
		

		
		

	}

}

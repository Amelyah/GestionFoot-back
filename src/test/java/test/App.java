package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import gestionFoot.model.Adresse;
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
	
	/*********************************************/
	/*          FONCTIONS DE SAISIE              */
	/*********************************************/
	
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


	
	
	/*********************************************/
	/*            FONCTIONS DE MENUS             */
	/*********************************************/

	public static void menuBegin() 
	{
		System.out.println("\n*********************************************");
		System.out.println("*              FOOTBALL MANAGER             *");
		System.out.println("*********************************************");
		
		System.out.println("\n************************");
		System.out.println("*    Menu principal    *");
		System.out.println("************************");
		
		System.out.println("1- Se connecter");
		System.out.println("2- Inscription");
		System.out.println("3- Stop");

		int choix = saisieInt("\nQue souhaites-tu faire ?");


		switch(choix) 
		{
		case 1 : connection();break;
		case 2 : inscription();break;
		//case 3 :Singleton.getInstance().getEmf().close(); System.exit(0);break;
		}
		menuBegin();
	}
	
	public static void inscription() {
		
		System.out.println("\n************************");
		System.out.println("*      INSCRIPTION     *");
		System.out.println("************************");
		System.out.println("Tu aimes le football et tu as l'esprit manager ? Tu aimes tout ce qui est tactique et statistique ? ");
		System.out.println("Renseignes quelques informations sur toi pour pouvoir commencer\n\n");
		
		String login = saisieString("Ton login :");
		String password = saisieString("Ton password :");
		String nom = saisieString("Ton nom : ");
		String prenom = saisieString("Ton prenom : ");
		String naissance = saisieString("Ta date de naissance : ");


		/*User u = new User(login,password,nom,prenom,LocalDate.parse(naissance));
		daoC.save(u);
		System.out.println("Nous t'avons bien inscrit ! A toi de jouer ! ");
		
		String choix = saisieString("Souhaites-tu commencer à jouer ? (o/n)");
		
		if(choix.equals("o"){
		 connection();
		}
		*/
		
		

	}
	
	public static void connection() 
	{
		System.out.println("\n************************");
		System.out.println("*      CONNEXION      *");
		System.out.println("************************");
		
		/* Si l'utilisateur a déjà créer une équipe
		System.out.println("Bon retour sur Football Manager, n'oublies pas d'utiliser tes points du jour (s'il t'en reste) \npour faire evoluer ton équipe"
				+ " afin de rivaliser avec les autres adversaires\n\n");
		*/
		
		String login = saisieString("Ton login :");
		String password = saisieString("Ton password :");
		/*connected = daoC.seConnecter(login, password);

		if(connected instanceof User) {
			if(connected n'a pas encore d'équipe) {
				menuUserBeginner();
			}else {
				menuUser();
		}else {
			System.out.println("Oups! Ton login ou ton mot de passe n'est pas correct");
			String choix = saisieString("Souhaites-tu réessayer ?");
			
			if(choix.equals("o"){
		 		connection();
			}else { 
				System.out.println("À plus tard sur Football Manager !");
			}
		}*/
	}
	
	public static void menuUserBeginner() {
		System.out.println("\n************************************");
		System.out.println("*      "
		//+connected.getLogin()
				+" - MENU PRINCIPAL      *");
		System.out.println("************************************");
		System.out.println("1 - Je crée mon équipe");
		System.out.println("2 - Voir le guide d'utilisation de FM");
		System.out.println("4 - Me deconnecter");

		int choix = saisieInt("\nQue souhaites-tu faire ?");
		
		/*switch(choix) 
		{
		case 1 : createMyTeam(); break;
		case 2 : showFMUserManual(); break;
		case 3 : menuBegin(); break;
		}
		menuUser();*/
	}
	
	public static void menuUser() {
		System.out.println("\n************************************");
		System.out.println("*      "
		//+connected.getLogin()
				+" - MENU PRINCIPAL      *");
		System.out.println("************************************");
		System.out.println("1 - Je gère mon équipe");
		System.out.println("2 - Voir toutes les matchs gagnés");
		System.out.println("3 - Voir le guide d'utilisation de FM");
		System.out.println("4 - Me deconnecter");

		int choix = saisieInt("\nQue souhaites-tu faire ?");
		
		/*switch(choix) 
		{
		case 1 : manageMyTeam(); break;
		case 2 : showFootballMatchWon(); break;
		case 3 : showFMUserManual(); break;
		case 4 : showParticipations(); break;
		case 5 : menuBegin(); break;
		}
		menuUser();*/
	}
	
	public static void createMyTeam() {
		
		// Affichage d'une liste des joueurs existants
		
		// Permettre au user de créer son propre joueur
		
	}
	
	public static void manageMyTeam() {}
	
	public static List<Match> showFootballMatchWon() { return null;}
	
	public static void showFMUserManual() {
		
		// Page HTML qui spécifiera les règles du jeu
		
		System.out.println("\n************************************");
		System.out.println("*     GUIDE D'UTILISATION DE FM     *");
		System.out.println("************************************\n\n");
		
		System.out.println("Bienvenue dans Football Manager !\n\n"
				+ "Laisses-nous deviner ? Tu aimes le football ? "
				+ "\nEt tu aimerais pouvoir manager ta propre équipe ? "
				+ "\nMais tu ne sais pas comment t'y prendre ?\n"
				+ "Permets-nous de t'expliquer un peu le fonctionnement !\n\n");
		
		System.out.println("******  \\  Les objectifs  \\  ******\n\n");
		
		System.out.println("Tu vas pouvoir créer ta propre équipe de joueurs, "
				+ "et jouer le rôle de l'entraineur afin de pouvoir booster ton équipe"
				+ "lorsqu'elle affrontra d'autres équipes adversaires. Le but est de"
				+ "maintenir et faire évoluer le plus possible ton équipe grâce aux matchs"
				+ "que tu auras gagnés et également aux points qui te seront donnés chaque jour.\n\n");
		
		System.out.println("À la création de ton équipe, tu pourras choisir le pays qui tu voudras "
				+ "représenter parmi une liste.\n\n");
		
		System.out.println("Une fois ton équipe créée, tu pourras gérer :"
				+ "- la pratique d'entraînement"
				+ "- le coaching de ton équipe en début de match et en mi-temps"
				+ "- l'évolution des statistiques de tes joueurs"
				+ "- démissioner car tu as décidé que manager était trop dur\n\n");
		
		System.out.println("Un match dure X sec/min. L'arbitre est choisi au hasard, qui peut "
				+ "faire preuve, plus ou moins, d'impartialité. Ce sera toi et ta chance !\n"
				+ "Le stade où sera joué le match aura une ambiance plus ou moins bonne, ce qui pourra"
				+ "impacter le jeu de ton équipe.\n"
				+ "À la mi-temps, il te sera possible de coacher ton équipe si tu vois qu'elle "
				+ "a besoin d'être motivée ou si tu veux, tout simplement, continuer à l'encourager.\n"
				+ "Attention ! Si tu prends un match, une sanction sera appliquée à ton équipe, et à "
				+ "l'entraîneur que tu incarnes.\n\n");
		
		System.out.println("À toi de jouer et de permettre à ton équipe d'atteindre le haut du classement de Football Manager !");
	}
	
	
	
	
	
	/*********************************************/
	/*            PROGRAMME PRINCIPAL            */
	/*********************************************/
	
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

		Adresse a1 = new Adresse("OldTrafford", "75000", "Sir Matt Busby Way","Manchester");
		Adresse a2 = new Adresse("StadeDeLumiere", "60000", "10 Av. Simone Veil", "69150 Decines-Charpieu");
		Adresse a3 = new Adresse("StadiumToulouse", "45000", "1 All. Gabriel Bienes", "31000 Toulouse");
		Adresse a4 = new Adresse("AnjalayIleMaurice", "16000", "Mapou"," Maurice AnjalayIleMaurice");
		
		Stade 	Anfield = new Stade(" ", " ",a1,95.0);
		Stade 	StadeDeLumiere= new Stade(" ", " ",a2,80.0);
		Stade 	StadiumToulouse= new Stade(" ", " ",a3,70.0);
		Stade 	AnjalayIleMaurice= new Stade(" ", " ",a4, 60.0);
		
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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceJPA");
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
		
		
		
		
		//menuUser();
		
		// Interface de connexion/enscription
		// Possibilité de choisir des perso déjà créer ou en créer d'autres
		// par semaine : nombre de point, choix d'attribution de ces points 
		// via une méthodes dans l'objet Entraineur, qui va permettre de redistribuer ces points
	
	}

}

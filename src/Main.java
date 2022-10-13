

public class Main { 

	
	//private Individu[] tabIndividu;
	Objet[] tabObjet;

	
	//private Joueur monJoueur;
	
	public static void main(String[] args) 
	{
		
		
		// les pièces
		Piece P1 =new Piece();
		Piece P2 =new Piece();
		Piece P3 =new Piece();
		Piece P4 =new Piece();
		Piece P5 =new Piece();
		Piece P6 =new Piece();
		Piece P7 =new Piece();
		Piece P8 =new Piece();
		Piece P9 =new Piece();
		Piece P10 =new Piece();
		Piece P11=new Piece();
		//PiecePassageSecret p8 = new PiecePassageSecret();
		// les portes
		Porte Po1 = new Porte(1);
		Porte Po2 = new Porte();
		Porte Po3 = new Porte(); // false
		Porte Po4 = new Porte(); // 1 true
		Porte Po5 = new Porte();
		Porte Po6 = new Porte(3); // 3 
		Porte Po7 = new Porte();
		Porte Po8 = new Porte();
		Porte Po9 = new Porte();
		Porte Po10= new Porte(2); // 2
		//relier les porte au piece
		//P1
		P1.ajoutPorte(Po1,P2,"Ouest");
		P1.ajoutPorte(Po2,P3,"Nord");
		//p3
		P3.ajoutPorte(Po10,P11,"Est");
		P3.ajoutPorte(Po3,P4,"Nord");
		//P4
		P4.ajoutPorte(Po4,P5,"Ouest");
		P4.ajoutPorte(Po9,P10,"Nord");
		P4.ajoutPorte(Po6,P7,"Est");
		//P5
		P5.ajoutPorte(Po5,P6,"Ouest");
		//P7
		P7.ajoutPorte(Po7,P8,"Est");
		//P8
		P8.ajoutPorte(Po8,P9,"Nord");
		//porte secret
		//p8.ajoutPassageSecret(P3);
		
		
		
		
		
		// individus
		Joueur j = new Joueur(P1);
		Monstre m1 = new Monstre(P1);
		//Monstre m2 = new Monstre(P7);
		Cuisinier c1 = new Cuisinier(P2);
		Medecin m = new Medecin(P2);
		//Individu tabI[] = {m1,m2,c1,m};
		
		// objets
		Cle cl1 = new Cle(P1,1);
		Cle cl2 = new Cle(P2,2);
		Cle cl3 = new Cle(P2,3);
		Nourriture n1 = new Nourriture(P1);
		Medicament me1 = new Medicament(P1);
		Tresor t = new Tresor(P2);
		//Objet tabO[] = {cl1,cl2,cl3,n1,me1,t};
		
		//test
		Objet tabO[] = {cl1,cl2,cl3,t,n1,me1};
		Individu tabI[] = {c1,m,m1};
		
		Jeu jeu = new Jeu(tabI,tabO,j);
		
		
		//System.out.println(jeu.getObjet(0).getPosition());
		Window fenetre=new Window(jeu);
		
		fenetre.maj_map();
		fenetre.maj_inv();
		fenetre.refresh_vie();
		fenetre.refresh_force();
		fenetre.falseDropAndUse();
		fenetre.setVisible(true);
		
		
		/*
		while (!jeu.gagne() && !jeu.perdu())
		{
			jeu.affiche();
			jeu.menu();
		}*/
		if(jeu.gagne())
			System.out.println("Bravo vous avez Gagné");

		if(jeu.perdu()==true){
			System.out.println("vous avez perdu");
				System.exit(0);
			}
			
	}
		
	
	
		
}

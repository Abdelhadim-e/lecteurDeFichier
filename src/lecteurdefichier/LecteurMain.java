package lecteurdefichier;

public class LecteurMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Affichage lecteur");
		
		// new + pwd
		LecteurFichierInterface lf = new LecteurFichier("C:/Users/Abdelhadim/Desktop/testLecteur.txt");
		lf.read();
		lf.display();
		System.out.println();
		
	}

}

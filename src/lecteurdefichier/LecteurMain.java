package lecteurdefichier;

public class LecteurMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Affichage lecteur");
		
		// new + pwd desktop
		String pwd;
		
		LecteurFichierInterface lct = new LecteurFichier("/c/Users/Abdelhadim/Desktop/lecteurFichier.txt");
		lct.read();
		lct.display();
		System.out.println();
		
	}

}

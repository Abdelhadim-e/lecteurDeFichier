package lecteurdefichier;


// Implement ts les fichiers
public class LecteurFichier extends Reader implements LecteurFichierInterface {
	
	public LecteurFichier(String file) {
		// -> class ancetre
		super.file = file;
	}
	
	// M�thode h�rit�e -> class parante
	//@override
	public void read() {
		super.read(file);
	}
	
	public void display() {
		System.out.println(content);
	}

}

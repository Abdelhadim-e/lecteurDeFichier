package lecteurdefichier;

// Liste des fichiers répertoires true/false fichier / Renomer les fichiers / Supprimer les fichiers
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileInputStream;

public abstract class Reader {
	// Attribut protected pour étendre la famille
	protected String content = "";
	// Attrib file string
	protected String file;
	
	public void read(String file) {
		FileInputStream in  = null;
		File f = new File(file);
		// Ouverture du fichier 
		try {
			// Ouverture du fichier 
			in = new FileInputStream(f);
			int content;
			// Throws + Try et catch
			// Operations de lecture 
			while((content = in.read()) != 1){
				// Number en lettre 				
				this.content += (char)content;
				
			}
		}	
			// Catch Exception
			catch(IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(in != null)
						in.close();
				}catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

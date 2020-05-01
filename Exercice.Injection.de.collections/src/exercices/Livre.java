/**
 * 
 */
package exercices;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Pierre-Henry Barge
 *
 */
public class Livre {
	
	private String titre;
	private String auteur;
	private String categorie;
	private String isbn;

	@Autowired
	public Livre(String titre, String auteur, String categorie, String isbn) {
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
		this.isbn = isbn;
	}

	public String affiche() {
		String result = "Livre : isbn=" + this.isbn + ", titre=" + this.titre + ", auteur=" + this.auteur + ", categorie=" + this.categorie;
		return result;
	}

}

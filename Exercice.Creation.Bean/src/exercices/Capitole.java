/**
 * 
 */
package exercices;

import org.springframework.stereotype.Component;

/**
 * @author Pierre-Henry Barge
 *
 */
@Component("Capitole")
public class Capitole implements iBatiment {
	private int superficie = 500;
	private int nombreDePieces = 8;
	
	@Override
	public String affiche() {
		return "batiment avec " + this.nombreDePieces + " pièces et une superficie de " + this.superficie + "m2";
	}

	@Override
	public String composition() {
		return "bois";
	}

}

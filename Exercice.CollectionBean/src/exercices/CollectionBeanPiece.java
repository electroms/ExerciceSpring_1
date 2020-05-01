/**
 * 
 */
package exercices;

import java.util.List;

/**
 * @author Pierre-Henry Barge
 *
 */
public class CollectionBeanPiece {
	private List<String> pieces;
	public void setPieces(List<String> pieces) {
	this.pieces = pieces;
	}
	public void affiche() {
	System.out.println(this.pieces);
	}


}

package exercices;
/**
 * 
 */

/**
 * @author Pierre-Henry Barge
 *
 */
public class Propriete {
	private iBatiment ibatiment;
	private iTerrain iterrain;
	private String adresse;
	

	public Propriete(iBatiment ibatiment, iTerrain iterrain, String adresse) {
		super();
		this.ibatiment = ibatiment;
		this.iterrain = iterrain;
		this.adresse = adresse;
	}
	
	public void affiche() {
		System.out.println("Propriete immobiliere : " + ibatiment.affiche() +", "+iterrain.affiche() +", "+ adresse);
	}
	
}
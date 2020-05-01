
package exercices;

/**
 * @author Pierre-Henry Barge
 *
 */
public class TerrainGazon implements iTerrain {

	private int superficie;

	public TerrainGazon(int superficie) {
		this.superficie = superficie;
	}

	@Override
	public String affiche() {
		return "terrain avec une superficie de " + this.superficie + "m2";
	}


	public String recouvertPar() {
		return "gazon";
	}
}

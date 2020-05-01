package exercices;

public class TerrainBeton implements iTerrain {

	private int superficie;

	public TerrainBeton(int superficie) {
		this.superficie = superficie;
	}

	@Override
	public String affiche() {
		return "terrain avec une superficie de " + this.superficie + "m2";
	}

	
	public String recouvertPar() {
		return "beton";
	}
}
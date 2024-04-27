package finalfight;

import java.util.Random;

// Vampiro
public class Vampiro implements Personaggio {
	private int forzaVitale = 100;

	public int attacca(boolean plenilunio) {
		Random rand = new Random();
		if (plenilunio) {
			return rand.nextInt(41); // da 0 a 40
		} else {
			return rand.nextInt(51); // da 0 a 50
		}
	}

	public int getForzaVitale() {
		return forzaVitale;
	}

	public void subisciDanno(int danno) {
		forzaVitale -= danno;
	}

	public String getTipo() {
		return "Vampiro";
	}
}

package finalfight;

import java.util.Random;

// Licantropo
public class Licantropo implements Personaggio {
	private int forzaVitale = 100;

	public int attacca(boolean plenilunio) {
		Random rand = new Random();
		if (plenilunio) {
			return rand.nextInt(51); // da 0 a 50
		} else {
			return rand.nextInt(41); // da 0 a 40
		}
	}

	public int getForzaVitale() {
		return forzaVitale;
	}

	public void subisciDanno(int danno) {
		forzaVitale -= danno;
	}

	public String getTipo() {
		return "Licantropo";
	}
}

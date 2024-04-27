package finalfight;

// iPersonaggio
public interface Personaggio {

	int attacca(boolean plenilunio);

	int getForzaVitale();

	void subisciDanno(int danno);

	String getTipo();

}

package finalfight;

/*
 * 
 * Licantropo Vs. Vampiro;
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean continua = true;

		// ASCII ART
		String asciiArt = """
				             ⣀⣀⣤⣤⣤⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⢀⣴⣿⡿⠟⠋⠉⠀⠀⠀⠀⠀⠉⠛⠻⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀
				⠀⠀⠀⣰⣿⠟⠉⠀⠀⠀⠀⠀⠀⢀⣠⣴⣶⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀
				⠀⠀⣰⣿⠋⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀
				⠀⢰⣿⠇⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀
				⠀⣿⡿⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀
				⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀
				⠀⣿⣷⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀
				⠀⢸⣿⡄⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀
				⠀⠀⢻⣿⡄⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀
				⠀⠀⠀⠹⣿⣦⡀⠀⠀⠀⠀⠀⠀⠈⠛⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀
				⠀⠀⠀⠀⠈⠻⣿⣷⣤⣄⣀⠀⠀⠀⠀⠀⣀⣠⣴⣾⣿⣿⣿⡿⠟⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠈⠙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠉⠀⠀⠀⠀⠀⠀⠀
				⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠛⠛⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
				            """;

		System.out.println(asciiArt);

		System.out.println("*** *** /FINAL FIGHT!/ *** ***");
		System.out.println("*** Licantropo Vs. Vampiro ***\n");

		while (continua) {
			// Personaggio?
			System.out.print("\nScegli il tuo personaggio (1 per Licantropo, 2 per Vampiro): ");
			int scelta = scanner.nextInt();
			Personaggio personaggioScelto;
			Personaggio avversario;
			if (scelta == 1) {
				personaggioScelto = new Licantropo();
				avversario = new Vampiro();
			} else {
				personaggioScelto = new Vampiro();
				avversario = new Licantropo();
			}

			// Print luna? & ...
			boolean plenilunio = random.nextBoolean();
			System.out.println();
			System.out.println(
					"È una notte di " + (plenilunio ? "plenilunio [Il Licantropo può attaccare con maggior forza!]"
							: "novilunio [Il Vampiro può attaccare con maggior forza!]"));
			System.out.println("\n* Tu sei il... " + personaggioScelto.getTipo());
			System.out.println("* Forza vitale del Licantropo: " + personaggioScelto.getForzaVitale());
			System.out.println("* Forza vitale del Vampiro: " + avversario.getForzaVitale());

			// Start
			System.out.println("\nPremi Invio per iniziare...");
			scanner.nextLine(); // Invio
			scanner.nextLine(); // ...

			// Final Fight!
			while (personaggioScelto.getForzaVitale() > 0 && avversario.getForzaVitale() > 0) {
				int attaccoPersonaggio = personaggioScelto.attacca(plenilunio);
				int attaccoAvversario = avversario.attacca(plenilunio);

				avversario.subisciDanno(attaccoPersonaggio);
				personaggioScelto.subisciDanno(attaccoAvversario);

				System.out.println(personaggioScelto.getTipo() + " attacca con forza " + attaccoPersonaggio + ", "
						+ avversario.getTipo() + " ha forza vitale " + avversario.getForzaVitale());
				System.out.println(avversario.getTipo() + " attacca con forza " + attaccoAvversario + ", "
						+ personaggioScelto.getTipo() + " ha forza vitale " + personaggioScelto.getForzaVitale());

				// Invio...
				System.out.println("\nPremi Invio per continuare...");
				scanner.nextLine();
			}

			// The Winner?
			if (personaggioScelto.getForzaVitale() <= 0) {
				System.out.println("*** Hai perso! Il vincitore è: " + avversario.getTipo());
			} else {
				System.out.println("*** Complimenti! Hai vinto!!!");
			}

			// Play?
			System.out.println("\nVuoi giocare ancora? (s/n)");
			String risposta = scanner.next();
			continua = risposta.equalsIgnoreCase("s");
		}

		System.out.println("\nAlla prossima...");

		scanner.close();

	}

}

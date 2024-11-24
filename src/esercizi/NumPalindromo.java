package esercizi;
import java.util.Scanner;

public class NumPalindromo {
	/* In questo esercizio, prendo un intero fornito dall'utente
	 * e attraverso l'utilizzo di funzioni dedicate mostro a schermo
	 * se il numero è PALINDROMO oppure NO. */

	public static void main(String[] args) {
		// Prendo la input dell'utente
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero positivo: (premi Enter per confermare)");
		
		// La salvo in una varibile
		int num1 = in.nextInt();
		in.close();
		
		//	Mostro numero inserito
		System.out.println("Numero inserito: " + num1);
		
		// Passo il numero alla funzione palindromeCheck che tornerà un boolean.
		if (palindromeCheck(num1)) {
			System.out.println("Questo numero è palindromo! :)");
		} else {
			System.out.println("Questo numero NON è palindromo. :(");
		}
		

	}
	
	/* Questa funzione, dato un intero, mi restituisce il numero di cifre */
	public static int digitCalculator(int num1) {
		int count = 0;
		while (num1 > 0) {
			num1 = num1 / 10;
			count++;
		}
		return count;
	}
	
	/* Questa funzione mi calcola la potenza del 10 che mi serve per girare il numero */
	public static int powCalculator(int digitNumbers) {
		
		// Se il numero di cifre è maggiore di 1 mi calcolo la potenza
		if (digitNumbers > 1) {
//			System.out.println(digitNumbers);
			return (int) Math.pow(10, digitNumbers - 1);
		}
		
		// Altrimenti vuol dire che ho 1 cifra quindi ritorno 1.
		return 1;
	}
	
	public static int numberTurner(int numToReverse) {
		int numberTurned = 0;
		while (numToReverse > 0) {
			
			// Mi calcolo il numero di cifre
			int digitNumbers = digitCalculator(numToReverse);
			
			// In base al numero di cifre mi calcolo la potenza del 10
			int pow = powCalculator(digitNumbers);
			
			// Prendo l'ultima cifra e aggiorno il numero
			int lastDigit = numToReverse % 10;
			numToReverse = numToReverse / 10;
			
			// Sommo a "numberTurned" i valori per ottenere il numero girato
			numberTurned += lastDigit * pow;
		}
		return numberTurned;
	}
	
	public static boolean palindromeCheck(int numToReverse) {
		int numberTurned = numberTurner(numToReverse);
		if (numToReverse == numberTurned) {
			return true;
		} else {
			return false;
		}
	}

}

package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class NumPalindromoTest {
	
	static NumPalindromo numPalindromo;

	/*Siccome i metodi all'interno della classe sono statici,
	 * non c'è bisogno di istanziare un oggetto, questo perchè
	 * i metodi stessi appartengono alla classe e non all'istanza
	 */
	
	//@BeforeAll
	//static void setUpBeforeClass() throws Exception {
		//numPalindromo = new NumPalindromo();
	//}

	@Test
	void testDigitCalculator() {
		assertEquals(1, NumPalindromo.digitCalculator(0));
		assertEquals(1, NumPalindromo.digitCalculator(1));
		assertEquals(2, NumPalindromo.digitCalculator(12));
		assertEquals(3, NumPalindromo.digitCalculator(123));
		assertEquals(4, NumPalindromo.digitCalculator(1234));
		assertEquals(5, NumPalindromo.digitCalculator(12345));
		
	}
	
	@Test
	void testPowCalculator() {
		assertEquals(1, NumPalindromo.powCalculator(1));
		assertEquals(10, NumPalindromo.powCalculator(2));
		assertEquals(100, NumPalindromo.powCalculator(3));
		assertEquals(1000, NumPalindromo.powCalculator(4));
		assertEquals(10000, NumPalindromo.powCalculator(5));
	}
	
	@Test
	void testNumberTurner() {
		assertEquals(0, NumPalindromo.numberTurner(0));
		assertEquals(1, NumPalindromo.numberTurner(1));
		assertEquals(321, NumPalindromo.numberTurner(123));
		assertEquals(4321, NumPalindromo.numberTurner(1234));
		assertEquals(54321, NumPalindromo.numberTurner(12345));
	}
	
	@Test
	void testPalindromeCheck() {
		assertEquals(true, NumPalindromo.palindromeCheck(0));
		assertEquals(true, NumPalindromo.palindromeCheck(1));
		assertEquals(false, NumPalindromo.palindromeCheck(123));
		assertEquals(true, NumPalindromo.palindromeCheck(323));
	}
	
	@Test
    void testGetValidInteger() {
        // Caso valido
        Scanner validInput = new Scanner("42\n");
        assertEquals(42, NumPalindromo.getValidInteger(validInput, "Inserisci un numero:"));

        // Caso di input non valido seguito da input valido
        Scanner invalidThenValidInput = new Scanner("abc\n-10\n99\n");
        assertEquals(99, NumPalindromo.getValidInteger(invalidThenValidInput, "Inserisci un numero:"));

        // Caso limite di input 1
        Scanner edgeCaseInput = new Scanner("1\n");
        assertEquals(1, NumPalindromo.getValidInteger(edgeCaseInput, "Inserisci un numero:"));
    }

}

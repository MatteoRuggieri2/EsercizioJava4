package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class NumPalindromoTest {
	
	static NumPalindromo numPalindromo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		numPalindromo = new NumPalindromo();
	}

	@Test
	void testDigitCalculator() {
		assertEquals(3, numPalindromo.digitCalculator(123));
	}
	
	@Test
	void testPowCalculator() {
		assertEquals(100, numPalindromo.powCalculator(3));
	}
	
	@Test
	void testNumberTurner() {
		assertEquals(321, numPalindromo.numberTurner(123));
	}
	
	@Test
	void testPalindromeCheck() {
		assertEquals(false, numPalindromo.palindromeCheck(123));
	}

}


package com.password.generate.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratorTest {
	private final Password password = new Password("Secret");
	private final Alphabet firstAlphabet = new Alphabet(true, false, false, false);
	private final Alphabet secondAlphabet = new Alphabet(false, true, true, true);
	private final Generator generator = new Generator(true, false, false, false);

	void test1() {
		assertEquals("Secret", password.toString());
	}

	void test2() {
		assertEquals(firstAlphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);

	}

	void test3() {
		assertEquals(secondAlphabet.getAlphabet(), Alphabet.LOWERCASE_LETTERS + Alphabet.NUMBERS, Alphabet.SYMBOLS);

	}

	void test4() {
		assertEquals(generator.alphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);

	}

	void test5() {
		assertEquals(generator.alphabet.getAlphabet().length(), 26);
		
	}



}

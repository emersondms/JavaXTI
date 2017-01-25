//Aula115 - TestSuite com JUnit

package br.com.xti.teste;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import br.com.xti.refinado.Recursividade;

public class RecursividadeTest {

	@Test
	public void testSoma() {
		assertEquals(55, Recursividade.soma(10));;
	}

	@Test
	public void testPotencia() {
		assertEquals(81, Recursividade.potencia(3, 4));
	}

}

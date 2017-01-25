//Aula115 - TestSuite com JUnit

package br.com.xti.teste;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import br.com.xti.heranca.Cubo;

public class CuboTest {

	Cubo cubo;
	
	@Before
	public void setUp() throws Exception {
		cubo = new Cubo(10);
	}

	@Test
	public void testCalculaVolume() {
		assertEquals(600, cubo.calculaVolume(), 0);
	}

	@Test
	public void testCalculaArea() {
		assertEquals(1000, cubo.calculaArea(), 0);
	}

}

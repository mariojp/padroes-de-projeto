package br.com.mariojp.iisp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void testOld() {
		Cliente cliente = new Bronze();
		cliente.setNome("Pedro");
		cliente.getDesconto(20.00);
		assertTrue(true);
	}
	
	@Test
	void testNewWEB() {
		//TODO
	}

}

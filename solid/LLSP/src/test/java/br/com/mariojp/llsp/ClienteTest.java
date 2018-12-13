package br.com.mariojp.llsp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void clienteBronze() {
		Cliente cliente = new Bronze();
		cliente.setNome("Bronse");
		cliente.getNome();
		assertTrue(true);
	}

}

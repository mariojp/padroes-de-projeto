package br.com.mariojp.ddip;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClienteTest {
	
	
	



	
	@Test
	void testDescontoErro() {
		new Cliente().getDesconto(null);
		//assertEquals(0, new Cliente().getDesconto(null));

	}
	
	
	@Test
	void testDescontoOk() {
		assertEquals(5.0, new Cliente().getDesconto(100.00));
		//assertEquals("hello", outContent.toString());
	}
	
	

}

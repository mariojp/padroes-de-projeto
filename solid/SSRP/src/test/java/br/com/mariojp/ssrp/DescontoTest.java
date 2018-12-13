package br.com.mariojp.ssrp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste de Funcionario")
public class DescontoTest {

	
	
	@Test
	void testDescontoErro() {
		assertEquals(0, new Cliente().getDesconto(null));
	}
	
	
	@Test
	void testDescontoOk() {
		assertEquals(5.0, new Cliente().getDesconto(100.00));
	}

}

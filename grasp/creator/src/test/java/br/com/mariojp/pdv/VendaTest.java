package br.com.mariojp.pdv;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class VendaTest {

	@Test
	void testGetTotal() {
		
		Produto produto1 = new Produto(1l,"Desktop","i5 8gb",new BigDecimal("1500.00"));
		Produto produto2 = new Produto(2l,"Notebook","i7 16gb",new BigDecimal("4500.00"));
		
		Venda venda = new Venda(LocalDate.now(),LocalTime.now());
		
		ItemVenda item1 = new ItemVenda(produto1,2);
		venda.getItens().add(item1);
		venda.setTotal(venda.getTotal().add(item1.getTotal()));

		ItemVenda item2 = new ItemVenda(produto2,1);
		venda.getItens().add(item2);
		venda.setTotal(venda.getTotal().add(item2.getTotal()));
				
		assertEquals(new BigDecimal("7500.00"), venda.getTotal());
		
	}
}

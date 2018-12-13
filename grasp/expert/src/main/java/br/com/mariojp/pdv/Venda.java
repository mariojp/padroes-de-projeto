package br.com.mariojp.pdv;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<ItemVenda> itens = new ArrayList<ItemVenda>();

	
	private LocalDate data;
	
	private LocalTime hora;
	
	public Venda() {
	}	
	
	
	public Venda(LocalDate data, LocalTime hora) {
		super();
		this.data = data;
		this.hora = hora;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
	}
	
	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (ItemVenda itemVenda : itens) {
			BigDecimal subtotal = itemVenda.getProduto().getPreco().multiply(BigDecimal.valueOf(itemVenda.getQuantidade()));
			total = total.add(subtotal);
		}
		return total;
	}
	
	
}

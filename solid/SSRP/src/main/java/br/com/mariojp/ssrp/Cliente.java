package br.com.mariojp.ssrp;

import java.time.LocalDateTime;

/**
 * 
 * Single responsibility principle 
 * Escrever no console, saber a data de hoje é responsabilidade dessa classe?
 * 
 * @author mariojp
 *
 */
public class Cliente {

	
	private Long id;
	
	private String nome;
	
	public double getDesconto(Double total) {
		
		double desconto = 0;		
		try {
			desconto = total * 0.05;
		}catch (Exception e) {
			System.out.println(LocalDateTime.now() +": Erro ao tentar aplicar desconto");
		}
		return desconto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
}

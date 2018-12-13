package br.com.mariojp.llsp;


/**
 * Liskov substitution principle
 * Criar uma classe para um Provavel Cliente que não tem desconto
 * 
 * @author mariojp
 *
 */
public class Cliente {

	private Long id;

	private String nome;

	public double getDesconto(Double total) {
		return total * 0.05;
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

package br.com.mariojp.oocp;

public class Cliente {

	private Long id;

	private String nome;

	private int tipo;

	
	/**
	 * Open closed principle
	 *  Remover os If's do codigo
	 * 
	 * @param total
	 * @return
	 */
	public double getDesconto(Double total) {

		if (tipo == 1) {
			return total * 0.1;
		} else {
			return total * 0.05;
		}

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

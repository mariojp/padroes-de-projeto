package br.com.mariojp.iisp;


/**
 * 
 * Criar um tipo de cliente web que deve atender a interface ICliente 
 * Adicionar o atributo email e uma interface IClienteWEB com o metodo envia email
 * 
 * @author mariojp
 *
 */
public class Cliente implements ICliente {

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

package br.com.mariojp.ddip;


/**
 * 
 * Dependency inversion principle
 * 
 * Permitr a alteração do log para poder ser feito por email ou em arquivo.
 * 
 * @author mariojp
 *
 */
public class Cliente {

	
	private Log l = new Log();
	
	private Long id;
	
	private String nome;
	
	public double getDesconto(Double total) {
		
		double desconto = 0;		
		try {
			desconto = total * 0.05;
		}catch (Exception e) {
			l.mensagem("Erro ao tentar aplicar desconto");
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

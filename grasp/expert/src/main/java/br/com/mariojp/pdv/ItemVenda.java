package br.com.mariojp.pdv;

public class ItemVenda {

	private Produto produto;
	
	private Integer quantidade;
	
	
	public ItemVenda() {
	}

	

	public ItemVenda(Produto produto, Integer quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}



	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	

	
}

package br.com.desafiomercadinho.dominio;

public abstract class Produto {

	private String nome;
	private String marca;
	private double valorCompra;
	private double valorVenda;
	private int qtdEstoque;
	private int qtdParaDesconto;
	
	public abstract int atualizarEstoque(int qtdVendida);
	
	
	
	public int getQtdParaDesconto() {
		return qtdParaDesconto;
	}

	public void setQtdParaDesconto(int qtdParaDesconto) {
		this.qtdParaDesconto = qtdParaDesconto;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	
}

package br.com.desafiomercadinho.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReservaProduto {

	private static final double PERCENTUAL_DESCONTO = 0.10;
	
	private int qtdProduto;
	private double desconto;
	private Produto produto;
	private double subTotal;
	
	public void inserirProduto(Venda venda, Produto p, int qtdProd) {
		this.qtdProduto = qtdProd;
		this.subTotal = qtdProd * p.getValorVenda();
		if(this.qtdProduto >= p.getQtdParaDesconto()){
			this.desconto = PERCENTUAL_DESCONTO * p.getValorVenda();			
		}				
		this.produto = p;
		venda.atualizarVenda(this);
	}		

	
	public double getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

}

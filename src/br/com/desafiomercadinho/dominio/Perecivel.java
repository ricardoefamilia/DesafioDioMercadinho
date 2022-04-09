package br.com.desafiomercadinho.dominio;

import java.time.LocalDate;

public class Perecivel extends Produto{

	private LocalDate dtFabricacao;
	private LocalDate dtVencimento;
	
	@Override
	public int atualizarEstoque(int qtdVendida) {
		this.setQtdEstoque(this.getQtdEstoque() - qtdVendida);
		return this.getQtdEstoque();
	}
	

	public LocalDate getDtFabricacao() {
		return dtFabricacao;
	}

	public void setDtFabricacao(LocalDate dtFabricacao) {
		this.dtFabricacao = dtFabricacao;
	}

	public LocalDate getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(LocalDate dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	
	
}

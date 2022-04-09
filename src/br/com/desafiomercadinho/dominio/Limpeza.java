package br.com.desafiomercadinho.dominio;

public class Limpeza extends Produto{

	private double peso;
	private double volume;
	
	@Override
	public int atualizarEstoque(int qtdVendida) {
		this.setQtdEstoque(this.getQtdEstoque() - qtdVendida);
		return this.getQtdEstoque();
	}

	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
		

}

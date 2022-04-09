package br.com.desafiomercadinho.dominio;

public class Decoracao extends Produto{

	private String material;
	
	@Override
	public int atualizarEstoque(int qtdVendida) {
		this.setQtdEstoque(this.getQtdEstoque() - qtdVendida);
		return this.getQtdEstoque();
	}
	

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}

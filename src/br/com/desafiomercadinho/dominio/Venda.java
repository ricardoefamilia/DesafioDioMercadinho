package br.com.desafiomercadinho.dominio;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Venda {
	private String NF;
	private LocalDateTime dtVenda;	
	private String cpf;	
	private int qtdProdutoVendidos = 0;
	private double vlrTotalVenda = 0;
	private double vlrTotalDescontos = 0;
	private ReservaProduto rp;
	private List<ReservaProduto> reservaProdutos = new ArrayList<>();
	
	public void imprimirProdutosVendidos() {
		DecimalFormat df = new DecimalFormat("#.##");	
		double subTotal;
		reservaProdutos.forEach(reservaProduto->System.out.println("Produto: "+
				reservaProduto.getProduto().getNome()+" - Marca: "+
				reservaProduto.getProduto().getMarca()+" - qtd: "+reservaProduto.getQtdProduto()+
				" - Valor p/unid R$"+reservaProduto.getProduto().getValorVenda()+"\nDesconto: R$"+
				df.format(reservaProduto.getDesconto())+" --> subtotal: R$"+
				df.format(reservaProduto.getSubTotal() - reservaProduto.getDesconto())));
		System.out.println("Total de produtos: "+ qtdProdutoVendidos);	
		System.out.println("Valor total dos descontos -- R$"+ df.format(vlrTotalDescontos));
		System.out.println("Valor total da venda ----------------- R$"+ df.format(vlrTotalVenda));
	}
	public void atualizarVenda(ReservaProduto rp) {
		this.qtdProdutoVendidos += rp.getQtdProduto();
		this.vlrTotalVenda += rp.getSubTotal() - rp.getDesconto();
		this.vlrTotalDescontos += rp.getDesconto();
		this.reservaProdutos.add(rp);
		//this.reservaProdutos.addAll(reservaProdutos);
	}
	
	public int getQtdProdutoVendidos() {
		return qtdProdutoVendidos;
	}
	public void setQtdProdutoVendidos(int qtdProdutoVendidos) {
		this.qtdProdutoVendidos = qtdProdutoVendidos;
	}
	public double getVlrTotalVenda() {
		return vlrTotalVenda;
	}
	public void setVlrTotalVenda(double vlrTotalVenda) {
		this.vlrTotalVenda = vlrTotalVenda;
	}
	public double getVlrTotalDescontos() {
		return vlrTotalDescontos;
	}
	public void setVlrTotalDescontos(double vlrTotalDescontos) {
		this.vlrTotalDescontos = vlrTotalDescontos;
	}
	public List<ReservaProduto> getReservaProdutos() {
		return reservaProdutos;
	}
	public void setReservaProdutos(List<ReservaProduto> reservaProdutos) {
		this.reservaProdutos = reservaProdutos;
	}
	public ReservaProduto getRp() {
		return rp;
	}
	public void setRp(ReservaProduto rp) {
		this.rp = rp;
	}
	public String getNF() {
		return NF;
	}
	public void setNF(String nF) {
		NF = nF;
	}
	public LocalDateTime getDtVenda() {
		return dtVenda;
	}
	public void setDtVenda(LocalDateTime dtVenda) {
		this.dtVenda = dtVenda;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

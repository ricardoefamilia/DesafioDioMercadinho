package br.com.desafiomercadinho;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.desafiomercadinho.dominio.Decoracao;
import br.com.desafiomercadinho.dominio.Limpeza;
import br.com.desafiomercadinho.dominio.Perecivel;
import br.com.desafiomercadinho.dominio.Produto;
import br.com.desafiomercadinho.dominio.ReservaProduto;
import br.com.desafiomercadinho.dominio.Venda;

public class Main {

	public static void main(String[] args) {
		//cadastrar produtos
		Limpeza p1 = new Limpeza();
		p1.setMarca("Limpol");
		p1.setNome("Detergente");
		p1.setQtdEstoque(50);
		p1.setQtdParaDesconto(3);
		p1.setValorCompra(0.99);
		p1.setValorVenda(1.65);
		p1.setVolume(500);
		
		Limpeza p2 = new Limpeza();
		p2.setMarca("Ipê");
		p2.setNome("Detergente");
		p2.setQtdEstoque(50);
		p2.setQtdParaDesconto(4);
		p2.setValorCompra(0.95);
		p2.setValorVenda(1.62);
		p2.setVolume(500);
		
		Perecivel p3 = new Perecivel();
		p3.setMarca("Kicaldo");
		p3.setNome("Feijão");
		p3.setQtdEstoque(100);
		p3.setQtdParaDesconto(5);
		p3.setValorCompra(4.95);
		p3.setValorVenda(7.55);
		p3.setDtFabricacao(LocalDate.now());
		p3.setDtVencimento(LocalDate.now().plusDays(90));
		
		Perecivel p4 = new Perecivel();
		p4.setMarca("Ovos Alexandre");
		p4.setNome("Ovos Grandes");
		p4.setQtdEstoque(100);
		p4.setQtdParaDesconto(3);
		p4.setValorCompra(12.5);
		p4.setValorVenda(17.99);
		p4.setDtFabricacao(LocalDate.now());
		p4.setDtVencimento(LocalDate.now().plusDays(30));
		
		Perecivel p5 = new Perecivel();
		p5.setMarca("Tio João");
		p5.setNome("Arroz Branco tipo 1");
		p5.setQtdEstoque(100);
		p5.setQtdParaDesconto(3);
		p5.setValorCompra(13);
		p5.setValorVenda(20.99);
		p5.setDtFabricacao(LocalDate.now());
		p5.setDtVencimento(LocalDate.now().plusDays(150));
		
		Decoracao p6 = new Decoracao();
		p6.setMarca("Philips");
		p6.setNome("Relógio de parede");
		p6.setQtdEstoque(100);
		p6.setQtdParaDesconto(4);
		p6.setValorCompra(25.5);
		p6.setValorVenda(35);
		p6.setMaterial("Aço Inoxidável");
		
		Limpeza p7 = new Limpeza();
		p7.setMarca("Limpol");
		p7.setNome("Detergente");
		p7.setQtdEstoque(50);
		p7.setQtdParaDesconto(3);
		p7.setValorCompra(0.99);
		p7.setValorVenda(1.65);
		p7.setVolume(500);
		
		
		//reservar produtos
		Venda venda1 = new Venda();
		venda1.setNF("2022V001");
		venda1.setCpf("111.222.333-44");
		venda1.setDtVenda(LocalDateTime.now());		
		
		ReservaProduto rp1 = new ReservaProduto();				
		rp1.inserirProduto(venda1, p2, 4);
		
		ReservaProduto rp2 = new ReservaProduto();
		rp2.inserirProduto(venda1, p3, 2);
		
		ReservaProduto rp3 = new ReservaProduto();
		rp3.inserirProduto(venda1, p5, 1);
		
		ReservaProduto rp4 = new ReservaProduto();
		rp4.inserirProduto(venda1, p1, 8);
		
		ReservaProduto rp5 = new ReservaProduto();
		rp5.inserirProduto(venda1, p1, 1);
		
		venda1.imprimirProdutosVendidos();
	}
}

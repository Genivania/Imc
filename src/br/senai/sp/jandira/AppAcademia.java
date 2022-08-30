package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
		
		FrameCalculoImc tela = new FrameCalculoImc();
		tela.titulo = "Calculadora IMC";
		tela.altura = 600;
		tela.largura = 600;
		tela.corDeFundoDeTela = new Color(155, 0, 155);
		tela.FontDosLabels = new Font("Cooper Black",Font.ITALIC,30);
		tela.corDoBotao = new Color(0, 0, 128);
		//tela.corDasLetras = new Color(255, 255, 128);
		tela.criarTela();
		
//		FrameCalculoImc tela2 = new FrameCalculoImc();
//		tela2.titulo = "Calculadora IMC2";
//		tela2.altura = 600;
//		tela2.largura = 600;
//		tela2.corDeFundoDeTela = new Color(0, 255, 0);
//		tela2.FontDosLabels = new Font("Cooper Black",Font.ITALIC,30);
//		tela2.corDoBotao = new Color(0, 0, 128);
//		tela2.criarTela();
		
		
		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();
		
		System.out.println(ana);
		System.out.println(pedro);
		
		ana.nome = "Ana Maria Brega";
		ana.dataDeNascimento = LocalDate.of(1950, 5, 24);
		ana.peso = 62;
		ana.altura = 1.68;
		ana.getImc();
		System.out.println(ana.getImc());
		String teste = ana.getStatus();
		//JOptionPane.showMessageDialog(null, teste);
		
		
		pedro.nome = "Pedro Dias";
		pedro.dataDeNascimento = LocalDate.of(2004, 2, 16);
		
		
		
	}

}

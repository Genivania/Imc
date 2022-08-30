package br.senai.sp.jandira.gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
//import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;            //importa as informações sobre a frame. 
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameCalculoImc {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDeTela;
	public Font FontDosLabels;
	public Color corDoBotao;
	//public Color corDasLetras;
	
	
	
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		               
		
		
		//obter a instancia do painel de conteúdo.
		Container painel = tela.getContentPane();   
		painel.setBackground(corDeFundoDeTela);                //mudar a cor do fundo
		
		
		
		// Criar os componentes da tela e colocar no painel (container)
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(230, 15, 300, 30);
		labelImc.setForeground(new Color(0, 230, 230));
		labelImc.setFont(new Font("Arial", Font.BOLD, 30));                 //mudar a fonte
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(25, 50, 60, 30);
		JTextField textFildNome = new JTextField();
		textFildNome.setBounds(25, 80, 500, 30);
		//labelNome.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(25, 110, 300, 30);
		JTextField textFildPeso = new JTextField();
		textFildPeso.setBounds(25, 140, 500, 30);
		//labelPeso.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(25, 180, 300, 30);
		JTextField textFildAltura = new JTextField();
		textFildAltura.setBounds(25, 210, 500, 30);
		//labelAltura.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("Data de nascimento:");
		labelDataNascimento.setBounds(25, 250, 300, 30);
		JTextField textFildDataNascimento = new JTextField();
		textFildDataNascimento.setBounds(25, 280, 380, 30);
		//labelDataNascimento.setFont(new Font("Arial", Font.BOLD, 15));
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("CALCULAR");
		buttonCalcular.setBounds(420, 280, 120, 30);
		
	

		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Seu IMC é: ");
		labelResultado.setBounds(25, 320, 300, 30);
		//labelResultado.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel labelStatus = new JLabel();
		labelStatus.setText("O status do seu IMC é: ");
		labelStatus.setBounds(25, 350, 300, 30);
		//labelStatus.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		//Eventos de click
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
					Cliente cliente = new Cliente();
					cliente.nome = textFildNome.getText();
					cliente.peso = Double.parseDouble(textFildPeso.getText());
					cliente.altura = Double.parseDouble(textFildAltura.getText());
					
					labelResultado.setText(cliente.nome + " , Seu IMC " + cliente.getImc());
					labelStatus.setText("Status IMC: " + cliente.getStatus());
						
				
			}
		} );
		
		
		
		// Adicionar os componentes
		painel.add(labelImc);
		painel.add(buttonCalcular);
		painel.add(labelNome);
		painel.add(textFildNome);
		painel.add(labelPeso);
		painel.add(textFildPeso);
		painel.add(labelAltura);
		painel.add(textFildAltura);
		painel.add(labelDataNascimento);
		painel.add(textFildDataNascimento);
		painel.add(labelResultado);
		painel.add(labelStatus);
		
		
		
		
		tela.setVisible(true);
	}
	
	
}

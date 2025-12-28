package swing_if;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Question1 {

	public static void main(String[]args) {
		
		
		JFrame frame = new JFrame("Questão 1");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Pode ser Interessante tirar isso 
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JPanel painel =new JPanel();
		
		
		//titulos
		Label title =new Label("Digite um numero");
		Label resultado =new Label("Lugar do Resultado ?");
		
		//Input
		JTextField input =new JTextField("");
	    input.setPreferredSize(new Dimension(200,20));
		//Botoes
		JButton botao =new JButton("Enviar");
		botao.setSize(100,30);
		
		//Adicionando efeito ao botao
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int numero =Integer.parseInt(input.getText()) ;
						
							
							
							if(numero >10) {
								resultado.setText("O NUMERO E MAIOR QUE 10!");
							}else{
									resultado.setText("O NUMERO Não e maior QUE 10!");
							}
							
						
				
				
			}
		});
		
		
		
		
		
		//Centraliza a janela no meio quando aberta 
		frame.setLocationRelativeTo(null);
		
		frame.add(painel);
		painel.add(title);
		painel.add(input);
		painel.add(botao);
		painel.add(resultado);
		frame.setVisible(true);
	}
}

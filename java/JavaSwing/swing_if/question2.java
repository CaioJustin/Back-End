package swing_if;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class question2 {
	
		public static void main(String[]args) {
			
			JFrame frame =new JFrame("Questão 2");
			frame.setSize(200,200);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new FlowLayout(FlowLayout.CENTER));
			
			
			JPanel painel =new JPanel();
			painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
			
			//title
			Label title =new Label("Digite um numero");
			Label Resultado =new Label("Local do Resultado ");
			
			//
			JTextField input = new JTextField();
			input.setPreferredSize(new Dimension(200,20));
			
			//botao
			JButton botao =new JButton("Enviar");
			botao.setSize(100,20);
			
			//feito do botao 
			
			botao.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String text = input.getText().trim();
					
				if(text.isEmpty()){
					Resultado.setText("Digite um numero");
				}else{
					
					try {
						int result= Integer.parseInt(input.getText());
						
						if(result >10){
							Resultado.setText("O Numero e maior que 10!");
						}else if(result ==10) {
							Resultado.setText("O numero e igual a 10");
						}else if(result <10){
							Resultado.setText("O numero e menor que 10");
						}
						
					} catch (NumberFormatException ed) {
						Resultado.setText("Digite um numero");
						System.out.println("Erro de conversão : "+ed.getMessage());
					}
					
				}
					
					
				}
			});
			
			
			
			
			frame.setLocationRelativeTo(null);
			
			frame.add(painel);
			frame.add(title);
			frame.add(input);
			frame.add(botao);
			frame.add(Resultado);
			frame.setVisible(true);
		}
	
}

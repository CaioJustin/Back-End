package swing_if;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Questao5 {

	
	public static void main(String[]args) {
		
		//main window 
		JFrame TelaPrincipal=new JFrame("Exercio 5 ");
		TelaPrincipal.setSize(250,250);
		TelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TelaPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
		//painel
		JPanel painel= new JPanel();
		painel.setLayout(new BoxLayout(painel,BoxLayout.Y_AXIS));
		
		
		//label
		Label valor1=new Label("Valor 1");
		Label valor2=new Label("Valor 2");
		
		
		//input 
		JTextField Valor1nput=new JTextField();
		JTextField Valor2input=new JTextField();
		
		Valor1nput.setPreferredSize(new Dimension(100,25));
		Valor2input.setPreferredSize(new Dimension(100,25));
		
		//botão
		JButton botao =new JButton("Enviar");
		botao.setPreferredSize(new Dimension(100,40));
		
	
		
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String v1=Valor1nput.getText().trim();
				String v2=Valor2input.getText().trim();
				
				if(v1.isEmpty() || v2.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Algum input está vazio");
				}
				
			
				
				
				try{
					
					int numerOne=Integer.parseInt(v1);
					int numertwo=Integer.parseInt(v2);
					
					int soma=numerOne+numertwo;
					int sub=numerOne-numertwo;
					int mult=numerOne*numertwo;
					int div=numerOne/numertwo;
					
					int maior=0;
					int menor=0;
					
					
					if(numerOne >numertwo) {
						
						maior=numerOne;
						menor=numertwo;
					}else {

						menor=numerOne;
						maior=numertwo;	
					}
					
						JOptionPane.showMessageDialog(null,"resultado"+
						"\nSoma: "+soma+
						"\nSub: "+sub+
						"\nult: "+mult+
						"\ndiv: "+div+
						"\nMaior numero: "+maior+
						"\nMenor numero: "+menor);
					
				} catch (NumberFormatException ex ) {
					JOptionPane.showMessageDialog(null,"Erro de : "+ex);
				}
				
				
			}
		});
		
		
		
		
		TelaPrincipal.setLocationRelativeTo(null);
		
		//Adicionando as coisa na janela 
		TelaPrincipal.add(painel);
		painel.add(valor1);
		painel.add(Valor1nput);
		painel.add(valor2);
		painel.add(Valor2input);
		painel.add(botao);
		TelaPrincipal.setVisible(true);
	}
	
}

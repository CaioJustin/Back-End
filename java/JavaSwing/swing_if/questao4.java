package swing_if;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class questao4 {

	public static void main(String[]args) {
		
		JFrame frame=new JFrame("Questão 4");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JPanel painel =new JPanel();
		painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
		
		JLabel LabelValor1 =new JLabel("Valor 1");
		JLabel LabelValor2= new JLabel("Valor 2");
		
		JTextField InputValor1= new JTextField();
		InputValor1.setPreferredSize(new Dimension(200,20));
		JTextField InputValor2= new JTextField();
		JButton botao=new JButton("Enviar");
		
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String valor1=InputValor1.getText().trim();
				String valor2=InputValor2.getText().trim();
				
				int v1=Integer.parseInt(valor1);
				int v2=Integer.parseInt(valor2);
				
				
				int soma=v1+v2;
				int sub=v1-v2;
				int mult=v1*v2;
				float div=v1/v2;
				
				if(valor1.isEmpty() || valor2.isEmpty()){
					JOptionPane.showMessageDialog(null,"Os valores estão vazios");
				}else{
					JOptionPane.showMessageDialog(null,"Adição: "+soma+"\nSubtração: "+sub+"\nMultiplicação: "+mult+"\nDivisão: "+div);
				}
				
				
			}
		});
		
		
		
		frame.setLocationRelativeTo(null);
		frame.add(painel);
		painel.add(LabelValor1);
		painel.add(InputValor1);
		painel.add(LabelValor2);
		painel.add(InputValor2);
		painel.add(botao);
		frame.setVisible(true);
		
	}
}

package swing_if;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Questao8 {

	public static void main(String[]args) {
		
		JFrame frame= new JFrame("Tela de inicio");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
		//JPanel
			JPanel painel =new JPanel();
			painel.setLayout(new BoxLayout(painel, BoxLayout.X_AXIS));
		
		//Numero 1 
			Label number1Text=new Label("Primeiro numero");
			JTextField Number1=new JTextField();
		
			JPanel Pnumber1=new JPanel();
			Pnumber1.setLayout(new BoxLayout(Pnumber1, BoxLayout.Y_AXIS));
			Pnumber1.add(number1Text);
			Pnumber1.add(Number1);
		
		//Numero 2
		
			Label number2Text=new Label("Segundo numero");
			JTextField Number2=new JTextField();
		
			JPanel Pnumber2=new JPanel();
			Pnumber2.setLayout(new BoxLayout(Pnumber2, BoxLayout.Y_AXIS));
			Pnumber2.add(number2Text);
			Pnumber2.add(Number2);
		
		//numero3 
			Label number3text=new Label("Terceiro numero");
			JTextField Number3=new JTextField();
		
			JPanel Pnumber3=new JPanel();
			Pnumber3.setLayout(new BoxLayout(Pnumber3, BoxLayout.Y_AXIS));
			Pnumber3.add(number3text);
			Pnumber3.add(Number3);
		
		//Botao;
			JButton botao =new JButton("Enviar");
		
		//Eventos
			botao.addActionListener(new ActionListener() {
				
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String text1=Number1.getText().trim();
					String text2=Number2.getText().trim();
					String text3=Number3.getText().trim();
					
					if(text1.isEmpty() || text2.isEmpty()||text3.isEmpty()) {
						JOptionPane.showMessageDialog(botao,"Input Vazios");
					}else {
						//JOptionPane.showMessageDialog(botao, "letra e numero");
						
						
						int txt1=Integer.parseInt(Number1.getText().trim());
						int txt2=Integer.parseInt(Number2.getText().trim());
						int txt3=Integer.parseInt(Number3.getText().trim());
						
						int maior=0;
						int menor=0;
	
						try {
							//Descobrindoo maior numero
							if(txt1 >txt2 && txt1 >txt3) {
								maior=txt1;
							}else if(txt2 >txt1 && txt2 >txt3) {
								maior=txt2;
							}else {
								maior=txt3;
							}
							
							//Descobrindo o menor numero 
							if(txt1 <txt2 && txt1 <txt3) {
								menor=txt1;
							}else if(txt2 <txt1 && txt2 <txt3) {
								menor=txt2;
							}else {
								menor=txt3;
							}
							
							JOptionPane.showMessageDialog(null,"Os 3 Numero  "+"\nPrimerio"+txt1+"\nSegundo "+txt2+"\nTerceiro"+txt3+"\nMaior: "+maior+"\nMenor: "+menor );
							
						}catch(NumberFormatException ex) {
							JOptionPane.showMessageDialog(null,"error: "+ex);
						}
						
						
						
						
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			});
			
			
		frame.add(painel);
		frame.add(Pnumber1);
		frame.add(Pnumber2);
		frame.add(Pnumber3);
		frame.add(botao);
		frame.setVisible(true);
	}
}

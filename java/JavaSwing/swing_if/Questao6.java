package swing_if;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Questao6 {

	public static void main(String[]args) {
		
		JFrame telaInicial=new JFrame("Login");
		telaInicial.setSize(400,300);
		telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaInicial.setLayout(new FlowLayout(FlowLayout.CENTER));
		telaInicial.setResizable(false);
		
		JPanel painel = new JPanel();
		painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
		
		String[] Login=new String[1];
		String[] Senha=new String[1];
								
	
		
			//Painel User and Input,label user
				JPanel painelUser=new JPanel();
				painelUser.setLayout(new FlowLayout(FlowLayout.CENTER,10,0));
		
				Label usuario=new Label("Users:");
		
				TextField usuarioInput=new TextField(15);
				usuarioInput.setPreferredSize(new Dimension(170,20));
				
				painelUser.add(usuario);
				painelUser.add(usuarioInput);
				
			//painel password and input and label password		
		
				JPanel PainelPassword=new JPanel();
				PainelPassword.setLayout(new FlowLayout(FlowLayout.CENTER,10,0));
		
				Label senha=new Label("Senha:");
				
				TextField senhaInput=new TextField(15);
				senhaInput.setPreferredSize(new Dimension(170,20));
				
				PainelPassword.add(senha);
				PainelPassword.add(senhaInput);
		
				
		//botao
		Font customFont = new Font("Arial", Font.BOLD, 16);		
			
		
		JPanel painelBotoes=new JPanel();
		painelBotoes.setLayout(new FlowLayout(FlowLayout.CENTER,10,0));
		
		JButton login=new JButton("LOGIN");
		login.setFont(customFont);
		login.setBackground(new Color(0,255,0));
		
		JButton registrar=new JButton("REGISTRAR");
		registrar.setFont(customFont);
		registrar.setBackground(new Color(255,10,50));
		registrar.setForeground(new Color(255,255,255));
		
		
		painelBotoes.add(login);
		painelBotoes.add(registrar);
		
		//Evento dos botões
		
			//Registrar
		
				registrar.addActionListener(new ActionListener() {
					
				
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						String L=JOptionPane.showInputDialog("Digite o Login do Usuario");
						String P =JOptionPane.showInputDialog("Digite a senha do Usuario");
						
						Login[0]=L;
						Senha[0]=P;
						
					}
				});
		
				login.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						String pass = senhaInput.getText().trim();
						String Log=usuarioInput.getText().trim();
						
						try {
							if(pass.equals(Senha[0]) && Log.equals(Login[0])) {
								JOptionPane.showMessageDialog(null,"Bem-vindo!");
							}else {
								JOptionPane.showMessageDialog(null,"Login ou senha inválidos.");
							}
							
							
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null,"O erro e "+e2.getMessage());
						}
					}
				});
		
		//Adicionando os items
		telaInicial.setLocationRelativeTo(null);
		
		
		
		telaInicial.add(painel);
		painel.add(Box.createVerticalStrut(15));
		painel.add(painelUser);
		painel.add(Box.createVerticalStrut(15));
		painel.add(PainelPassword);
		painel.add(Box.createVerticalStrut(15));
		painel.add(painelBotoes);
		painel.add(Box.createVerticalStrut(70));
		telaInicial.setVisible(true);
		
	}
			
			
			
}

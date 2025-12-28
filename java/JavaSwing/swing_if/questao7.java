package swing_if;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class questao7 {

	public static void main(String[]args) {
		
		//Frame
		JFrame telaInicial= new JFrame("Tela de inicio");
		telaInicial.setSize(400,300);
		telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaInicial.setLayout(new FlowLayout(FlowLayout.CENTER));
		telaInicial.setResizable(false);
		telaInicial.setLocationRelativeTo(null);;
		
		//Jpanel
		JPanel painel=new JPanel();
		painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
		
		//
		Label text1=new Label("Digite a sua idade");
		JTextField InputAge =new JTextField();
		JButton botao=new JButton("Verificar");
		Label resultado=new Label("Resultado");
		
		
		botao.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String info=InputAge.getText().trim();
				int infonum = Integer.parseInt(info);
				try {
					if(infonum>=18 || infonum<=65){
						resultado.setText("e obrigado a vota");
					}else {
						resultado.setText("Não e obrigado a votar");
					}
				}catch(NumberFormatException d){
					System.out.println("Error de : "+d.getMessage());
				}
			}
		});
		
		
		telaInicial.add(painel);
		painel.add(text1);
		painel.add(InputAge);
		painel.add(botao);
		painel.add(resultado);
		telaInicial.setVisible(true);
	}
}

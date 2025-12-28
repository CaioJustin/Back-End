package swing_if;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class questao3 {

	public static void main(String[]args) {
		
		
		JFrame frame =new JFrame("Questão 3 ");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JPanel painel = new JPanel();
		painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

		Label nome =new Label("Digite o nome");
		Label idade =new Label("Digite a idade");
		Label Info=new Label("Digite as Notas embaixo");
		Label nota1=new Label("Nota 1");
		Label nota2=new Label("Nota 2");
		Label nota3=new Label("Nota 3");
		
		JTextField InputNome =new JTextField("");
		InputNome.setPreferredSize(new Dimension(100,20));
		
		JTextField InputIdade=new JTextField("");
		JTextField InputNota1=new JTextField("");
		JTextField InputNota2=new JTextField("");
		JTextField InputNota3=new JTextField("");
		
		JButton Calcular=new JButton("Enviar");
		
		Calcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String name = InputNome.getText().trim();
				String age=InputIdade.getText().trim();
				String note1=InputNota1.getText().trim();
				String note2=InputNota2.getText().trim();
				String note3=InputNota3.getText().trim();
		
				
				if(name.isEmpty()|| age.isEmpty() || note1.isEmpty() || note2.isEmpty() || note3.isEmpty()){
					JOptionPane.showMessageDialog(null, "1 ou mais Input esão vazio");
				}else {
					
					int n1=Integer.parseInt(note1);
					int n2=Integer.parseInt(note2);
					int n3=Integer.parseInt(note3);
					int soma =n1+n2+n3;
					int media =soma/3;
					String resultado="";
					
					if(media<7) {
						resultado="Reprovado";
					}else {
						resultado="Aprovado";
					}
					
					JOptionPane.showMessageDialog(null, "O nome do Aluno e : "+name+"\n"+
													"A idade do aluno e : "+age+"\n"+
													"Nota 1 : "+note1+"\n"+
													"Nota 2 :"+note2+"\n"+
													"Nota 3 :"+note3+"\n"+
													"Media : "+media+"\n"+
													"Resultado : "+resultado);
					
				}
				
			}
			
			
		});
		
		
		frame.setLocationRelativeTo(null);
		
		
		frame.add(painel);
		
		painel.add(nome);
		painel.add(InputNome);
		
		painel.add(idade);
		painel.add(InputIdade);
		
		painel.add(Info);
		
		painel.add(nota1);
		painel.add(InputNota1);
		
		painel.add(nota2);
		painel.add(InputNota2);
		
		painel.add(nota3);
		painel.add(InputNota3);
		
		painel.add(Calcular);
		

		
		frame.setVisible(true);
	}
}

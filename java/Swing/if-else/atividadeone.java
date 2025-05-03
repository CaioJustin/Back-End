import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class atividadeone {
    
    public static void main(String[]args){

    JFrame tela  = new JFrame("e maior ou menor que 10? ");
    tela.setSize(300,400);
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel painel = new JPanel();

    Label title = new Label("Digite um numero");
    JTextField input = new JTextField("");
    input.setPreferredSize(new Dimension(200,20));

    JButton enviar = new JButton("Enviar"); 

        enviar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e ){
                String text =input.getText();

                if(!input.getText().isEmpty()){
                    int number =Integer.parseInt(text);

                    if(number > 10){
                      JOptionPane.showMessageDialog(null, "O número é maior que 10.");
                    }else{
                        JOptionPane.showMessageDialog(null, "O número é menor ou igual a 10.");
                    }

                }else{
                   
                JOptionPane.showMessageDialog (null, "O input esta vazio");
                }               
    



            }
            
        });

    painel.add(title);    
    painel.add(input);
    painel.add(enviar);
    tela.add(painel);
    tela.setVisible(true);


    }




}




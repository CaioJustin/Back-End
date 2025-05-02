import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class tenta{

    public static void main(String[]args){

        //Criando a janela 
        JFrame frame = new JFrame("Calculadora ");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Craindo o painel 
        JPanel ButtonPainel = new JPanel();
        JPanel Display= new JPanel();


        //Criando buttao


        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        
        //Criando os butao especiasis
        JButton Bmais = new JButton("+");
        JButton Bmenos = new JButton("-");
        JButton Bmult = new JButton("*");
        JButton Bdiv = new JButton("/");
        JButton Bdelet = new JButton("x");
        JButton Bresult = new JButton("=");
        JButton Bporc = new JButton("%");

        //aumentar botao 
      
        button1.setSize(100,300);


        // efeito do botao resultado



        //Mudand o painel de tamanho
     




        //Adicionando botão ao frame ButtonPanel
        ButtonPainel.add(button1);
        ButtonPainel.add(button2);
        ButtonPainel.add(button3);
        ButtonPainel.add(button4);
        ButtonPainel.add(button5);
        ButtonPainel.add(button6);
        ButtonPainel.add(button7);
        ButtonPainel.add(button8);
        ButtonPainel.add(button9);


        // botao especiais
        ButtonPainel.add(Bmais);
        ButtonPainel.add(Bmenos);
        ButtonPainel.add(Bdiv);
        ButtonPainel.add(Bmult);
        ButtonPainel.add(Bdelet);
        ButtonPainel.add(Bporc);
        ButtonPainel.add(Bresult);

        //button aumentar
        

        
        //Mudando a cor 
        frame.setBackground(Color.yellow);
        ButtonPainel.setBackground(Color.red);
        Display.setBackground(Color.blue);


        //Adicinando item 
        frame.add(Display);
        frame.add(ButtonPainel);
        frame.setVisible(true);
    }
}
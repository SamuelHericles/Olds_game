/*
DISCIPLINE: PROGRAMMING TECHNIQUES

Team: SAMUEL HERICLES SOUZA SILVEIRA 
       GERONIMO PEREIRA AGUIAR

e-mail: samuel.hericles@outlook.com
       geronimopereiraaguiar@gmail.com
*/
package all;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


//=== start of the prgram ====

public class GameOfTheOld extends JFrame implements ActionListener{

//==== starting the classes and global vars ====    
    
        JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11;
        JLabel lb1,lb2,lb3;
        JFrame tela = new JFrame();
        Container c = tela.getContentPane();
        int a = 0;
        int d = 0;
        int f = 0;
        int a11=0,a12=0,a13=0,a21=0,a22=0,a23=0,a31=0,a32=0,a33=0;
        int b11=0,b12=0,b13=0,b21=0,b22=0,b23=0,b31=0,b32=0,b33=0;
        ImageIcon imgX,imgO;


//==== formats buttons, screens and labels ====    
        
public GameOfTheOld(){

        c.setLayout(null);
        
        
        lb1 = new JLabel("Quadro de resultados:");
        lb1.setBounds(5,-45,250,100);
        c.add(lb1);
        
        lb2 = new JLabel("(player 1)X = "+String.valueOf(d));
        lb2.setBounds(5,14,250,13);
        c.add(lb2);
        
        lb3 = new JLabel("(player 2)O = "+String.valueOf(f));
        lb3.setBounds(5,28,250,13);
        c.add(lb3);        
        
        bt1 = new JButton("Reiniciar");
        bt1.addActionListener(this);
        bt1.setSize(130,25);
        bt1.setLocation(50,280);
        bt1.setBackground(Color.gray);
        bt1.setForeground(Color.blue);
        bt1.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt1.setEnabled(true);
        c.add(bt1);

        
        bt2 = new JButton("Sair do jogo");
        bt2.addActionListener(this);
        bt2.setSize(130,25);
        bt2.setLocation(200,280);
        bt2.setBackground(Color.gray);
        bt2.setForeground(Color.blue);
        bt2.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt2.setEnabled(true);
        c.add(bt2);
        
        bt3 = new JButton();
        bt3.addActionListener(this);
        bt3.setSize(60,60);
        bt3.setLocation(90,50);
        bt3.setBackground(Color.gray);
        bt3.setForeground(Color.blue);
        bt3.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt3.setEnabled(true);
        c.add(bt3);
        
        bt4 = new JButton();
        bt4.addActionListener(this);
        bt4.setSize(60,60);
        bt4.setLocation(160,50);
        bt4.setBackground(Color.gray);
        bt4.setForeground(Color.blue);
        bt4.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt4.setEnabled(true);
        c.add(bt4);
        
        bt5 = new JButton();
        bt5.addActionListener(this);
        bt5.setSize(60,60);
        bt5.setLocation(230,50);
        bt5.setBackground(Color.gray);
        bt5.setForeground(Color.blue);
        bt5.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt5.setEnabled(true);
        c.add(bt5);
        
        bt6 = new JButton();
        bt6.addActionListener(this);
        bt6.setSize(60,60);
        bt6.setLocation(90,120);
        bt6.setBackground(Color.gray);
        bt6.setForeground(Color.blue);
        bt6.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt6.setEnabled(true);
        c.add(bt6);
        
        bt7 = new JButton();
        bt7.addActionListener(this);
        bt7.setSize(60,60);
        bt7.setLocation(160,120);
        bt7.setBackground(Color.gray);
        bt7.setForeground(Color.blue);
        bt7.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt7.setEnabled(true);
        c.add(bt7);
        
        bt8 = new JButton();
        bt8.addActionListener(this);
        bt8.setSize(60,60);
        bt8.setLocation(230,120);
        bt8.setBackground(Color.gray);
        bt8.setForeground(Color.blue);
        bt8.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt8.setEnabled(true);
        c.add(bt8);

        bt9 = new JButton();
        bt9.addActionListener(this);
        bt9.setSize(60,60);
        bt9.setLocation(90,190);
        bt9.setBackground(Color.gray);
        bt9.setForeground(Color.blue);
        bt9.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt9.setEnabled(true);
        c.add(bt9);
        
        bt10 = new JButton();
        bt10.addActionListener(this);
        bt10.setSize(60,60);
        bt10.setLocation(160,190);
        bt10.setBackground(Color.gray);
        bt10.setForeground(Color.blue);
        bt10.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt10.setEnabled(true);
        c.add(bt10);
        
        bt11 = new JButton();
        bt11.addActionListener(this);
        bt11.setSize(60,60);
        bt11.setLocation(230,190);
        bt11.setBackground(Color.gray);
        bt11.setForeground(Color.blue);
        bt11.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt11.setEnabled(true);
        c.add(bt11);
        
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setTitle("TRABALHO_3");
        tela.setSize(400,360);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true); 
        
    }O//====End formats====

//====Actions====    
    
@Override
public void actionPerformed(ActionEvent e) {
    
//====IMAGES of the  X E O  60X60 PIXELS====

        imgX = new ImageIcon(".\\game-of-the-old\\src\\all\\letra_49.png.jpg");
        imgO = new ImageIcon(".\\game-of-the-old\\src\\all\\letra_40.png.jpg");
        
//==== SCOREBOARD ====

        lb2.setText("(player 1)X = "+String.valueOf(d));   
        lb3.setText("(player 2)O = "+String.valueOf(f));

//====The logic for altern X and O or empty====        
        
//==== a11 , b11 ====

            if(e.getSource() == bt3){
                 a++;
                if(a%2==1){  
                    bt3.setIcon(imgX);
                    a11=1;
                }
                if((a%2==0)){
                    bt3.setIcon(imgO);
                    b11=1;
                }
                bt3.setEnabled(false);
            }

//==== a12,b12 ====            
            
             if(e.getSource() == bt4){
                 a++;
                if(a%2==1)  {
                    bt4.setIcon(imgX); 
                    a12=1;
                }
                if((a%2==0)){
                    bt4.setIcon(imgO);
                    b12=1;
                }
                bt4.setEnabled(false);
            }

//==== a13,b13 ====             
             
            if(e.getSource() == bt5){
                a++;
                if(a%2==1)  {
                    bt5.setIcon(imgX); 
                    a13=1;
                }
                if((a%2==0)){
                    bt5.setIcon(imgO);
                    b13=1;
                }
                bt5.setEnabled(false);
            }
                   
//==== a21,b21 ====            
            
            if(e.getSource() == bt6){
                a++;
                if(a%2==1)  {
                    bt6.setIcon(imgX);
                    a21=1;
                    a21=0;
                }
                if((a%2==0)){
                    bt6.setIcon(imgO);
                    b21=1;
                    
                }
                bt6.setEnabled(false);
            }
                
//==== a22,b22 ====            
            
            if(e.getSource() == bt7){
                a++;
                if(a%2==1)  {
                    bt7.setIcon(imgX); 
                    a22=1;
                }
                if((a%2==0)){
                    bt7.setIcon(imgO);
                    b22=1;
                }
                bt7.setEnabled(false);
            }
            
//==== a23,b23 ====            
            
            if(e.getSource() == bt8){
                a++;
                if(a%2==1){
                    bt8.setIcon(imgX); 
                    a23=1;
               }
                if((a%2==0)){
                    bt8.setIcon(imgO);
                    b23=1;
                 } 
                bt8.setEnabled(false);
            }
            
//==== a31,b31 ====            
            
            if(e.getSource() == bt9){
                a++;
                if(a%2==1)  {
                    bt9.setIcon(imgX); 
                    a31=1;
                }
                if((a%2==0)){
                    bt9.setIcon(imgO);
                    b31=1;
                }
                bt9.setEnabled(false);
            }
         
//==== a32,b32 ====            
            
            if(e.getSource() == bt10){
                a++;
                if(a%2==1)  {
                    bt10.setIcon(imgX); 
                    a32=1;
                }
                if((a%2==0)){
                    bt10.setIcon(imgO);
                    b32=1;
                }
                bt10.setEnabled(false);
            }
            
//==== a33,b33 ====            
            
            if(e.getSource() == bt11){
                a++;
                if(a%2==1)  {
                    bt11.setIcon(imgX); 
                    a33=1;
                }
                if((a%2==0)){
                    bt11.setIcon(imgO);
                    b33=1;
                }
                bt11.setEnabled(false);
            }
  
//==== End logic ====            

//==== Test for to know what the winner ====
            
            if((a11==1)&&(a12==1)&&(a13==1)){
                d++;
                lb2.setText("(player 1)X = "+String.valueOf(d));
                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);  
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);  
                
                a=0;
            }
            
            else if((a21==1)&&(a22==1)&&(a23==1)){
                d++;
                lb2.setText("(player 1)X = "+String.valueOf(d));
                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);    
                a=0;
            }
            
            else if((a31==1)&&(a32==1)&&(a33==1)){
                d++;
                lb2.setText("(player 1)X = "+String.valueOf(d));
                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);   
                a=0;
            }
            
            else if((a11==1)&&(a21==1)&&(a31==1)){
                d++;
                lb2.setText("(player 1)X = "+String.valueOf(d));
                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);       
                a=0;
            }
            
            else if((a12==1)&&(a22==1)&&(a32==1)){
                d++;
                lb2.setText("(player 1)X = "+String.valueOf(d));
                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);  
                a=0;
            }
            
            else if((a13==1)&&(a23==1)&&(a33==1)){
                d++;
                lb2.setText("(player 1)X = "+String.valueOf(d));
                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);   
                a=0;
            } 
            
            else if((a11==1)&&(a22==1)&&(a33==1)){
                d++;
                lb2.setText("(player 1)X = "+String.valueOf(d));
                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null); 
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);  
                a=0;
            }
            
            else if((a13==1)&&(a22==1)&&(a31==1)){
                d++;
                lb2.setText("(player 1)X = "+String.valueOf(d));
                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);   
                a=0;
            }            

            else if((b11==1)&&(b12==1)&&(b13==1)){
                f++;
                lb3.setText("(player 2)O = "+String.valueOf(f));
                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null); 
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);  
                a=0;
            }
            
            else if((b21==1)&&(b22==1)&&(b23==1)){
                f++;
                lb3.setText("(player 2)O = "+String.valueOf(f));
                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);   
                a=0;
            }
            
            else if((b31==1)&&(b32==1)&&(b33==1)){
                f++;
                lb3.setText("(player 2)O = "+String.valueOf(f));
                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);   
                a=0;
            }
            
            else if((b11==1)&&(b21==1)&&(b31==1)){
                f++;
                lb3.setText("(player 2)O = "+String.valueOf(f));
                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);  
                a=0;
            }
            
            else if((b12==1)&&(b22==1)&&(b32==1)){
                f++;
                lb3.setText("(player 2)O = "+String.valueOf(f));
                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null); 
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);  
                a=0;
            }
            
            else if((b13==1)&&(b23==1)&&(b33==1)){
                f++;
                lb3.setText("(player 2)O = "+String.valueOf(f));
                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);  
                a=0;
            } 
            
            else if((b11==1)&&(b22==1)&&(b33==1)){
                f++;
                lb3.setText("(player 2)O = "+String.valueOf(f));
                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);   
                a=0;
            }
            
            else if((b13==1)&&(b22==1)&&(b31==1)){
                f++;
                lb3.setText("(player 2)O = "+String.valueOf(f));
                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu!!!!!!!!");           
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);   
                a=0;
            }  
            else if(a == 9){
                JOptionPane.showMessageDialog(null,"Ninguem Venceu!!!!!!!!"); 
                a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
                b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
                bt3.setIcon(null);
                bt4.setIcon(null);
                bt5.setIcon(null);
                bt6.setIcon(null);
                bt7.setIcon(null);
                bt8.setIcon(null);
                bt9.setIcon(null);
                bt10.setIcon(null);
                bt11.setIcon(null); 
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
                bt10.setEnabled(true);
                bt11.setEnabled(true);  
                a=0;
            }
            
            
//==== End of tester ====
                                
//==== Restart ==== 

        if(e.getSource() == bt1){
            a=0;
            a11=a12=a13=a21=a22=a23=a31=a32=a33=0;
            b11=b12=b13=b21=b22=b23=b31=b32=b33=0;
            bt3.setIcon(null);
            bt4.setIcon(null);
            bt5.setIcon(null);
            bt6.setIcon(null);
            bt7.setIcon(null);
            bt8.setIcon(null);
            bt9.setIcon(null);
            bt10.setIcon(null);
            bt11.setIcon(null);
            bt3.setEnabled(true);
            bt4.setEnabled(true);
            bt5.setEnabled(true);
            bt6.setEnabled(true);
            bt7.setEnabled(true);
            bt8.setEnabled(true);
            bt9.setEnabled(true);
            bt10.setEnabled(true);
            bt11.setEnabled(true);    
        }       
        
//==== Exit to game ====
        if(e.getSource() == bt2){ 
            tela.setVisible(false);
            tela.dispose();
            System.exit(0);
        }
        
    }//====End of the actions ====  
 
//==== Open the game,to active====

public static void main(String[] args) {

        new GameOfTheOld();

    }

}//==== End the program ===


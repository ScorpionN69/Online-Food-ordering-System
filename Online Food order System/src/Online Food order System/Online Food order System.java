/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agent47;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Md.Nazmul islam Nayeem
 */
//


public class Agent47 {
    
    static void application(){
    
        JFrame f = new JFrame("Online Food order System.");

        
        
        //testField
        JTextField tf = new JTextField();
        tf.setBounds(30,550,200, 30);
        tf.setText("Welcome to our Resturant.");
        
        JCheckBox chb1;
        JCheckBox chb2;
        JCheckBox chb3;
        JCheckBox chb4;
        JCheckBox chb5;
        JCheckBox chb6;
        JCheckBox chb7;
        JCheckBox chb8;
        JCheckBox chb9;
        JCheckBox chb10;
        JCheckBox chb11;
        JCheckBox chb12;
        JCheckBox chb13;
        JCheckBox chb14;
        JCheckBox chb15;
        JCheckBox chb16;
        JCheckBox chb17;
        chb1= new JCheckBox();
         chb2= new JCheckBox();
         chb3= new JCheckBox();
         chb4= new JCheckBox();
         chb5= new JCheckBox();
         chb6= new JCheckBox();
         chb7= new JCheckBox();
         chb8= new JCheckBox();
         chb9= new JCheckBox();
         chb10= new JCheckBox();
         chb11= new JCheckBox();
         chb12= new JCheckBox();
         chb13= new JCheckBox();
         chb14= new JCheckBox();
         chb15= new JCheckBox();
         chb16= new JCheckBox();
         chb17= new JCheckBox();
        
        JLabel l1 = new JLabel("F.r.i.e.n.d .s resturant");
        l1.setBounds(30,20,300, 50);
        JLabel l2 = new JLabel("welcome to our resturant.");
        l2.setBounds(30,30,300, 60);
        JLabel l3 = new JLabel("Our menu :");
        l3.setBounds(30,50,300, 80);
        chb1.setText("1.Kacchi                                    taka=210");
        chb1.setBounds(30,90,300, 100);
        chb2.setText("2.Beef khichuri                         taka=190");
        chb2.setBounds(30,120,300, 120);
        chb3.setText("3.Chicken khichuri                   taka=150");
        chb3.setBounds(30,180,300, 120);
        chb4.setText("4.Chicken khichuri                    taka=150");
        chb4.setBounds(30,240,300, 120);
        chb5.setText("5.Beef Biriyani                             taka=190");
        chb5.setBounds(30,300,300, 120);
        chb6.setText("6.Murog polao                              taka=150");
        chb6.setBounds(30,360,300, 120);
        chb7.setText("7.Fried-Rice+chicken+salad     taka=150");
        chb7.setBounds(30,420,300, 120);
        chb8.setText("8.Pizza large                                 taka=700");
        chb8.setBounds(30,480,300, 120);
        chb9.setText("9.Pasta                                           taka=150");
        chb9.setBounds(30,540,300, 260);
        chb10.setText("10.Chicken Shawrma                 taka=120");
        chb10.setBounds(30,600,300, 280);
        /*chb11.setText("11.Beef Burger                            taka=180");
        chb11.setBounds(30,660,300, 300);
        chb12.setText("12.Chichen Burger                      taka=130");
        chb12.setBounds(30,720,300, 320);
        chb13.setText("13.Beef sandwich                       taka=80");
        chb13.setBounds(30,780,300, 340);
        chb14.setText("16.Grill quater                               taka=90");
        chb14.setBounds(30,840,300, 360);
        chb15.setText("17.Lucchi                                       taka=10");
        chb15.setBounds(30,900,300,380);
        
        JLabel l18 = new JLabel("Food serial number :");
        l18.setBounds(30,220,300,400);  
        JTextField tf1 = new JTextField();
        tf1.setBounds(30,430,310,20);*/
        tf.setText("");
        JLabel l19 = new JLabel("Amount :");
        l19.setBounds(30,250,300,420);
        JTextField tf2 = new JTextField();
        tf2.setBounds(30,470,310,20);
        tf.setText("");
        
        JLabel l20 = new JLabel("Your phone number :");
        l20.setBounds(30,280,300,440);
        JTextField tf3 = new JTextField();
        tf3.setBounds(30,510,310,20);
        tf.setText("");
        JLabel l21 = new JLabel("Delivary Address :");
        l21.setBounds(30,310,300,460);
        JTextField tf4 = new JTextField();
        tf4.setBounds(30,550,310,20);
        tf.setText("");
        
        
        //button...
        JButton b = new JButton("Confirm");
        b.setBounds(130,600,100, 50);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tf.setText("Order confirmed..");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
                

        f.add(l1);
        f.add(l2);
        f.add(l3);
        //f.add(l4);
        f.add(chb1);
        f.add(chb2);
        f.add(chb3);
        f.add(chb4);
        f.add(chb5);
        f.add(chb6);
        f.add(chb7);
        f.add(chb8);
        f.add(chb9);
        f.add(chb10);
        f.add(chb11);
        f.add(chb12);
        f.add(chb13);
        f.add(chb14);
        f.add(chb15);
        f.add(chb16);
        f.add(chb17);
        //f.add(l18);
        f.add(l19);
        f.add(l20);
        f.add(l21);
        //f.add(l28);
       // f.add(tf);
      //  f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(b);
        
        //higth ,width 
        f.setSize(900,900);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
}
    
    public static void main(String[] args) {
       
        application();
    }
    
}

package com.mycompany.convertor;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Convertor implements ActionListener {

    JTextField a, b;
    JButton a1, a2, a3, a4, a5;
    String Temperature[] = {"Celcius", "fernahait", "kelvin"};
    JComboBox cm;

    public Convertor() {

        JFrame s = new JFrame();
        a = new JTextField();
        a.setBounds(150, 200, 200, 40);
        b = new JTextField();
        b.setBounds(150, 250, 200, 40);

        cm = new JComboBox(Temperature);
        cm.setBounds(150, 170, 90, 20);
        a1 = new JButton("Cerlcius");
        a1.setBounds(150, 300, 90, 40);
        a2 = new JButton("fernahait");
        a2.setBounds(260, 300, 90, 40);
        a3 = new JButton("kelvin");
        a3.setBounds(150, 350, 90, 40);
        a4 = new JButton("clear");
        a4.setBounds(260, 350, 90, 40);
        

        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        a4.addActionListener(this);
      
        cm.addActionListener(this);

        s.add(cm);
        s.add(a);
        s.add(b);
        s.add(a1);
        s.add(a2);
        s.add(a3);
        s.add(a4);
        

        s.setSize(500, 500);
        s.setLayout(null);
        s.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        String s1 = a.getText();
        double x = Integer.parseInt(s1);
        double y = 0;
        String chosenName = (String) cm.getSelectedItem();
        System.out.println(chosenName);
        if (chosenName == "Celcius") {

            if (e.getSource() == a1) {

                y = 0;

            }
            if (e.getSource() == a2) {

                y = ((x * 9) / 5) + 32;

            }
            if (e.getSource() == a3) {

                y = x + 273.15;
            }
            

            String result = String.valueOf(y);
            b.setText(result);
        }
         if (chosenName == "fernahait") {

            if (e.getSource() == a1) {

                y = (x-32)*5/9 ;

            }
            if (e.getSource() == a2) {

                    y = 0;

            }
            if (e.getSource() == a3) {

                y =  (x-32)*5/9 + 273.15;
            }
            

            String result = String.valueOf(y);
            b.setText(result);
        }
        if (e.getSource() == a4) {
            a.setText(" ");
            b.setText(" ");
        }
          if (chosenName == "kelvin") {

            if (e.getSource() == a1) {

                y = x-273.15 ;

            }
            if (e.getSource() == a2) {

                    y = (x-273.15)*9/5 + 32;

            }
            if (e.getSource() == a3) {

                 y = 0;
            }
            

            String result = String.valueOf(y);
            b.setText(result);
        }
        if (e.getSource() == a4) {
            a.setText(" ");
            b.setText(" ");
        }

    }

    public static void main(String[] args) {
        new Convertor();
    }
}

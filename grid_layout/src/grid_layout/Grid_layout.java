/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grid_layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author an
 */
public class Grid_layout extends JFrame{
    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");
    JButton b3 = new JButton("b3");
    JButton b4 = new JButton("b4");
    JButton b5 = new JButton("b5");

    public Grid_layout(){
        this.setTitle("dit me cuoc doi");
        this.setSize(300, 400);
        //this.add(new JLabel("Hello"));
        this.setLayout(new GridLayout(2,2));
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        //this.add(b5, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Grid_layout();
    }
    
}

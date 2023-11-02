/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package border_layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author an
 */
public class Border_layout extends JFrame{
    
    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");
    JButton b3 = new JButton("b3");
    JButton b4 = new JButton("b4");
    JButton b5 = new JButton("b5");
    
    public Border_layout() {
        this.setTitle("dit me cuoc doi");
        this.setSize(300, 400);
        this.add(new JLabel("Hello"));
        this.setLayout(new BorderLayout());
        this.add(b1, BorderLayout.NORTH);
        this.add(b2, BorderLayout.SOUTH);
        this.add(b3, BorderLayout.EAST);
        this.add(b4, BorderLayout.WEST);
        this.add(b5, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Border_layout();
        
    }
    
}

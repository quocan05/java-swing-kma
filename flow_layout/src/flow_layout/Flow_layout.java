/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flow_layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author an
 */
public class Flow_layout extends JFrame{

    /**
     * @param args the command line arguments
     */
    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");
    JButton b3 = new JButton("b3");
    JButton b4 = new JButton("b4");
    JButton b5 = new JButton("b5");
    
    public Flow_layout(){
        this.setLayout(new FlowLayout(100,10,10));
        this.setSize(300,400);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Flow_layout();
             
    }
    
}

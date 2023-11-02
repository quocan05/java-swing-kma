/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpanel_example;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author an
 */
public class Jpanel_example extends JFrame {

    JPanel panel1 = new JPanel(new GridLayout(1, 0));
    JButton b1 = new JButton("one");
    JButton b2 = new JButton("two");
    JPanel panel2 = new JPanel(new GridLayout(1, 0));
    JButton b3 = new JButton("three");
    JPanel panel3 = new JPanel();
    JButton b4 = new JButton("four");
    JButton b5 = new JButton("five");

    /**
     * @param args the command line arguments
     */
    public Jpanel_example() {
        this.setSize(300, 200);
        this.setLayout(new GridLayout(3, 0));
        panel1.add(b1);
        panel1.add(b2);
        panel2.add(b3);
        panel3.add(b4);
        panel3.add(b5);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        new Jpanel_example();
    }

}

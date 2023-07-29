import java.awt.*;
import javax.swing.*;

public class _2{
    public static void main(String[] args){
        JFrame f = new JFrame("Good thing I studied");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 900);
        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");
        JButton b6 = new JButton("Button6");
        JButton b7 = new JButton("Button7");
        JLabel label = new JLabel("Input Data Here:");
        JTextField textField = new JTextField();
        textField.setSize(200, 100);
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel2.setSize(500,600);
        panel2.setLayout(new GridLayout(2,2));
        
        panel1.setSize(500, 100);
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);

        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);

        panel3.add(label);
        panel3.add(textField);

        f.add(panel1,BorderLayout.NORTH);
        f.add(panel2,BorderLayout.CENTER);
        f.add(panel3,BorderLayout.SOUTH);
        
        f.setVisible(true);
    }
}

























































//Made by Aniketh Vijesh 

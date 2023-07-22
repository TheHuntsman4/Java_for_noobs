import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class _5 {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,400);
        
        JButton b1 = new JButton("Now Playing");
        JButton b2 = new JButton("Media Guide");
        JButton b3 = new JButton("Library");
        JButton b4 = new JButton("Help & Info");
        JButton b5 = new JButton("Services");
        
        JButton b6 = new JButton("0");
        JButton b7 = new JButton("1");
        JButton b8 = new JButton("2");
        JButton b9 = new JButton("3");
        JButton b10 = new JButton("OK");
        JTextArea textarea = new JTextArea(400,200);


        JRadioButton radio1 = new JRadioButton("Movies");
        JRadioButton radio2 = new JRadioButton("Music");
        JRadioButton radio3 = new JRadioButton("Videos");
        JRadioButton radio4 = new JRadioButton("DVD");
        JRadioButton radio5 = new JRadioButton("Web Pages");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel31 = new JPanel();
        JPanel radioPanel = new JPanel();

        panel1.setLayout(new BoxLayout(panel1 ,BoxLayout.Y_AXIS));
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);
        panel1.add(b5);

        panel2.add(textarea);

        panel31.setLayout(new GridLayout(2,2));
        panel31.add(b6);
        panel31.add(b7);
        panel31.add(b8);
        panel31.add(b9);

        panel3.setLayout(new BoxLayout(panel3 ,BoxLayout.Y_AXIS));
        panel3.add(panel31,BorderLayout.NORTH);
        panel3.add(b10,BorderLayout.SOUTH);

        radioPanel.add(radio1);
        radioPanel.add(radio2);
        radioPanel.add(radio3);
        radioPanel.add(radio4);
        radioPanel.add(radio5);
        
        f.add(panel1,BorderLayout.WEST);
        f.add(panel2,BorderLayout.CENTER);
        f.add(panel3,BorderLayout.EAST);
        f.add(radioPanel,BorderLayout.SOUTH);

        f.setVisible(true);
    }
}










































//Made by Aniketh Vijesh
import java.awt.*;
import javax.swing.*;

public class _4 {
    public static void main(String[] args){
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,300);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,2));
        JRadioButton radioButton1 = new JRadioButton("Huey");
        JRadioButton radioButton2 = new JRadioButton("Duey");
        JRadioButton radioButton3 = new JRadioButton("Louie");
        String[] comboItems =  {"Monospace","SansSerif","Serif"};
        JComboBox comboBox = new JComboBox<>(comboItems);
        comboBox.setSize(100,50);
        JLabel label = new JLabel("Louie");
        panel1.add(radioButton1);
        panel1.add(radioButton2);
        panel1.add(radioButton3);
        panel2.add(comboBox);
        panel2.add(label);
        
        f.add(panel1,BorderLayout.NORTH);
        f.add(panel2);
        f.setVisible(true);
    }
}

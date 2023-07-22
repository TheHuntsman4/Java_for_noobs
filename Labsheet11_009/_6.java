import java.awt.*;
import javax.swing.*;

public class _6 {
    public static void main(String[] args){
        JFrame f = new JFrame("335 is fun");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 300);
        
        JPanel parent = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        parent.setLayout(new BoxLayout(parent, BoxLayout.Y_AXIS));
        panel2.setLayout(new GridLayout(2,2));
        panel3.setLayout(new GridLayout(2, 2));
        panel4.setLayout(new GridLayout(1,3));
        
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        JLabel label1 = new JLabel("Label1");
        JLabel label2 = new JLabel("Label2");
        JLabel label3 = new JLabel("Label3");

        JTextField text = new JTextField(null, null, 300);
        
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);
        
        
        panel1.add(b1);
        panel1.add(panel2);
        panel1.add(b6);
        panel1.add(b7);

        panel3.add(b8);
        panel3.add(label3);
        panel3.add(b9);
        // panel3.add(label2);

        panel4.add(label1);
        panel4.add(text);
        panel4.add(label2);

        parent.add(panel1);
        parent.add(panel3);
        parent.add(panel4);
        f.add(parent);
        f.setVisible(true);
    }
    
}

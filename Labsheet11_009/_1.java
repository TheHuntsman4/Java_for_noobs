import javax.swing. *;
import java.awt. *;

public class _1 {
    public static void main(String[]args) {

        //Frame
        JFrame f = new JFrame("Layout Question");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        //Components
        JLabel label = new JLabel("Buttons");
        JButton b1 = new JButton("hi");
        JButton b2 = new JButton("long name");
        JButton b3 = new JButton("bye");
        JButton cancelButton = new JButton("Cancel");
        JButton b4 = new JButton("1");
        JButton b5 = new JButton("2");
        JButton b6 = new JButton("3");
        JButton b7 = new JButton("4");
        JButton b8 = new JButton("5");
        JButton b9 = new JButton("6");
        JButton b10 = new JButton("7");

        JCheckBox checkBox1 = new JCheckBox("Bold");
        JCheckBox checkBox2 = new JCheckBox("Italics");
        JCheckBox checkBox3 = new JCheckBox("Underline");
        JCheckBox checkBox4 = new JCheckBox("Strikeout");

        JPanel panel1 = new JPanel();
        JPanel checkBoxPanel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel21 = new JPanel();
        panel2.setLayout(new GridLayout(2,2));
        panel21.setLayout(new GridLayout(2,2));
        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.Y_AXIS));
        
        panel1.add(label);
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        
        checkBoxPanel.add(checkBox1);
        checkBoxPanel.add(checkBox2);
        checkBoxPanel.add(checkBox3);
        checkBoxPanel.add(checkBox4);

        panel21.add(b6);
        panel21.add(b7);
        panel21.add(b8);
        panel21.add(b9);

        panel2.add(b4);
        panel2.add(b5);
        panel2.add(panel21);
        panel2.add(b10);
        
        f.add(panel1, BorderLayout.NORTH);
        f.add(checkBoxPanel, BorderLayout.WEST);
        f.add(cancelButton, BorderLayout.SOUTH);
        f.add(panel2,BorderLayout.CENTER);
        f.setVisible(true);
    }
}
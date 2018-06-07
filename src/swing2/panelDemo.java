package swing2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class panelDemo extends JFrame {

    private Container c;
    private JButton btn1, btn2,btn3;
    private JPanel panel1, panel2;

    panelDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setBounds(100, 100, 770, 500);
        this.setTitle("Panel Demo");

        c = this.getContentPane();
        c.setLayout(null);

        panel1 = new JPanel();
        panel1.setBounds(50, 50, 300, 300);
        panel1.setBackground(Color.GREEN);
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(355, 50, 300, 300);
        panel2.setBackground(Color.BLUE);
        c.add(panel2);

        btn1 = new JButton("Button1");
        btn2 = new JButton("Button2");
        btn3 = new JButton("Button3");

        panel1.add(btn1);
        panel2.add(btn2);
        panel1.add(btn3);

    }

    public static void main(String[] args) {
        panelDemo frame = new panelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

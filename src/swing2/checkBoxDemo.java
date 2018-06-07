package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class checkBoxDemo extends JFrame {

    private Container c;
    private JCheckBox javaCheckBox, cCheckBox, phpCheckBox;
    private ButtonGroup bgp;
    private Font f;
    private JLabel label;

    checkBoxDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setBounds(200, 50, 500, 400);
        this.setTitle("Check Box");

        bgp = new ButtonGroup();
        f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        javaCheckBox = new JCheckBox("Java");
        javaCheckBox.setBounds(30, 50, 100, 50);
        javaCheckBox.setFont(f);
        c.add(javaCheckBox);

        cCheckBox = new JCheckBox("C");
        cCheckBox.setBounds(30, 100, 100, 50);
        cCheckBox.setFont(f);
        c.add(cCheckBox);

        phpCheckBox = new JCheckBox("PHP");
        phpCheckBox.setBounds(30, 150, 100, 50);
        phpCheckBox.setFont(f);
        c.add(phpCheckBox);

        bgp.add(javaCheckBox);
        bgp.add(cCheckBox);
        bgp.add(phpCheckBox);

        label = new JLabel("You haven't selected anything..");
        label.setBounds(20, 250, 300, 50);
        label.setFont(f);
        c.add(label);

        Handler handler = new Handler();
        javaCheckBox.addItemListener(handler);
        cCheckBox.addItemListener(handler);
        phpCheckBox.addItemListener(handler);

    }

    class Handler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == javaCheckBox) {
                label.setText("You have selected Java");
            } else if (e.getSource() == cCheckBox) {
                label.setText("You have Selected C");
            } else {
                label.setText("You have Selected PHP");
            }
        }

    }

    public static void main(String[] args) {
        checkBoxDemo frame = new checkBoxDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

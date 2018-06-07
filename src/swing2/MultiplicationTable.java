package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiplicationTable extends JFrame {

    private Container c;
    private JLabel imgLabel, textLabel;
    private JTextArea ta;
    private JButton clear;
    private JTextField tf;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;

    MultiplicationTable() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        img = new ImageIcon(getClass().getResource("mul.jpg"));
        f = new Font("Arial", Font.BOLD, 19);
        cursor = new Cursor(Cursor.HAND_CURSOR);

        imgLabel = new JLabel(img);
        imgLabel.setBounds(20, 20, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        textLabel = new JLabel("Enter any Number : ");
        textLabel.setBounds(20, 250, 250, 30);
        textLabel.setFont(f);
        textLabel.setForeground(Color.MAGENTA);
        c.add(textLabel);

        tf = new JTextField();
        tf.setBounds(230, 250, 90, 40);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f);
        tf.setBackground(Color.GREEN);
        c.add(tf);

        clear = new JButton("Clear");
        clear.setBounds(230, 300, 90, 40);
        clear.setCursor(cursor);
        clear.setBackground(Color.GREEN);
        c.add(clear);

        ta = new JTextArea();
        ta.setBounds(20, 350, 300, 300);
        ta.setBackground(Color.GREEN);
        ta.setFont(f);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        c.add(ta);

        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String value = tf.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter Any Number");
                } else {
                    ta.setText("");
                    int num = Integer.parseInt(tf.getText());
                    for (int i = 1; i <= 10; i++) {

                        int result = num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String incr = String.valueOf(i);

                        ta.append(n + " X " + i + " = " + r + "\n");

                    }

                }

            }

        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setText(" ");

            }

        });

    }

    public static void main(String[] args) {

        MultiplicationTable frame = new MultiplicationTable();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 20, 360, 700);
        frame.setTitle("Multiplication Table");

    }
}

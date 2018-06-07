package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class textFiledDemo extends JFrame {
    private Container c;
    private JTextField tf1,tf2;
    private Font f;
    
    textFiledDemo(){
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        
        
        f = new Font("Arial",Font.ITALIC + Font.BOLD,18);
        
        
        tf1 = new JTextField();
        tf1.setBounds(50,30,300,50);
        tf1.setFont(f);
        tf1.setForeground(Color.red);
        tf1.setBackground(Color.GREEN);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
        
        
        tf2 = new JTextField();
        tf2.setBounds(50,90,300,50);
        tf2.setFont(f);
        tf2.setForeground(Color.red);
        tf2.setBackground(Color.GREEN);
        c.add(tf2);
    }
    
    public static void main(String[] args) {
        textFiledDemo frame = new textFiledDemo();
        frame.setVisible(true);
        frame.setBounds(200,50,500,400);
        frame.setBackground(Color.RED);
        frame.setTitle("TestField Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

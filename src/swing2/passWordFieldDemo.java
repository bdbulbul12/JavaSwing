package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class passWordFieldDemo extends JFrame {
    private Container c;
    private JPasswordField pf;
    private Font f;
    
    
    passWordFieldDemo(){
    
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        f = new Font("Arial",Font.BOLD,18);
        
        pf= new JPasswordField();
        pf.setBounds(50,30,150,30);
        pf.setEchoChar('*');
        pf.setFont(f);
        pf.setForeground(Color.red);
        pf.setBackground(Color.yellow);
        c.add(pf);
        
        
        
    }
    public static void main(String[] args) {
        
        passWordFieldDemo frame = new passWordFieldDemo();
        frame.setVisible(true);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Password Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

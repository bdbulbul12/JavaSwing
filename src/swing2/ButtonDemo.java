package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ButtonDemo extends JFrame{
    private Container c;
    private JButton btn1,btn2;
    private Font f;
    private Cursor cursor;
    private ImageIcon img1,img2;
    
    ButtonDemo(){
        initComponents();
    }
    public void  initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        
        f = new Font("Arial",Font.BOLD,18);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        img1 = new ImageIcon(getClass().getResource("i.jpg"));
        
       
        btn1 = new JButton(img1  );
        btn1.setBounds(100,50,150,50);
        btn1.setFont(f);
        btn1.setCursor(cursor);
        c.add(btn1);
        
        
        
        btn2 = new JButton("Clear");
        btn2.setBounds(310,50,100,50);
        btn2.setFont(f);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.blue);
        btn2.setCursor(cursor);
        c.add(btn2);
        
    }
    public static void main(String[] args) {
        
        ButtonDemo frame = new ButtonDemo();
        frame.setVisible(true);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Password Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

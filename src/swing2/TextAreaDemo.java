
package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextAreaDemo extends JFrame{
    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane scroll;
    
    TextAreaDemo(){
        initComponents();
    }
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        
        f = new Font("arial",Font.BOLD,18);
        
        ta = new JTextArea("This is text Area ");
        
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setFont(f);
        c.add(ta);
        
        scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(30,20,300,200);
        c.add(scroll);
    }
    public static void main(String[] args) {
        TextAreaDemo ta = new TextAreaDemo();
        ta.setVisible(true);
        ta.setBounds(100,50,500,400);
        ta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

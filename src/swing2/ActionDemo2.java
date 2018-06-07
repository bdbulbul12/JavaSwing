package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class ActionDemo2 extends JFrame {
    
    private Container c;
    private JButton btn;
    private JTextField tf;
    
    ActionDemo2(){
        initComponents();
    }
    public void  initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        
       tf = new JTextField();
       tf.setBounds(50,30,100,30);
       c.add(tf);
       
       btn = new JButton("Clear");
       btn.setBounds(60,70,70,30);
       c.add(btn);
       
       btn.addActionListener(new ActionListener(){
       
           public void actionPerformed(ActionEvent e){
           
               tf.setText("");
           }
        
       });
       
       
    }
    public static void main(String[] args) {
        
        ActionDemo2 frame = new ActionDemo2();
        frame.setVisible(true);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Buuton Action");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

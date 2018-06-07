
package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class comboBoxDemo  extends JFrame{
    private Container c;
    private JComboBox cb;
    private String[]proLanguage = {"Select One","C","C++","JAVA","PHP","Paython"};
    private JLabel label;
    private JButton btn;
    private Font f;
    
    
    comboBoxDemo(){
        initComponents();
    }
       public void initComponents(){
           this.setBounds(100,50,500,400);
           this.setTitle("ComboBox");
           
           f = new Font("Arial",Font.ITALIC+Font.BOLD,18);
           
           c=this.getContentPane();
           c.setLayout(null);
           c.setBackground(Color.blue);
           
           cb = new JComboBox(proLanguage);
           cb.setBounds(50,50,250,40);
           c.add(cb);
           
           label = new JLabel();
           label.setBounds(20,200,350,50);
           c.add(label);
           
           btn = new JButton("Show");
           btn.setBounds(50,100,80,50);
           c.add(btn);
           
           
           btn.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e) {
                   
                   
                   String s = cb.getSelectedItem().toString();
                   label.setText("You Have Selected : "+s);
                   label.setFont(f);
                   label.setForeground(Color.red);
               }
               
           
           });
       }
    public static void main(String[] args) {
        comboBoxDemo frame = new comboBoxDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

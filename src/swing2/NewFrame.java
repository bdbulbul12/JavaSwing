
package swing2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewFrame extends JFrame{
    private Container c;
    private JLabel label;
    
    NewFrame(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(420,50,400,300);
        this.setTitle("Open New Frame");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        
        label = new JLabel("Welcome to the new JFrame");
        label.setBounds(50,50,250,50);
        c.add(label);
        
        
        
    }
    
    public static void main(String[] args) {
        NewFrame fr = new NewFrame();
        fr.setVisible(true);
    }
}

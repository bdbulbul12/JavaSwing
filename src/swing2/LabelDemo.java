
package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo extends JFrame {
    
    private Container c;
    private JLabel userlabel,passLabel;
    private Font f;
    LabelDemo(){
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY); 
        f = new Font("arial",Font.BOLD,15);
        
        
        userlabel = new JLabel();
        userlabel.setText("Enter Your Name : ");
        userlabel.setBounds(50,20,200,50);
        userlabel.setFont(f);
        userlabel.setBackground(Color.CYAN);
        userlabel.setOpaque(true);
        userlabel.setToolTipText("Enter Your Name");
        c.add(userlabel);
       
        String s = userlabel.getToolTipText();
        System.out.println("THe Tool tip text is : "+s);
        
        
        passLabel = new JLabel("Enter Your Password : ");
        passLabel.setBounds(50,80,200,50);
        passLabel.setFont(f);
        passLabel.setForeground(Color.lightGray);
        c.add(passLabel);
        
        
    }
    
    public static void main(String[] args) {
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Label Demo");
        
    }
}

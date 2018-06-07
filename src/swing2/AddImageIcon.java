
package swing2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class AddImageIcon extends JFrame {
    
        private Container c;
        private JLabel imgLabel;
        private ImageIcon img;
        
    
    AddImageIcon(){
        initComponents();
          
    }
    public void initComponents(){
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        img = new ImageIcon(getClass().getResource("logo.png"));
        imgLabel = new JLabel("Ict Training Center Logo ",img,JLabel.LEFT);
        
        imgLabel.setBounds(50,50,250,90);
        c.add(imgLabel);
      
        
    }
    public static void main(String[] args) {
        AddImageIcon frame = new AddImageIcon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Set Image Icon");
    }
}


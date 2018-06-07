/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing2;
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DemoFrame extends JFrame {
    
    private ImageIcon icon;
    private Container c;
    DemoFrame(){
        
        initComponentt();
    }
    public void initComponentt(){
        icon = new ImageIcon(getClass().getResource("logo.png"));
        this.setIconImage(icon.getImage());
        c = this.getContentPane();
        c.setBackground(Color.red);
    }  
    
    public static void main(String[] args) {
        
        
        DemoFrame frame = new DemoFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setLocation(200,50);
       // frame.setSize(400,300);
       frame.setBounds(200,50,400,300);
        frame.setTitle("Demo Frame");
        frame.setResizable(false);
                
                
    }
}

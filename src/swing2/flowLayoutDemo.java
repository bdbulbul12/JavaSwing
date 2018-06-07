
package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class flowLayoutDemo extends JFrame{
    private Container c;
    private JButton buttons[];
    private FlowLayout fLayout;
    
    flowLayoutDemo(){
        this.setBounds(100,100,500,500);
        this.setTitle("FLoaw Layout ");
        
        c=this.getContentPane();
        fLayout = new FlowLayout(FlowLayout.LEFT,15,20);
        c.setLayout(fLayout);
        c.setBackground(Color.BLUE);
        
        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            
            buttons[i]= new JButton(""+(i+1));
            c.add(buttons[i]);
        }
        
        
        
        
    }
    
    public static void main(String[] args) {
        flowLayoutDemo frame = new flowLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

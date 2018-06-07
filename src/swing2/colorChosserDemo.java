
package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class colorChosserDemo extends JFrame{
    private Container c;
    private JButton btn;
    
    colorChosserDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setBounds(100,100,400,400);
        this.setTitle("colorChosser Demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        
        btn = new JButton("Chose a color");
        btn.setBounds(50,50,150,50);
        c.add(btn);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null,"Select a Color",Color.YELLOW);
                c.setBackground(color);
            }
       
        });
    }
    
    public static void main(String[] args) {
        colorChosserDemo frame = new colorChosserDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


package swing2;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class gridLayoutDemo extends JFrame{
    private Container c;
    private JButton btn1,btn2,btn3,btn4;
    private GridLayout gl;
    gridLayoutDemo(){
        this.setBounds(100,100,500,500);
        this.setTitle("Grid Layout Demo");
        
        c= this.getContentPane();
        gl = new GridLayout(2,2,10,10);
        c.setLayout(gl);
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
         
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        
    }
    public static void main(String[] args) {
        gridLayoutDemo frame = new gridLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


package swing2;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;


public class borderLayoutDemo extends JFrame{
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private BorderLayout bLayout;
    
    borderLayoutDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setBounds(100,100,500,500);
        this.setTitle("BorderLayout");
        
        c=this.getContentPane();
        bLayout = new BorderLayout(10,10);
        c.setLayout(bLayout);
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        
        c.add(btn1,BorderLayout.NORTH);
        c.add(btn2,BorderLayout.SOUTH);
        c.add(btn3,BorderLayout.CENTER);
        c.add(btn4,BorderLayout.WEST);
        c.add(btn5,BorderLayout.EAST);
    }
    
    public static void main(String[] args) {
        borderLayoutDemo frame = new borderLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

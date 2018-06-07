
package swing2;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class cardLayoutDemo extends JFrame implements ActionListener{
    private Container c;
    private JButton btn1,btn2,btn3;
    private CardLayout cl;
    cardLayoutDemo(){
        this.setBounds(100,100,500,500);
        this.setTitle("Card Layout");
        
        c=this.getContentPane();
        cl = new CardLayout();
        c.setLayout(cl);
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       cl.next(c);
    }
    
    
    public static void main(String[] args) {
        cardLayoutDemo frame = new cardLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
}

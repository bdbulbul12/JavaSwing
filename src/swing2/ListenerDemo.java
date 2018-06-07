
package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ListenerDemo extends JFrame implements ActionListener{
    private Container c;
    private JButton red,green,blue;
    
    ListenerDemo(){
        initComponents();
    }
    
    public void initComponents(){
      this.setBounds(50,50,500,400);
      this.setTitle("AddAction 3rd Method");
      
      c=this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.GRAY);
      
      red = new JButton("Red");
      red.setBounds(50,20,100,40);
      c.add(red);
      
      green = new JButton("Green");
      green.setBounds(50,70,100,40);
      c.add(green);
      
      blue = new JButton("Blue");
      blue.setBounds(50,120,100,40);
      c.add(blue);
      
      red.addActionListener(this);
      green.addActionListener(this);
      blue.addActionListener(this);
        
    }
    public static void main(String[] args) {
        ListenerDemo frame = new ListenerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==red){
            c.setBackground(Color.RED);
        }else if(e.getSource()==green){
            c.setBackground(Color.GREEN);
        }else{
            c.setBackground(Color.BLUE);
        }
    }
}


package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;


public class toggleBarDemo extends JFrame implements ActionListener{
    private Container c;
    private JToggleButton tb;
    private JLabel l;
    
    toggleBarDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setBounds(100,100,400,400);
        this.setTitle("Toggle Button");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        tb = new JToggleButton("OFF");
        tb.setBounds(50,50,250,50);
        c.add(tb);
        
        l = new JLabel("This Toggle Button");
        l.setVisible(false);
        l.setBounds(50,110,150,50);
        c.add(l);
        
        tb.addActionListener(this);
        
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(tb.isSelected()){
            tb.setText("ON");
            l.setVisible(true);
        }else{
            l.setVisible(false);
            tb.setText("OFF");
        }
    }

    public static void main(String[] args) {
        toggleBarDemo frame= new toggleBarDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
}

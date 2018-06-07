
package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class mouseListenerDemo extends JFrame {
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;
    mouseListenerDemo(){
        initComponents();
    }
    public void initComponents(){
    this.setBounds(100,100,350,500);
    this.setTitle("Mouse Listner");
    
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.red);
    
    tf = new JTextField();
    tf.setBounds(40,30,150,60);
    c.add(tf);
    
    ta = new JTextArea();
    ta.setLineWrap(true);
    ta.setWrapStyleWord(true);
    
    
    scroll = new JScrollPane(ta);
    scroll.setBounds(40,120,190,300);
    c.add(scroll);
    
    
    tf.addMouseListener(new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            ta.append("Mouse Clicked\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            ta.append("Mouse Pressed\n");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            ta.append("Mouse Realsed\n");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ta.append("Mouse Enterd\n");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ta.append("Mouse Exited\n");
        }
        

        
        
    });
    
    }
    public static void main(String[] args) {
        mouseListenerDemo frame = new mouseListenerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

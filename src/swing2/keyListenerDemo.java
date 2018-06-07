
package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class keyListenerDemo extends JFrame{
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    
    keyListenerDemo(){
        initComponents();
    }
    
    public void initComponents(){
    this.setBounds(50,50,450,450);
    this.setTitle("Key Listner DEmo");
    
    c=this.getContentPane();
    c.setLayout(null);
    
    
    tf = new JTextField();
    tf.setBounds(20,50,150,40);
    c.add(tf);
    
    ta = new JTextArea();
    ta.setBounds(5,110,300,200);
    ta.setBackground(Color.pink);
    c.add(ta);
        
    tf.addKeyListener(new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
            ta.append("you Typed: "+e.getKeyChar()+"\n");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            ta.append("you Pressed: "+e.getKeyChar()+"\n");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            ta.append("you Realesed: "+e.getKeyChar()+"\n");
        }
        
    });
    }
    public static void main(String[] args) {
        keyListenerDemo frame = new keyListenerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

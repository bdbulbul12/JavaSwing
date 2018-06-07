package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class focusListenerDemo extends JFrame {

    private Container c;
    private JButton btn;
    private JTextArea ta;
    private JScrollPane scroll;

    focusListenerDemo() {
        this.setBounds(200, 100, 500, 500);
        this.setTitle("Focus Listener Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);

        btn = new JButton("Button");
        btn.setBounds(50, 50, 90, 50);
        c.add(btn);
        
        ta = new JTextArea();
        
        scroll = new JScrollPane(ta);
        scroll.setBounds(150,50,300,150);
        c.add(scroll);
        
        btn.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                ta.setText("Focus Gained \n");
            }

            @Override
            public void focusLost(FocusEvent e) {
                ta.setText("Focus Lost\n");
            }
            
        });
        

    }

    public static void main(String[] args) {
        focusListenerDemo frame = new focusListenerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

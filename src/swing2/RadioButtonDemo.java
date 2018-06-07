
package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class RadioButtonDemo extends JFrame {
    private Container  c;
    private JRadioButton rd1,rd2;
    private ButtonGroup grp;
    private Font f;
    private TextArea ta;
    RadioButtonDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,400,350);
        this.setTitle("Radio Button");
        
        c=this.getContentPane();
        c.setBackground(Color.GRAY);
        c.setLayout(null);
        
        f = new Font("Arial",Font.BOLD,18);
        grp = new ButtonGroup();
        
        rd1 = new JRadioButton("Male");
        rd1.setBounds(30,20,80,30);
        rd1.setBackground(Color.GRAY);
        rd1.setFont(f);
        c.add(rd1);
        
        rd2 = new JRadioButton("Female");
        rd2.setBounds(120,20,110,30);
        rd2.setBackground(Color.GRAY);
        rd2.setFont(f);
        c.add(rd2);
        
        grp.add(rd1);
        grp.add(rd2);
        
        ta = new TextArea();
        ta.setBounds(20,90,270,200);
        ta.setFont(f);
        ta.setBackground(Color.GREEN);
        c.add(ta);
        
        
        Handler handler = new Handler();
        rd1.addActionListener(handler);
        rd2.addActionListener(handler);
        
        
    }
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(rd1.isSelected()){
                ta.append("You Have Selected Male\n");
            
            }else{
                ta.append("You have Selected Female");
            }
        }
        
    }
    
    public static void main(String[] args) {
        RadioButtonDemo frame = new RadioButtonDemo();
        frame.setVisible(true);
    }
}

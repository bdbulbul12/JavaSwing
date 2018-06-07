
package swing2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class TabbedPaneDEmo extends JFrame{
    private Container c;
    private JTabbedPane tp;
    private JLabel label1,label2,label3;
    private JPanel panel1,panel2,panel3;
    TabbedPaneDEmo(){
        initComponents();
    }
    public void initComponents(){
        this.setBounds(100,100,500,500);
        this.setTitle("TabbedPane Demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        
        tp = new JTabbedPane();
        tp.setBounds(50,50,300,300);
        c.add(tp);
        
        label1 = new JLabel("This is Label 1");
        label2 = new JLabel("This is Label 2");
        label3 = new JLabel("This is Label 3");         
        
        
        
        panel1 = new JPanel();
        panel1.add(label1);
        panel1.setBackground(Color.BLUE);
        panel2 = new JPanel();
        panel2.add(label2);
        panel2.setBackground(Color.ORANGE);
        panel3 = new JPanel();
        panel3.add(label3);
        panel3.setBackground(Color.red);
        
        tp.addTab("Home", panel1);
        tp.addTab("Edit", panel2);
        tp.addTab("Help", panel3);
        
        
    }
    public static void main(String[] args) {
        TabbedPaneDEmo frame = new TabbedPaneDEmo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

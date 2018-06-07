
package swing2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


public class spinnerDemo extends JFrame{
    private Container c;
    private JSpinner spinner;
    private JLabel label;
    spinnerDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setBounds(100,100,300,300);
        this.setTitle("Spinner Demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        SpinnerNumberModel value = new SpinnerNumberModel(10,0,20,1);// initial,min,maz,diff
        spinner = new JSpinner(value);
        spinner.setBounds(50,50,100,50);
        c.add(spinner);
        
        label = new JLabel();
        label.setBounds(100,200,150,50);
        c.add(label);
        
        
        
    }
    public static void main(String[] args) {
        spinnerDemo frame = new spinnerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

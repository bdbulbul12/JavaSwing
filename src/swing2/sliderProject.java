
package swing2;

import java.awt.Color;
import java.awt.Container;
import javafx.beans.value.ObservableValue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class sliderProject extends JFrame implements ChangeListener{
    private Container c;
    private JLabel redLabel,greenLabel,blueLabel,prevLabel;
    private JSlider redSlider,greenSlider,blueSlider;
    private JTextField redTf,greenTf,blueTf;
    private JPanel panel;
    sliderProject(){
        initComponents();
    }
    public void initComponents(){
        this.setBounds(100,100,800,350);
        this.setTitle("Slider Project");
        
        c=this.getContentPane();
        c.setLayout(null);
        
        redLabel = new JLabel("red");
        redLabel.setBounds(50,50,80,50);
        c.add(redLabel);
        
        redSlider = new JSlider(0,255,0);
        redSlider.setBounds(90,50,300,50);
        c.add(redSlider);
        
        redTf = new JTextField();
        redTf.setBounds(400,50,80,40);
        c.add(redTf);
        
        
        greenLabel = new JLabel("green");
        greenLabel.setBounds(50,110,80,50);
        c.add(greenLabel);
        
        greenSlider = new JSlider(0,255,0);
        greenSlider.setBounds(90,110,300,50);
        c.add(greenSlider);
        
        greenTf = new JTextField();
        greenTf.setBounds(400,110,80,40);
        c.add(greenTf);
        
        blueLabel = new JLabel("blue");
        blueLabel.setBounds(50,170,80,50);
        c.add(blueLabel);
        
        blueSlider = new JSlider(0,255,0);
        blueSlider.setBounds(90,170,300,50);
        c.add(blueSlider);
        
        blueTf = new JTextField();
        blueTf.setBounds(400,170,80,40);
        c.add(blueTf);
        
        panel = new JPanel();
        panel.setBounds(550,50,200,160);
        panel.setBackground(Color.pink);
        c.add(panel);
        
        prevLabel = new JLabel("Preview");
        prevLabel.setBounds(630,200,100,50);
        c.add(prevLabel);
        
        redSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
    }
    
   @Override
    public void stateChanged(ChangeEvent e) {
       int redValue=redSlider.getValue();
       int greenValue=greenSlider.getValue();
       int blueValue=blueSlider.getValue();
       
       redTf.setText(""+redValue);
       greenTf.setText(""+greenValue);
       blueTf.setText(""+blueValue);
       
       Color color = new Color(redValue,greenValue,blueValue);
       panel.setBackground(color);
        
    }
    
    public static void main(String[] args) {
        sliderProject frame = new sliderProject();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    

    
}

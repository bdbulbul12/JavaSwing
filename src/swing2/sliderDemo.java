package swing2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class sliderDemo extends JFrame {

    private Container c;
    private JSlider slider;

    sliderDemo() {
        initComponents();
    }

    public void initComponents() {
        this.setBounds(100, 100, 600, 300);
        this.setTitle("Slider ");

        c = this.getContentPane();
        c.setLayout(null);

        slider = new JSlider(0, 20, 0);
        slider.setBounds(100, 50, 300, 50);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        c.add(slider);

    }

    public static void main(String[] args) {
        sliderDemo frame = new sliderDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


package swing2;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class slideShow extends JFrame implements ActionListener{
    private Container c;
    private JButton next,prev;
    private JPanel panel;
    private ImageIcon icon;
    private JLabel label;
    private CardLayout card;
    slideShow(){
        initComponents();
        showImage();
        
    }
    
     public void showImage(){
        
        String[] imgNames={"1.jpg","2.jpg","3.jpg"};
        for (String n:imgNames) {
            icon = new ImageIcon("src/image/"+n);
            //Resizing Image
            Image img =icon.getImage();
            Image newImage=img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImage);
            
            label = new JLabel(icon);
            panel.add(label);
        }
        
        
    }
    public void initComponents(){
        this.setBounds(100,100,500,535);
        this.setTitle("SlideShow Demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        card = new CardLayout();
        
        panel = new JPanel(card);
        panel.setBounds(10,10,465,410);
        c.add(panel);
        
        prev = new JButton("Previous");
        prev.setBounds(10,430,100,50);
        c.add(prev);
        
        next = new JButton("Next");
        next.setBounds(376,430,100,50);
        c.add(next);
        
        prev.addActionListener(this);
        next.addActionListener(this);
    }
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==prev){ 
            
            card.previous(panel);
        }
        if(e.getSource()==next){
            card.next(panel);
        }
        
    }
    
    public static void main(String[] args) {
        slideShow frame = new slideShow();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
}


package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class vowelCounter extends JFrame{
    private Container c;
    private JLabel promtLabel,vowelLabel,aLabel,eLabel,iLabel,oLabel,uLabel;
    private JTextArea ta;
    
    int totalVowel = 0;
    int total_a=0;
    int total_e=0;
    int total_i=0;
    int total_o=0;
    int total_u=0;
    
    vowelCounter(){
        initComponents();
    }
    
    public void initComponents(){
        this.setBounds(100,100,600,500);
        this.setTitle("Vowel Count");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        promtLabel  = new JLabel("Enter the text :");
        promtLabel.setBounds(10,20,150,50);
        c.add(promtLabel);
        
        ta = new JTextArea();
        ta.setBounds(190,20,350,100);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        c.add(ta);
        
        vowelLabel = new JLabel();
        vowelLabel.setBounds(190,120,210,50);
        c.add(vowelLabel);
        
        aLabel = new JLabel();
        aLabel.setBounds(190,200,210,30);
        c.add(aLabel);
        
        eLabel = new JLabel();
        eLabel.setBounds(190,230,210,30);
        c.add(eLabel);
        
        iLabel = new JLabel();
        iLabel.setBounds(190,260,210,30);
        c.add(iLabel);
        
        oLabel = new JLabel();
        oLabel.setBounds(190,290,210,30);
        c.add(oLabel);
        
        uLabel = new JLabel();
        uLabel.setBounds(190,320,210,30);
        c.add(uLabel);
        
        
        ta.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                if(e.getSource()==ta){
                    if(e.VK_A==e.getKeyCode()){
                        total_a++;
                        totalVowel++;
                        
                    }
                    if(e.VK_E==e.getKeyCode()){
                        totalVowel++;
                        total_e++;
                    }
                    
                    if(e.VK_I==e.getKeyCode()){
                        totalVowel++;
                        total_i++;
                    }
                    
                    if(e.VK_O==e.getKeyCode()){
                        totalVowel++;
                        total_o++;
                    }
                    
                    if(e.VK_U==e.getKeyCode()){
                        totalVowel++;
                        total_u++;
                    }
                     
                
                }
                vowelLabel.setText("Total Number of vowels :"+totalVowel);
                aLabel.setText("Total Number of a :"+total_a);
                eLabel.setText("Total Number of e:"+total_e);
                iLabel.setText("Total Number of i :"+total_i);
                oLabel.setText("Total Number of o :"+total_o);
                uLabel.setText("Total Number of u :"+total_u);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
            
    });
    }
    public static void main(String[] args) {
        vowelCounter frame = new vowelCounter();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

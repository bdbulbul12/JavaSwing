package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javafx.scene.Cursor.cursor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
    private Container c;
    private JLabel userLabel,passwordLabel;
    private JTextField tf;
    private JButton Login,Clear;
    private JPasswordField pf;
    private Font f;
    private Cursor cursor;
    

    
       LoginFrame(){
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setBounds(50,30,550,400);
           this.setTitle("Login Registration Frame");
           
           c= this.getContentPane();
           c.setLayout(null);
           c.setBackground(Color.GRAY);
           
           Font f = new Font("Arial",Font.BOLD,16);
           
           cursor = new Cursor(Cursor.HAND_CURSOR);
           
           
           
           userLabel = new JLabel("UserName : ");
           userLabel.setBounds(30,30,100,40);
           userLabel.setFont(f);
           c.add(userLabel);
           
           tf= new JTextField();
           tf.setBounds(150,37,180,30);
           tf.setFont(f);
           c.add(tf);
           
           passwordLabel = new JLabel("Password : ");
           passwordLabel.setBounds(30,100,100,40);
           passwordLabel.setFont(f);     
           c.add(passwordLabel);
           
           pf = new JPasswordField();
           pf.setBounds(150,100,180,30);
           pf.setEchoChar('*');
           pf.setFont(f);
           c.add(pf);
           
           Login = new JButton("Login");
           Login.setBounds(150,150,80,50);
           Login.setCursor(cursor);
           c.add(Login);
           
           Clear = new JButton("Clear");
           Clear.setBounds(235,150,80,50);
           Clear.setCursor(cursor);
           c.add(Clear);
           
           
           
            Login.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e) {
                   String UserName = tf.getText();
                   String Password = pf.getText();
                   if(UserName.equals("Bulbul")&&(Password.equals("1234"))){
                       JOptionPane.showMessageDialog(null,"You are Successfully Login");
                       NewFrame fr = new NewFrame();
                       fr.setVisible(true);
                   
                   }else{
                            JOptionPane.showMessageDialog(null,"Your username or password did not match");
                       
                            }
                   
                   
               }
          
           
           
           });
           
           
           
           Clear.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e) {
                 tf.setText("");
                 pf.setText("");
                   
               }
          
           
           
           });
           
           
           
       }
    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        
    }
}

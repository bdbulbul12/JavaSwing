/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Bulbul
 */
public class Test3 extends JFrame {
    ImageIcon icon = new ImageIcon();
    Test3(){
        imageShow();
        
}
    public void imageShow(){
        icon = new ImageIcon(getClass().getResource("logo.png"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {
        Test3 frame = new Test3();
        frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Test 3");
    }
}

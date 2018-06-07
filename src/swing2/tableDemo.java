
package swing2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class tableDemo extends JFrame{
    private Container c;
    private JLabel label;
    private JScrollPane scroll;
    private JTable table;
    private Font f;
    private String[] cols={"ID","Name","CGPA"};
    private String[][] rows={
                                
                                {"101","BULBUL AHMED","3.94"},
                                {"102","Riad AHMED","3.94"},
                                {"103","Tamim AHMED","3.94"},
                                {"104","Sakib AHMED","3.94"}
    
                            };
    tableDemo(){
        initComponents();
    }
    public void initComponents(){
        this.setBounds(100,100,650,500);
        this.setTitle("Table Demo");
        
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        f = new Font("Arial",Font.BOLD,22);
        
        label = new JLabel("Student Details");
        label.setBounds(210,50,300,50);
        label.setFont(f);
        c.add(label);
        
        table = new JTable(rows,cols);
        table.setSelectionBackground(Color.YELLOW);
        
        scroll = new JScrollPane(table);
        scroll.setBounds(50,120,500,150);
        c.add(scroll);
        
        
    }
    
    public static void main(String[] args) {
        tableDemo frame =new tableDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

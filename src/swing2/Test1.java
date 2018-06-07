import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
 
 
public class Test1 extends Applet implements ActionListener,KeyListener  {
    // Constants for storing Prices
    private final int 
            small = 5,
            medium = 7,
            large = 9,
            extralarge=12,
            cheese=0,
            sausage=2,
            mushroom=2,
            pepper=2,
            chicken=2;
             
             
                          
    // Size //
    ButtonGroup sizeBGroup;
     
    JRadioButton smallJRadio,
                 mediumJRadio,
                 largeJRadio,
                 extralargeJRadio;
                  
    // toppings//
     
    JCheckBox cheeseJCheck,
              sausageJCheck,
              mushroomJCheck,
              pepperJCheck,
              chickenJCheck;
               
    // Labels//
     
    Label welcomeLabel,
          pizzasizeLabel,
          toppingLabel,
          priceLabel,
          pricedisplayLabel;
           
    // TextFields//
     
    TextField priceText,
              pizzaText;
     
    // Buttons//
     
    Button resetButton,orderButton;
     
     
    public void init() {
     
        setBackground(new Color(205,205,205));
        setLayout(new BorderLayout(0,0));
 
 
        // initilizing labels//
        welcomeLabel=new Label("Welcome to Mrjojo Pizza Menu");
        pizzasizeLabel=new Label("choose ur desired size");
        toppingLabel=new Label("choose ur desired topping");
        priceLabel=new Label("Your total amount is : $ "); 
        pricedisplayLabel=new Label("$ 0");
     
     
        // initilizing Text fields//
         
        pizzaText=new TextField("0",1);
     
        //initializing J Radio buttons//
         
        smallJRadio = new JRadioButton("Small", true);
        mediumJRadio = new JRadioButton("medium", false);
        largeJRadio = new JRadioButton("Large", false);
        extralargeJRadio = new JRadioButton("extra Large", false);
         
        // initializing Group radio buttons//
         
        sizeBGroup = new ButtonGroup();
        sizeBGroup.add(smallJRadio);
        sizeBGroup.add(mediumJRadio);
        sizeBGroup.add(largeJRadio);
        sizeBGroup.add(extralargeJRadio);
         
         
        // Initializing JCheckboxes
        cheeseJCheck = new JCheckBox("Extra Cheese",false);
        sausageJCheck = new JCheckBox("Sausage Slices",false);
        mushroomJCheck = new JCheckBox("Button Mushroom",false);
        pepperJCheck = new JCheckBox("Green Pepper",false);
        chickenJCheck = new JCheckBox("Chicken Nugget",false);
         
        // initializing buttons//
         
        orderButton=new Button("Order Now");
        resetButton=new Button("New form");
         
        // Add Action Listeners //
         
        smallJRadio.addActionListener(this);
        mediumJRadio.addActionListener(this);
        largeJRadio.addActionListener(this);
        extralargeJRadio.addActionListener(this);
         
        cheeseJCheck.addActionListener(this);
        sausageJCheck.addActionListener(this);
        mushroomJCheck.addActionListener(this);
        pepperJCheck.addActionListener(this);
        chickenJCheck.addActionListener(this);
         
         
        pizzaText.addKeyListener(this);
         
        orderButton.addActionListener(this);
    }
         
 
    // Unused interface methods
    public void keyTyped(KeyEvent e) { }
    public void keyPressed(KeyEvent e) { }
 
    /**
     * Perform validation check on user text input
     */
    public void keyReleased(KeyEvent e) { 
         
        // Trap all non-valid numbers
        try {
            Integer.parseInt(pizzaText.getText());
        }
        catch (NumberFormatException fe) {
            pizzaText.setText("0");
        }
         
        refreshPrice();
    }   
     
 
 
 
    public void actionPerformed(ActionEvent e){
                 
        if (e.getSource() == orderButton) {
                 
            JOptionPane.showMessageDialog(this,
                "Thank you for your " + 
                pricedisplayLabel.getText() + "  payment." +
                "\n\nYour pizza will be delivered to you in 3 months !" + 
                "\nWhy dont you order another pizza while waiting ?",
                "Orders Confirmed",
                JOptionPane.INFORMATION_MESSAGE);
        }
         
        refreshPrice();
    }
         
            private void refreshPrice() {
         
        // Local variables used to accumulate total price
        int price = 0;
        int pizzaAmount = Integer.parseInt(pizzaText.getText());
         
        // Pizza size prices
        if (smallJRadio.isSelected()) {
            price+= small * pizzaAmount;
        }
         
        if (mediumJRadio.isSelected()) {
            price+= medium * pizzaAmount;
        }
 
        if (largeJRadio.isSelected()) {
            price+= large * pizzaAmount;
        }
            if (largeJRadio.isSelected()) {
            price+= extralarge * pizzaAmount;
        }
         
         
        // Pizza topping prices
        if (cheeseJCheck.isSelected()) {
            price+= cheese * pizzaAmount;
        }
 
        if (sausageJCheck.isSelected()) {
            price+= sausage * pizzaAmount;
        }
 
        if (mushroomJCheck.isSelected()) {
            price+= mushroom * pizzaAmount;
        }
 
     
 
        if (pepperJCheck.isSelected()) {
            price+= pepper * pizzaAmount;
        }
 
        if (chickenJCheck.isSelected()) {
            price+= chicken* pizzaAmount;
        }
 
        pricedisplayLabel.setText("$"+(price));
         
         
 
         
        }
 
 
         
         
         
    }
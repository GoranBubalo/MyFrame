import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton humburgerButton;
    JRadioButton hotdogButton;
    ButtonGroup group;

    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());



        pizzaButton = new JRadioButton("pizza");
        humburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        ImageIcon pizzaIcon = new ImageIcon("pizza.png");
        ImageIcon hamburgerIcon = new ImageIcon("hamburger.png");
        ImageIcon hotdogIcon  = new ImageIcon("hotdog.png");

        group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(humburgerButton);
        group.add(hotdogButton);

        //Add it to our frame
        this.add(pizzaButton);
        this.add(humburgerButton);
        this.add(hotdogButton);

        pizzaButton.addActionListener(this);
        humburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);


        pizzaButton.setIcon(pizzaIcon);
        humburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);



        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == pizzaButton){
            System.out.println("You ordered a Pizza");
        } else if (e.getSource()== humburgerButton) {
            System.out.println("You ordered a Hamburger");
        } else if (e.getSource()== hotdogButton) {
            System.out.println("You ordered a Hot-dog");
        }
    }
}

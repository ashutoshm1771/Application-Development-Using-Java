// Author : Ashutosh Mishra

import java.awt.*;
import javax.swing.*;
public class gridbagdemo extends JFrame
{
   public gridbagdemo()
   {
        GridBagConstraints gbc=new GridBagConstraints();
        setTitle("GridBag Layout example");
        GridBagLayout layout=new GridBagLayout();
        this.setLayout(layout);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.ipady=40;
        gbc.gridx=0;
        gbc.gridy=0;
        this.add(new Button("Button one"),gbc);
        gbc.gridx=1;
        gbc.gridy=0;
        this.add(new Button("Button two"),gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.ipady=20;
        gbc.gridx=0;
        gbc.gridy=1;
     	this.add(new Button("Button three"),gbc);
	gbc.gridx=1;
        gbc.gridy=1;
        this.add(new Button("Button four"),gbc);
	gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridwidth=2;
        gbc.gridx=0;
        gbc.gridy=2;
     	this.add(new Button("Button five"),gbc);
	setSize(300,300);
	setPreferredSize(getSize());
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE); 
     
         
    }
   public static void main(String args[])
   {
	gridbagdemo a=new gridbagdemo();
   }
}

// Author : Ashutosh Mishra

import java.awt.*;
import javax.swing.*;
public class GridDemo extends Frame
{
	int n=3;
	public GridDemo()
	{
		setLayout(new GridLayout(n,n));
		for(int i=0;i<n;i++)
		{
		  for(int j=0;j<n;j++)
		  {
		    int k=i*n+j;
		     if(k>0)
			add(new Button(" "+k));
		   }
      		 }
	}
	public static void main(String args[])
	{
		GridDemo obj=new GridDemo();
		obj.setSize(new Dimension(300,300));
		obj.setTitle("GridLayout");
	 	obj.setVisible(true);
    	}
}

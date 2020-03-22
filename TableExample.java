// Author : Ashutosh Mishra

import javax.swing.*;
public class TableExample
{
	JFrame f;
	TableExample()
	{
		f=new JFrame();
		String data[][]={{"101","Amit","6700"},
			{"102","Jai","7800"},{"103","Sachin","8900"}
		};
		String column[]={"ID","NAME","SALARY"};
		JTable jt=new JTable(data,column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setSize(300,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new TableExample();
	}
}

// Author : Ashutosh Mishra

import java.awt.*;
import java.awt.event.*;
public class p8 extends Frame implements ActionListener
{
List plist,slist,mlist;
Button fb,pb,nb,lb;
Panel sp,bp;
CardLayout cl;
p8()
{
setTitle("Hyderabad");
cl=new CardLayout();
plist=new List(4);
slist=new List(4);
mlist=new List(4);
sp=new Panel();
bp=new Panel();


plist.setBackground(Color.red);
plist.setForeground(Color.yellow);
plist.setFont(new Font("Times New Roman",Font.BOLD,14));
plist.add("public garden");
plist.add("zoo park");
plist.add("indian park");
plist.add("sanjivayya park");
plist.add("lumbini park");


mlist.setBackground(Color.yellow);
mlist.setForeground(Color.blue);
mlist.setFont(new Font("Arial",Font.ITALIC,14));
mlist.add("charminar");
mlist.add("qutubminar");
mlist.add("golkonda");
mlist.add("falaknama");




slist.setBackground(Color.green);
slist.setForeground(Color.red);
slist.setFont(new Font("Century",Font.BOLD/Font.ITALIC,14));

slist.add("tankbund");
slist.add("birlatemple");
slist.add("ramoji filmcity");
slist.add("brla science museum");

sp.setLayout(cl);
sp.add("a",plist);
sp.add("b",slist);
sp.add("c",mlist);
fb=new Button("first");
pb=new Button("previous");
nb=new Button("next");
lb=new Button("last");
bp.add(fb);
bp.add(pb);
bp.add(nb);
bp.add(lb);
fb.addActionListener(this);
pb.addActionListener(this);
nb.addActionListener(this);
lb.addActionListener(this);

add(sp,"North");
add(bp,"South");
addWindowListener(new w());
}
public void actionPerformed(ActionEvent e)
{
String str=e.getActionCommand();
if(str.equals("first"))
    cl.first(sp);
if(str.equals("previous"))
    cl.previous(sp);
if(str.equals("next"))
    cl.next(sp);
if(str.equals("last"))
    cl.last(sp);
}

public static void main(String args[])
{
p8 cld=new p8();
cld.setSize(300,300);
cld.setVisible(true);
}
}
class w extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}

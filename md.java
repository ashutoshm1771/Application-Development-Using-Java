import java.awt.*;
import java.awt.event.*;
public class md extends Frame implements ActionListener
{
List plist,slist,mlist;
Button fb,pb,nb,lb;
Panel sp,bp;
CardLayout cl;
md()
{
setTitle("class");
cl=new CardLayout();
plist=new List(4);
slist=new List(4);
mlist=new List(4);
sp=new Panel();
bp=new Panel();


plist.add("A");
plist.add("B");
plist.add("C");
plist.add("D");


slist.add("p");
slist.add("q");
slist.add("r");
slist.add("s");



mlist.add("1");
mlist.add("2");
mlist.add("3");
mlist.add("4");




sp.setLayout(cl);
sp.add("M",plist);
sp.add("N",slist);
sp.add("O",mlist);


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
md cld=new md();
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
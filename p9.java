/*<applet code=p9 width=300 height=300></applet>*/
import java.awt.*;
import java.applet.*;
public class p9 extends Applet
{
GridBagLayout gbl=new GridBagLayout();
GridBagConstraints gbc=new GridBagConstraints();
public void init()
{
setLayout(gbl);
gbc.fill=GridBagConstraints.BOTH;
gbc.insets=new Insets(5,5,5,5);
gbc.weightx=1.0;
gbc.weighty=1.0;

addComponent(0,0,1,1,new Button("7"));
addComponent(0,1,1,1,new Button("8"));
addComponent(0,2,1,1,new Button("9"));
addComponent(0,3,1,1,new Button("-"));
addComponent(0,4,1,1,new Button("%"));

addComponent(1,0,1,1,new Button("4"));
addComponent(1,1,1,1,new Button("5"));
addComponent(1,2,1,1,new Button("6"));
addComponent(1,3,3,1,new Button("+"));
addComponent(1,4,1,1,new Button("/"));


addComponent(2,0,1,1,new Button("1"));
addComponent(2,1,1,1,new Button("2"));
addComponent(2,2,1,1,new Button("3"));
addComponent(2,4,2,1,new Button("*"));

addComponent(3,0,1,2,new Button("0"));
addComponent(3,2,1,1,new Button("."));
}
public void addComponent(int r,int co,int h,int w,Component c)
{
gbc.gridx=co;
gbc.gridy=r;
gbc.gridwidth=w;
gbc.gridheight=h;
gbl.setConstraints(c,gbc);
add(c);
}
}

import java.awt.*;
import java.awt.event.*;

public class fcolor extends Frame
{
	fcolor(String s)
	{
		super(s);
		addMouseListener(new MyMouseAdaptor(this));
		addWindowListener(new MyWindowAdaptor3(this));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fcolor o1=new fcolor("frame");
        o1.setSize(400,400);
        o1.setVisible(true);
	}

}

class MyWindowAdaptor3 extends WindowAdapter
{
	fcolor f1;
	MyWindowAdaptor3(fcolor f2)
	{
		f1=f2;
	}
	
	public void windowClosing()
	{
		f1.setVisible(false);
	}
}

class MyMouseAdaptor extends MouseAdapter
{
  	fcolor o1;
  	int flag;
  	MyMouseAdaptor(fcolor o2)
  	{
  		o1=o2;
  		flag=0;
  	}
  	public void mouseClicked(MouseEvent me)
  	{
  		if(flag==0)
  		{
  			o1.setBackground(Color.pink);
  			flag=1;
  		}
  		else
  		{
  			o1.setBackground(Color.blue);
  			flag=0;
  		}
  	}
}

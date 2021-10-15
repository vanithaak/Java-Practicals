import java.awt.*;
import java.awt.event.*;

public class stringframeawt extends Frame
{
	public stringframeawt(String s)
	{
		super(s);
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		addWindowListener(new MyWindowAdapter7(this));
		setBackground(Color.pink);
		
		Label l=new Label("Grateful");
		add(l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringframeawt o1= new stringframeawt(" String Frame ");

	}

}
class MyWindowAdapter7 extends WindowAdapter
{
	stringframeawt o1;
	MyWindowAdapter7(stringframeawt s)
	{
		o1=s;
	}
	public void windowClosing(WindowEvent ae)
	{
		o1.setVisible(false);
	}
}

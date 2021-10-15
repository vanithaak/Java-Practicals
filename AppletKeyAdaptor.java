import java.awt.*;
import java.awt.event.*;

public class AppletKeyAdaptor extends Frame {
	String s="Typed character is: ";
	AppletKeyAdaptor()
	{
		super("Frame Window");
		addKeyListener(new mykeyadaptor(this));
		addWindowListener(new Mywindowadaptor(this));
		setSize(400,400);
		setVisible(true);
	}

public void paint(Graphics g)
{
	g.drawString(s,50,50);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppletKeyAdaptor o1= new AppletKeyAdaptor();
	}

}

class mykeyadaptor extends KeyAdapter
{
	AppletKeyAdaptor o1;
	mykeyadaptor(AppletKeyAdaptor o2)
	{
		o1=o2;
	}
	public void keyTyped(KeyEvent o3)
	{
		o1.s+=o3.getKeyChar();
		o1.repaint();
	}
	
}

class Mywindowadaptor extends WindowAdapter
{
	AppletKeyAdaptor o1;
	Mywindowadaptor(AppletKeyAdaptor o2)
	{
		o1=o2;
	}
	public void windowClosing(WindowEvent o3)
	{
		System.exit(0);
	}
}
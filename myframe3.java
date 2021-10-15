import java.awt.*;
import java.awt.event.*;
class myframe31 extends Frame
{
	myframe31(String s){
		super(s);
		addWindowListener(new MyWindowAdaptor2(this));
		setBackground(Color.pink);
		
	}
	public void paint(Graphics g){
		g.drawString("hello", 250, 100);
		g.drawLine(20, 40, 100, 90);
		g.drawRect(20, 150, 60, 50);
		g.fillRect(20, 150, 60, 50);
		g.drawRoundRect(100, 150, 60, 50, 10, 25);
	}
	
}
class MyWindowAdaptor2 extends WindowAdapter
{
	myframe31 o1;
	MyWindowAdaptor2(myframe31 o2)
	{
		o1=o2;
	}
	public void windowclosing(WindowEvent ae)
	{
		o1.setVisible(false);
	}
}
 class myframe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myframe31 o2=new myframe31("Myframe3");
		o2.setSize(new Dimension(300,300));
		o2.setVisible(true);

	}

}

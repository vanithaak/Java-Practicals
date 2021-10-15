import java.awt.*;
import java.awt.event.*;
public class adaptordemo extends Frame 
{
	String msg="";
	public adaptordemo()
	{
		addMouseListener(new MyMouseAdapter(this));
		addWindowListener(new MyWindowAdapter());
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 20, 80);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		adaptordemo ap=new adaptordemo();
		ap.setSize(new Dimension(400,400));
		ap.setTitle("MouseEvents");
		ap.setVisible(true);
	}

}
class MyMouseAdapter extends MouseAdapter
{
	adaptordemo ad;
	public MyMouseAdapter(adaptordemo ad)
	{
		this.ad=ad;
	}
	public void mouseClicked(MouseEvent me)
	{
		ad.msg="Mouse Clicked";
		ad.setBackground(Color.pink);
		ad.setForeground(Color.black);
		ad.setSize(400,400);
		ad.repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		ad.msg="Mouse Entered";
		ad.setSize(3*400,3*400);
		ad.repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		ad.msg="Mouse Exited";
		ad.repaint();
	}
}
class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}
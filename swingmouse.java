import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swingmouse 
{
	JLabel l;
	swingmouse()
	{
		JFrame f=new JFrame(" ");
		f.setSize(100,100);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l=new JLabel();
		f.add(l);
		f.addMouseListener(new MouseAdapter()
				{
	public void mouseClicked(MouseEvent ae)
	{
		f.setSize(300,300);
		l.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent ae)
	{
		f.setSize(900,900);
		l.setText("Mouse Entered");
		
	}
	public void mouseExited(MouseEvent ae)
	{
		l.setText("Mouse Exited");

	}
	
				});f.setVisible(true);
				}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new swingmouse();
			}
		});

	}

}

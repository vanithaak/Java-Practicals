import java.awt.*;
import java.awt.event.*;

public class studentframeawt extends Frame implements ActionListener
{
	Label l;
	Button b1;
	Button b2;
	public studentframeawt(String s)
	{
		super(s);
		setSize(400,400);
		setLayout(new FlowLayout());
		b1=new Button("A");
		b1.setActionCommand("A");
		b2=new Button("B");
		b2.setActionCommand("B");
		addWindowListener(new MyWindowAdapter5(this));
		add(b1);
		add(b2);
		l=new Label("Choose a button");
		add(l);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s=" ";
		s=ae.getActionCommand();
		if(s.equals("A"))
		{
			l.setText("Name-JB "+"Course-B.Pharm "+"Rollno-5 "+"College-XYZ");
		}
		
		if(s.equals("B"))
		{
			l.setText("8 CGPA");
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentframeawt o1=new studentframeawt("frame");
	}

}
class MyWindowAdapter5 extends WindowAdapter
{
	studentframeawt o1;
	MyWindowAdapter5(studentframeawt o1)
	{
		this.o1=o1;
	}
	public void windowClosing(WindowEvent ae)
	{
		o1.setVisible(false);
	}
}

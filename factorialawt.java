import  javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class factorialawt implements ActionListener
{

	JLabel l,l1;
	JFrame f;
	JButton fact;
	JTextField t1,t2;

	factorialawt()
	{
		
	f=new JFrame("");
	f.setLayout(new FlowLayout());
	f.setVisible(true);
	f.setSize(350,350);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	l=new JLabel("enter number");
	l1=new JLabel("factorial is");
	t1=new JTextField(20);
	t2=new JTextField(10);
	fact=new JButton("factorial");

	f.add(l);
	f.add(t1);

	fact.addActionListener(this);
	f.add(fact);

	f.add(l1);
	f.add(t2);
	}

	public void actionPerformed(ActionEvent ae)
	{
	String n=t1.getText();
	int num=Integer.parseInt(n);
	int fac=1;
	for(int i=num;i>=1;i--)
	{
	fac=fac*i;
	}
	t2.setText(" "+fac);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new  Runnable(){
			public void run(){
			new  factorialawt();
			}
			}
			);

	}

}

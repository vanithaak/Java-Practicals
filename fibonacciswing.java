import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class fibonacciswing 
{
	public fibonacciswing()
	{
		JFrame f;
		f=new JFrame();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField t;
		t=new JTextField(20);
		
		JLabel l,l1;
		l=new JLabel("Enter text");
		l1=new JLabel();
		
		JButton b;
		b=new JButton("OK");
		
		f.add(l);
		f.add(t);
		f.add(b);
		f.add(l1);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				int num=Integer.parseInt(t.getText());
				int a=0,b=1;
				String s=a+" "+b;
				l1.setText("Series:"+s);
				for(int i=3;i<=num;i++)
				{
					int sum=a+b;
					s+=" "+sum;
					l1.setText("Series:"+s);
					a=b;
					b=sum;
				}
				
				
			}
		});
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(
				 new Runnable()
				 {
					public void run()
					{
						new fibonacciswing();
				    }
				 
	});
	}

}

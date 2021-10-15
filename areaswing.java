import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class areaswing {

	public areaswing()
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setLayout(new FlowLayout());
		jf.setSize(400,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1,l2,l3,l4;
		l1=new JLabel("Circle");
		jf.add(l1);
		
		JTextField t1,t2,t3;
		t1=new JTextField(20);
		jf.add(t1);
		
		JButton b1,b2;
		b1=new JButton("Area");
		jf.add(b1);
		
		l2=new JLabel();
		jf.add(l2);
		
		l3=new JLabel("Rectangle");
		jf.add(l3);
		
		t2=new JTextField(20);
		t3=new JTextField(20);
		jf.add(t2);
		jf.add(t3);
		
		b2=new JButton("Area");
		jf.add(b2);
		
		l4=new JLabel();
		jf.add(l4);

		b1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				double num1=Integer.parseInt(t1.getText());
				double value=3.14*num1*num1;
        		l2.setText(value+"");
			}
				});
		
		b2.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		double num2=Integer.parseInt(t2.getText());
		double num3=Integer.parseInt(t3.getText());

		double value=num2*num3;
		l4.setText(value+"");
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
						new areaswing();
				    }
				 
	});

	}

}

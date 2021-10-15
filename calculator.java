import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calculator {
	
	public calculator()
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setLayout(new FlowLayout());
		jf.setSize(400,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField t1,t2;
		t1=new JTextField(30);
		t2=new JTextField(30);
		jf.add(t1);
		jf.add(t2);
		
		JButton b1,b2,b3,b4;
		b1=new JButton("Add");
		b2=new JButton("Subtract");
		b3=new JButton("Multiply");
		b4=new JButton("Divide");
		
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(b4);
		
		JLabel jl=new JLabel("Result");
		jf.add(jl);
		
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				double num1=Integer.parseInt(t1.getText());
        		double num2=Integer.parseInt(t2.getText());
        		
        		double value=num1+num2;
        		jl.setText(value+"");
			}
		}) ;
		
		
		b2.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				double num1=Integer.parseInt(t1.getText());
        		double num2=Integer.parseInt(t2.getText());
        		
        		double value=num1-num2;
        		jl.setText(value+"");
			} 
				});
		
		b3.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				double num1=Integer.parseInt(t1.getText());
				double num2=Integer.parseInt(t2.getText());
				
				double value=num1*num2;
				jl.setText(value+"");
			}
				});
		
		b4.addActionListener(new ActionListener()
		        {
	        public void actionPerformed(ActionEvent e)
	         {
		        double num1=Integer.parseInt(t1.getText());
		        double num2=Integer.parseInt(t2.getText());
		
		        double value=num1/num2;
		        jl.setText(value+"");
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
						new calculator();
				    }
				 
	});
		 
		
	}

}

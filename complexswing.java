import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class complexswing {
	
	public complexswing()
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setLayout(new FlowLayout());
		jf.setSize(450,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1,l2,l3;
		JTextField t1,t2,t3,t4;
		JButton b1,b2,b3,b4;
		
		l1=new JLabel("First no");
		jf.add(l1);
		t1=new JTextField(15);
        t2=new JTextField(15);
        jf.add(t1);
		jf.add(t2);
		
        l2=new JLabel("Second no");
        jf.add(l2);
        t3=new JTextField(15);
        t4=new JTextField(15);
        jf.add(t3);
		jf.add(t4);
		
		b1=new JButton("Add");
		b2=new JButton("Subtract");
		b3=new JButton("Multiply");
		b4=new JButton("Divide");
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(b4);
        
		l3=new JLabel("Result");
		jf.add(l3);
		
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				double num1=Integer.parseInt(t1.getText());
        		double num2=Integer.parseInt(t2.getText());
				double num3=Integer.parseInt(t3.getText());
        		double num4=Integer.parseInt(t4.getText());
        		
        		double real=num1+num3;
        		double imag=num2+num4;
        		l3.setText(real+"+"+imag+"i");
			}
		}) ;
		
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				double num1=Integer.parseInt(t1.getText());
        		double num2=Integer.parseInt(t2.getText());
				double num3=Integer.parseInt(t3.getText());
        		double num4=Integer.parseInt(t4.getText());
        		
        		double real=num1-num3;
        		double imag=num2-num4;
        		l3.setText(real+"+"+imag+"i");
			}
		}) ;
		
		b3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				double num1=Integer.parseInt(t1.getText());
        		double num2=Integer.parseInt(t2.getText());
				double num3=Integer.parseInt(t3.getText());
        		double num4=Integer.parseInt(t4.getText());
        		
        		double real=(num1*num3)-(num2*num4);
        		double imag=(num1*num4)+(num3*num4);
        		l3.setText(real+"+"+imag+"i");
			}
		}) ;
		
		b4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				double num1=Integer.parseInt(t1.getText());
        		double num2=Integer.parseInt(t2.getText());
				double num3=Integer.parseInt(t3.getText());
        		double num4=Integer.parseInt(t4.getText());
        		
        		double real=((num1*num3)+(num2*num4))/((num3*num3)+(num4*num4));
        		double imag=((num3*num2)-(num1*num4))/((num3*num3)+(num4*num4));
        		l3.setText(real+"+"+imag+"i");
			}
		}) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(
				 new Runnable()
				 {
					public void run()
					{
						new complexswing();
				    }
				 
	});

	}

}

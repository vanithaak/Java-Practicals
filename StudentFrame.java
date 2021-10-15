import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class StudentFrame {
	
	public StudentFrame()
	{
	JFrame j=new JFrame();
	j.setVisible(true);
	j.setSize(400,400);
	j.setLayout(new FlowLayout());
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JLabel l=new JLabel();
	j.add(l);
	JButton b1,b2;
	b1=new JButton("A");
	ActionListener a1=new ActionListener()
			{
		       public void actionPerformed(ActionEvent ae)
		       {
		    	   l.setText("Name-JB   Course-B.Pharm   Rollno-5  College-XYZ ");
		       }
			};
			
	b1.addActionListener(a1);
	j.add(b1);
	
	b2=new JButton("B");
	ActionListener a2=new ActionListener()
	{
       public void actionPerformed(ActionEvent ae)
       {
    	   l.setText("8 CGPA");
       }
	};
	
b2.addActionListener(a2);
j.add(b2);
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(
				 new Runnable()
				 {
					public void run()
					{
						new StudentFrame();
				    }
				 
	});

	}

}

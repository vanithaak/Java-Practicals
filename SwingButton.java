import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingButton {
	
	public SwingButton()
	{
		JFrame j=new JFrame();
		j.setVisible(true);
		j.setSize(400,400);
		j.setLayout(new FlowLayout());
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b1,b2;
		b1= new JButton("Red");
		ActionListener a1= new ActionListener()
				{
			      public void actionPerformed(ActionEvent ae)
			      {
			    	  j.getContentPane().setBackground(Color.red);
			      }
				};
		b1.addActionListener(a1);
		j.add(b1);
				
		b2= new JButton("Blue");
		ActionListener a2= new ActionListener()
		{
	      public void actionPerformed(ActionEvent ae)
	      {
	    	  j.getContentPane().setBackground(Color.blue);
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
						new SwingButton();
				    }
				 
	});

	}

}

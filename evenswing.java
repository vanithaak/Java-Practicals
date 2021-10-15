import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class evenswing {

	public evenswing()
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setLayout(new FlowLayout());
		jf.setSize(400,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1=new JLabel("Enter numbers");
		jf.add(l1);
		
		JTextField t1=new JTextField(20);
		jf.add(t1);
		
		JButton b1=new JButton("Sum");
		jf.add(b1);
		
		JLabel l2=new JLabel();
		jf.add(l2);
		
		b1.addActionListener(new ActionListener()
				{
			      public void actionPerformed(ActionEvent e)
			      {
			    	  String s = t1.getText();
                      String numbers[] = s.split("\\s");
                      double num, sum = 0;
                      for(int i = 0; i<numbers.length; i++)
                      {
                            num = Integer.parseInt(numbers[i]);
                            if(num % 2 == 0)
                            {
                                   sum += num;
                            }
                      }
                      l2.setText(sum+"");
			    	
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
						new evenswing();
				    }
				 
	});

	}

}

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FactorialFrame {

	public FactorialFrame()
	{
		
		JFrame f;
		f=new JFrame();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField t;
		t=new JTextField(15);
		f.add(t);
		
		JLabel l;
		l=new JLabel("Result");
		f.add(l);
		
		ActionListener a1=new ActionListener()
				{
			public void actionPerformed(ActionEvent ae)
			{
				int n,fact=1;
				n=Integer.parseInt(t.getText());
				for(int i=1;i<=n;i++)
				{
					fact=fact*i;
				}
				
				l.setText(fact+"");
			}
				};
				t.addActionListener(a1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(
				 new Runnable()
				 {
					public void run()
					{
						new FactorialFrame();
				    }
				 
	});

	}

}

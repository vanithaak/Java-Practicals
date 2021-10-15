import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class underageswing {
 
	public underageswing()
	{ 
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setLayout(new FlowLayout());
		jf.setSize(400,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jt=new JTextField(30);
		jf.add(jt);
		
		JLabel jl=new JLabel();
		jf.add(jl);
		
		jt.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	       {
		     int age=Integer.parseInt(jt.getText());
		     if(age<18)
		     jl.setText("underage");
		     else
	         jl.setText("Eligible");	
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
						new underageswing();
				    }
				 
	});

	}

}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldDemo {

	public JTextFieldDemo()
	{
		JFrame j=new JFrame();
		j.setVisible(true);
		j.setSize(400,400);
		j.setLayout(new FlowLayout());
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JTextField jt=new JTextField(15);
		j.add(jt);
		
		JLabel jl=new JLabel();
		j.add(jl);
		
		jt.addActionListener(new ActionListener()
				{
			       public void actionPerformed(ActionEvent ae)
			       {
			    	   jl.setText(jt.getText());
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
						new JTextFieldDemo();
				    }
				 
	});
		 
		

	}

}

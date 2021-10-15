import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class togglebutton {
 
	public togglebutton()
	{
		JFrame j=new JFrame();
		j.setVisible(true);
		j.setSize(400,400);
		j.setLayout(new FlowLayout());
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l=new JLabel("Button is off");
		
		JToggleButton t=new JToggleButton("On/Off");
		
		j.add(t);
		j.add(l);
		t.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(t.isSelected())
					l.setText("Button is on");
				else
					l.setText("Button is off");
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
						new togglebutton();
				    }
				 
	});

	}

}

import java.awt.*;
import javax.swing.*;

public class StringFrame {
	
	public StringFrame()
	{
		JFrame j=new JFrame();
		j.setVisible(true);
		j.setSize(400,400);
		j.setLayout(new FlowLayout());
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		j.getContentPane().setBackground(Color.pink);
		
		JLabel l=new JLabel("Grateful");
		j.add(l);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SwingUtilities.invokeLater(
				 new Runnable()
				 {
					public void run()
					{
						new StringFrame();
				    }
				 
	});

	}

}

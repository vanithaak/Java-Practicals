import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JButtonDemo implements ActionListener{
	JButton b1,b2;
	JLabel l1;
	public JButtonDemo()
	{
		JFrame o1=new JFrame("JTextFieldDemo");
		o1.setLayout(new FlowLayout());
		o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		o1.setSize(400,300);
		ImageIcon i1=new ImageIcon(C:\Users\vanit\Pictures\ph\rangoli.jpg);
		ImageIcon i2=new ImageIcon();
		l1=new JLabel();
		b1=new JButton(i1);
		b1.setActionCommand("flower");
		b1.addActionListener(this);
		o1.add(b1);
		b2=new JButton(i2);
		b2.setActionCommand("clock");
		b2.addActionListener(this);
		o1.add(b2);
		o1.add(l1);
		o1.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		l1.setText("You pressed"+ae.getActionCommand());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
				{
			public void run()
			{
				new JButtonDemo();
			}
				});

	}

}

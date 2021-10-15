import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Javaswingevent {
	/**
	 * 
	 * @param args
	 */
	JLabel o2;
	Javaswingevent()
	{
		JFrame o1=new JFrame("An Event Example");
		o1.setLayout(new FlowLayout());
		o1.setSize(300,400);
		o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1=new JButton("Alpha");
		JButton b2=new JButton("Beta");
		o2=new JLabel("Text");
		o1.add(o2);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				o2.setText("Alpha is pressed");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				o2.setText("Beta is pressed");
			}
		});
		o1.add(b1);
		o1.add(b2);
		o1.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwingUtilities.invokeLater(new Runnable() {
	public void run()
	{
		new Javaswingevent();
	}
         });
	}
	

}

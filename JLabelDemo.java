import java.awt.*;
import javax.swing.*;
public class JLabelDemo {
	public JLabelDemo()
	{
		JFrame o1=new JFrame("JLabelDemo");
		o1.setLayout(new FlowLayout());
		o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		o1.setSize(400,300);
		ImageIcon i1=new ImageIcon(C:\Users\vanit\Pictures\ph);
		JLabel l1= new JLabel("rangoli",i1,JLabel.CENTER);
		o1.add(l1);
		o1.setVisible(true);
	}
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwingUtilities.invokeLater(new Runnable() {
	public void run()
	{
		new JLabelDemo();
	}
});
	}

}

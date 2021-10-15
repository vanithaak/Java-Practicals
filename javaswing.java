import javax.swing.*;
public class javaswing {
	javaswing()
	{
		 JFrame o1= new JFrame("Simple Swing Application");
		 o1.setSize(300,400);
		 o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JLabel o2=new JLabel("Swing label");
		 o1.add(o2);
		 o1.setVisible(true);
	}
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{
				new javaswing();
			}
		});

	}

}

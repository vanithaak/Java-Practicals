import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class copyfileswing {
	public copyfileswing()
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setSize(400,400);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1,l2,l3;
		l1=new JLabel("Enter file name");
		jf.add(l1);
		JTextField t1=new JTextField(15);
		jf.add(t1);
		JButton b1=new JButton("COPY");
		jf.add(b1);
		l2=new JLabel();
		jf.add(l2);
		l3=new JLabel();
		jf.add(l3);
	
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String text=t1.getText();
				int i;
				FileInputStream f1=null;
				FileOutputStream f2=null;
				
				try
				{
					f1=new FileInputStream(text);
					f2=new FileOutputStream("copy.txt");
					
					do
					{
						i=f1.read();
						if(i!=-1)f2.write(i);
						
					}while(i!=-1);
				}
				
				catch(IOException o1)
				{
					l3.setText("I/O Error:"+o1);
				}
				
				finally
				{
					try
					{
						if(f1!=null)f1.close();
					}
					catch(IOException o2)
					{
						l3.setText("Error closing input file");
					}
				}
				l2.setText("File has been copied");
			}		
				
			}) ;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(
				 new Runnable()
				 {
					public void run()
					{
						new copyfileswing();
				    }
				 
	});

	}

}

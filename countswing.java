import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class countswing {

	public countswing() 
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setLayout(new FlowLayout());
		jf.setSize(400,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jt=new JTextField(30);
		jf.add(jt);
		
		JLabel jl=new JLabel("Count");
		jf.add(jl);
		
		jt.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				String text=jt.getText();
				int count=0;
				char ch[]=new char[text.length()];
				for(int i=0;i<text.length();i++)
				{
					ch[i]=text.charAt(i);
					if(((i>0)&&(ch[i]==' '))||((ch[0]!=' ')&&(i==0)))
						count++;
				}
				jl.setText("No of words"+count);
				
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
						new countswing();
				    }
				 
	});

	}

}

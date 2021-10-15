import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class toggle implements ActionListener {
JFrame jf;
	
	toggle()
	{
	  jf = new JFrame("TEST");
      jf.setLayout(new FlowLayout());
	  
	  jf.setSize(450,500);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  JButton a=new JButton("RED");
	  a.addActionListener(this);
	  jf.add(a);
	  
	  JButton b=new JButton("BLUE");
	  b.addActionListener(this);
	  jf.add(b);
	  
	  JButton c=new JButton("GREEN");
	  c.addActionListener(this);
	  jf.add(c);
	  
	  JButton d=new JButton("PINK");
	  d.addActionListener(this);
	  jf.add(d);
	  
	  JButton e=new JButton("YELLOW");
	  e.addActionListener(this);
	  jf.add(e);
	}
	
	   public void actionPerfomed(ActionEvent ae)
	  {
		  String s=ae.getActionCommand();
		  
		  if(s.equals("RED"))
			  jf.getContentPane().setBackground(Color.RED);
		  if(s.equals("BLUE"))
			  jf.getContentPane().setBackground(Color.BLUE);
		  if(s.equals("GREEN"))
			  jf.getContentPane().setBackground(Color.GREEN);
		  if(s.equals("PINK"))
			  jf.getContentPane().setBackground(Color.PINK);
		  if(s.equals("BLUE"))
			  jf.getContentPane().setBackground(Color.BLUE);
			  
	  }

	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwingUtilities.invokeLater(new Runnable() {
			
			public void run()
			{
			    new toggle();
			}
						
			});
	}
	}

	





	


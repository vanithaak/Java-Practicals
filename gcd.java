import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class gcd {
  JLabel l;
  gcd()
  {
	  JFrame jf = new JFrame(" ");

	  jf.setSize(400,400);

	  jf.setLayout(new FlowLayout());
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  jf.setVisible(true);

	  JButton b1 = new JButton("Factorial");

	  ActionListener a1=new ActionListener()

	  {public void actionPerformed(ActionEvent me)

	  {
	  	int f=1,i;
	  	System.out.println("factorial of 5");
	  	
	  	for(i=1;i<=5;i++)
	  	{
	  		f=f*i;
	  		
	  	}
	      System.out.println(f);
	      jf.getContentPane().setBackground(Color.cyan);
	  }

	  };

	  b1.addActionListener(a1);

	  jf.add(b1);

	  JButton b2 = new JButton("GCD");

	  ActionListener a2=new ActionListener()

	  {public void actionPerformed(ActionEvent me)

	  {
	  	System.out.println("two numbers are 27and 9");
	  	int a=27;
	  	int b=9;
	  	int l,i;
	  	int h=0;
	  	if(a>b)
	  	{
	  		l=a;
	  	}
	  	else
	  	{
	  		l=b;
	  	}
	  	for(i=l;i>=1;i--)
	  	{
	  		if(a%i==0&&b%i==0)
	  		{
	  			h=i;
	  			break;
	  		}
	  	}
	  	System.out.println("GCD is"+" "+h);
	  jf.getContentPane().setBackground(Color.blue);

	  }

	  };

	  b2.addActionListener(a2);

	  jf.add(b2); 

	  }

  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()

		{

		public void run(){

		new gcd();

		}


	}
		);
	}
	}
	



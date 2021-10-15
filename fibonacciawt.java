
import java.awt.*;
import java.awt.event.*;
class fibo extends Frame implements WindowListener,MouseListener
{
	int num;
	int one;
	int two;
	String msg;
	
	  fibo()
      {
        num=0;
        one = 0;
        two= 1;
		msg="";
      }
	  
	 public int fibonacci(int f, int s)
     {
       return (f+s);
     }
	
	
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	
	public void windowActivated(WindowEvent we) 
	{
		
	}
    public void windowClosed(WindowEvent we) 
	{
		
	}
    public void windowDeactivated(WindowEvent we)
	{
		
	}
    public void windowDeiconified(WindowEvent we)
	{
		
	}	
    public void windowIconified(WindowEvent we) 
	{
		
	}
    public void windowOpened(WindowEvent we) 
	{
		
	}
	
public void mouseClicked(MouseEvent me)
{
if(num==0) 
{
 msg=Integer.toString(one);
 num=num+1;
}
else if(num==1) 
{
 msg=msg+","+Integer.toString(two); 
 num=num+1; 
}
else
{
 int three = fibonacci(one,two);
 one=two;
 one=three;
 msg=msg+","+Integer.toString(three);
}

System.out.println(msg);
	}
	
    public void mouseEntered(MouseEvent me) 
	{
		
	}
    public void mouseExited(MouseEvent me)  
	{
		
	}	
	public void mousePressed(MouseEvent me) 
	{
		
	}
    public void mouseReleased(MouseEvent me) 
	{
		
	}
	
}
public class fibonacciawt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fibo o = new fibo();
		
		o.addWindowListener(o);
		o.addMouseListener(o);
		
	    o.setLayout(new FlowLayout());
		o.setVisible(true);
		o.setSize(500,500);
		o.setTitle("Fibonacci series");

	}

}

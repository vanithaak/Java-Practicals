import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swingkeytype 
{
	JLabel l;
	String msg=" Typed character is ";
		public swingkeytype()
				{
			JFrame f=new JFrame(" ");
			l=new JLabel();
			f.setSize(200,100); 
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLayout(new FlowLayout());
		    f.setVisible(true);
			f.add(l);
			f.addKeyListener(new KeyAdapter()
			{
					public void keyTyped(KeyEvent ke)
					{
					msg+=ke.getKeyChar();
					l.setText(msg);
					f.repaint();
						}
						});
				}
		public void main(Graphics g)
		{
			g.drawString(msg, 400, 400);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
        	public void run()
        		{
        			new swingkeytype();
        		}
        	
        	  
					});

	}

}

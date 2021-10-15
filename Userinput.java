import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;


public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioDemo r= new RadioDemo();

	}

}

class RadioDemo extends JFrame
{
	JTextField t1;
	JButton b;
	JRadioButton r1,r2;
	JLabel l;
	JCheckBox c1,c2;
	
	
	public RadioDemo()
	{
		t1= new JTextField(15);
		b=new JButton("OK");
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		l=new JLabel("Greeting");
		c1=new JCheckBox("Dancing");
		c2=new JCheckBox("Singing");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		add(t1);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(b);
		add(l);
		
		c1.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent e)
			{
				System.out.println("Dancer");
			}
		});
		
		b.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String name=t1.getText();
				
				if(r1.isSelected())
				{
					name= "Mr."+name;
				}
				else
				{
					name="Ms."+name;
				}
				if(c1.isSelected())
				{
					name=name+ "Dancer";
				}
				if(c2.isSelected())
				{
					name=name+ "Singer";
				}
				l.setText(name);
			}
		});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
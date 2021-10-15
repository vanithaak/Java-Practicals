import java.awt.*;
import java.awt.event.*;
class myframe2 extends Frame{
	myframe2(String s){
		super(s);
		addWindowListener(new MyWindowAdaptor1(this));
		setBackground(Color.pink);
		//setForeground(Colour.blue);
	}
	
	public void paint(Graphics g)
	{
		Color c1=new Color(255,100,100);
		Color c2=new Color(255,255,100);
		Color c3=new Color(100,100,255);
		g.setColor(c1);
		g.drawString("Hello",250,100);
		g.setColor(c2);
		g.drawString("Oval",196,150);
		g.drawOval(200,150,60,50);
		g.drawOval(200,150,60,50);
		g.fillOval(200,150,60,50);
		g.setColor(c3);
		g.drawString("Circle",296,250);
		g.drawOval(300,250,70,70);
		g.fillOval(300,250,70,70);
		g.drawString("Arc",19,350);
		g.drawArc(20,350,70,70,0,180);
		g.fillArc(70,350,70,70,0,180);
		int xpoints[]= {20,200,20,200,20};
		int ypoints[]= {450,450,650,650,450};
		int num=5;
		
		g.setColor(Color.red);
		g.drawString("Polygon",18,450);
		g.drawPolygon(xpoints,ypoints,num);
		Dimension d1=getSize();
		g.drawString("Sizeframe width="+d1.width+"height="+d1.height,250,400);
		Insets i=getInsets();
		g.drawString("Size of border title region top="+i.top+"bottom="+i.bottom+"left="+i.left+"right="+i.right,350,550);
		float v[]=new float[3];
		v=c2.RGBtoHSB(200,150,300,v);
		
		g.drawString("Hue"+v[0]+"Saturation="+v[1]+"brightness"+v[2],400,600);
		
	}
}

class MyWindowAdaptor1 extends WindowAdapter
{
	myframe2 o1;
	MyWindowAdaptor1(myframe2 o2){
		o1=o2;
	}
	public void windowClosing(WindowEvent ae)
	{
		o1.setVisible(false);
	}
	
}
public class Myframe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myframe2 o1=new myframe2("Myframe");
		o1.setSize(400,500);
		o1.setVisible(true);

	}

}

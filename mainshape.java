import p1.*;
import p2.*;
import p3.*;
public class mainshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape o1;
		rectangle o2=new rectangle(5,2);
		circle o3=new circle(10);
		o1=o2;
		o1.computearea();
		o1.display();
		o1=o3;
		o1.computearea();
		o1.display();

	}

}

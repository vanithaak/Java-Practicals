
import pck1.*;
import pck2.*;
import pck3.*;
public class demo1 {

	public static void main(String[] args){
	 person p1=new person();
	 teacher t=new teacher("raj",2,34);
	 student s1=new student("sana",7,14);
	 person p;
	 p=p1;
	 p.display();
	 p=t;
	 p.display();
	 p=s1;
	 p.display();

	}

}

import java.io.*;
class comp {
		int x,y;
		comp()
		{
			x=y=0;
		}
		comp(int a,int b)
		{
			x=a;
			y=b;
		}
	void input() throws IOException
	{
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter real part:");
		x=Integer.parseInt(br1.readLine());
		System.out.println("Enter imaginary part:");
		y=Integer.parseInt(br1.readLine());
		
	}
	public String toString() 
	{
		return(x+ " +i"+y);
	}
	comp addition(comp o1)
	{
		comp temp;
		temp= new comp();
		temp.x=x+o1.x;
		temp.y=y+o1.y;
		return temp;
	}
	
	comp subtraction(comp o1)
	{
		comp temp;
		temp= new comp();
		temp.x=x-o1.x;
		temp.y=y-o1.y;
		return temp;
	}
	
	comp multiplication(comp o1)
	{
		comp temp;
		temp= new comp();
		temp.x=x*o1.x-y*o1.y;
		temp.y=x*o1.y+o1.y*x;
		return temp;
	}
	
	comp division(comp o1)
	{
		comp temp;
		temp= new comp();
		temp.x=(x*o1.x+o1.y*y)/(o1.x*o1.x+o1.y*o1.y);
		temp.y=(y*o1.x-x*o1.y)/(o1.x*o1.x+o1.y*o1.y);
		return temp;
	}
	
}
public class complexclass {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));	
		comp o1,o2,o3;
		o1=new comp();
		o2=new comp();
		o3=new comp();
		
		
		System.out.println("Choose one of the following options:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int k=Integer.parseInt(br1.readLine());
		
			switch(k)
			{
			case 1:
			{
				o1.input();
				o2.input();
				o3=o1.addition(o2);
				System.out.println("Sum:"+o3);
				break;
			}
			case 2:
			{
				o1.input();
				o2.input();
				o3=o1.subtraction(o2);
				System.out.println("Difference:"+o3);
				break;
			}
			case 3:
			{
				o1.input();
				o2.input();
				o3=o1.multiplication(o2);
				System.out.println("Product:"+o3);
				break;
			}
			case 4:
			{
				o1.input();
				o2.input();
				o3=o1.division(o2);
				System.out.println("Quotient:"+o3);
				break;
			}
		

	}
	}
}






	

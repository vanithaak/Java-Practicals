import java.io.*;
class sumexception extends Exception
{
	sumexception(String str)
	{
	super(str);
	}
}
public class mexception{
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		int[] a=new int[20];
		int b;
		
		System.out.println("Enter size of array:");
		b=Integer.parseInt(b1.readLine());
		System.out.println("Enter "+b+" elements of array:");
		
		try
		{
			for(int i=0;i<b;i++)
			{
			a[i]=Integer.parseInt(b1.readLine());
			if(i>1)
			{
				if(a[i]==a[i-1]+a[i-2])
				{
				sumexception m1=new sumexception("The entered element "+a[i]+" is the sum of previous two elements!");
				throw m1;
				}
			}
			}
			
		}
		
		catch (sumexception e)
		{
			System.out.println(e);
		}
		
		

	}

}


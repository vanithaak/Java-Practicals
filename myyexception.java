import java.io.*;
class MyException extends Exception
{
	String str;
	public MyException(String s)
	{
		str=s;
	}
	public String toString()
	{
		return "Odd number found";
	}
}
public class myyexception {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[50];
		int size;
		System.out.println("Enter array size");
		size=Integer.parseInt(br.readLine());
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element");
			a[i]=Integer.parseInt(br.readLine());
			try
			{
				if(a[i]%2==0)
				{
					System.out.println("The square of element is "+(a[i]*a[i]));
				}
				else
					throw new MyException("Odd number Exception");
			}
			catch(MyException e)
			{
				System.out.println(e);
			}

	}
	}
}


class underage
{
	public void print(int x)
	{
		if(x<18)
		{
			throw new ArithmeticException(x+"underage");
		}
		else
		{
			System.out.println("Valid age");
		}
	}
}
public class exceptionDemo 
{
	static void test()
	{
		try
		{
			underage o=new underage();
			o.print(17);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			test();
		}
	}

}

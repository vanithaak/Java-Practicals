class stackException extends Exception
{
	stackException(String str)
	{
		super(str);
	}
}

class arraystack
{
	public static int[] item;
	public static int stackTop;
	arraystack()
	{
		item=new int[4];
		stackTop=-1;
	}
	static void push(int x)throws stackException
	{
		if(stackTop==item.length-1)
		{
			throw new stackException("Stack overflow");
		}
		stackTop++;
		item[stackTop]=x;
	}
	static void pop()throws stackException
	{
		int returnitem;
		if(stackTop==-1)
		{
			throw new stackException("Stack Underflow");
		}
		returnitem=item[stackTop--];
		System.out.println(returnitem);
	}
}
public class stackclass 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      arraystack s=new arraystack();
      try
      {
    	  for(int i=0;i<4;i++)
    	  s.push(i);
    	  for(int j=0;j<5;j++)
    		  s.pop();
      }
       catch(stackException e)
      {
    	   System.out.println("error :"+e.getMessage());
      }
	}

}

import java.io.*;

public class copy {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		FileInputStream i=new FileInputStream(args[0]);
		FileOutputStream o=new FileOutputStream(args[1]);
		int b;
		while((b=i.read())!=1)
		o.write(b);
		i.close();
		o.close();

	}

}

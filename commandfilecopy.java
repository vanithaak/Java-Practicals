import java.io.*;
public class commandfilecopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		try
		{
			FileInputStream f1=new FileInputStream(args[0]);
			FileInputStream f2=new FileInputStream(args[1]);
			InputStreamReader input= new InputStreamReader(f1);
			BufferedReader reader=new BufferedReader(input);
			
			String x= reader.readLine();
			while(x!=null)
			{
				System.out.println(x);
				x=reader.readLine();
			}
			f1.close();
			f2.close();
			
		}
		catch(IOException o1) 
		{
			System.out.println("I/O Error"+o1);
		}

	}

}

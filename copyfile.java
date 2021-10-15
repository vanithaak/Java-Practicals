import java.io.*;

public class copyfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileInputStream f1=new FileInputStream("D:\\javaa\\javaaa\\src\\vanitha.txt");
        	InputStreamReader input=new InputStreamReader(f1);
        	BufferedReader reader=new BufferedReader(input);
        	int wcount=0;
        	int lcount=0;
        	String str;
        	str=reader.readLine();
        	while(str!=null)
        	{
        		System.out.println(str);
        		lcount++;
        		String s[]=str.split(" ");
        		for(int i=0;i<s.length;i++)
        			System.out.println(s[i]);
        		
        		System.out.println(s.length);
        		wcount=wcount+s.length;
        		str=reader.readLine();
        	}
        	System.out.println(" Word count is: "+wcount);
        	System.out.println(" Line count is: "+lcount);
        	f1.close();
        	
        }
        catch(IOException o1)
        {
        	System.out.println("I/O Error"+o1);
        }
	}

}

import java.io.*;
public class myyyexception {

	public static void main(String[] args)throws IOException,FileNotFoundException 
	{
		// TODO Auto-generated method stub

		        FileInputStream f = new FileInputStream("vanitha.txt"); 
		        BufferedReader br = new BufferedReader(f); 
		        FileOutputStream ff = new FileOutputStream("vanitha1.txt"); 
		        String l;

		        while((l = br.readLine()) != null)
		        { 
		            l = l.trim();
		            l=l.replaceAll("\\r+", " ");
		            ff.write(l);


		        }
		        f.close();
		        ff.close();
	}

}


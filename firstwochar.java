import java.io.*;
public class firstwochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cword=0;
		int cline=0;
		String s1=" ";
		String s2=" ";
		try(FileInputStream f1=new FileInputStream("D:\\javaa\\javaaa\\src\\vanitha.txt"))
				{
					BufferedReader b1= new BufferedReader(new InputStreamReader(f1));
					s2=b1.readLine();
					while(s2!=null)
					{
						String s3[]=s2.split(" ");
						System.out.println("s3[0]=");
						System.out.println(s3[0].equals("//"));
						if(s3[0].equals("//"))
						{
							System.out.println(s2);
							cline++;
						}
						s2=b1.readLine();
					}
					}
				catch(IOException io)
		{
					System.out.println("I/O error");
		}
				}
	}
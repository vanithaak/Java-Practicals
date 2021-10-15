import java.io.*;
interface I
{
	public double conversion(double a);
}
class temperature implements I
{
	public double conversion(double a)
	{
		double temp;
		temp=a*9/5+32;
		System.out.println("temperature in farenheit "+temp);
		return 0;
	}
}
public class interfacee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double c;
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter temperature in degree celcius");
		c=Double.parseDouble(br1.readLine());
		temperature t=new temperature();
		t.conversion(c);

	}

}

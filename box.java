class boxx
{
	double height;
	double width;
	double depth;
	boxx()
	{
		height=width=depth=-1;
	}
	
	boxx(double h,double w,double d)
	{
		height=h;
		width=w;
		depth=d;
	}
	
	boxx(double len)
	{
		height=width=depth=len;
	}
	
	 double vol()
	{
		return height*width*depth; 
	}
	
}
public class box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boxx mybox1=new boxx(10,20,15);
		boxx mybox2=new boxx();
		boxx mycube=new boxx(7);
		
		
		System.out.println("Volume of mybox1 is"+mybox1.vol());
		
		System.out.println("Volume of mybox2 is"+mybox2.vol());
		
		System.out.println("Volume of mycube is"+mycube.vol());
		

	}

}

class boxxx{
	double depth;
	double height;
	double width;
	
	boxxx(boxxx ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	
	boxxx()
	{
		height=width=depth=-1;
	}
	
	boxxx(double h,double w,double d)
	{
		height=h;
		width=w;
		depth=d;
	}
	
	boxxx(double len)
	{
		height=width=depth=len;
	}
	
	 double vol()
	{
		return height*width*depth; 
	}
	
}
public class box1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boxxx mybox1=new boxxx(10,20,15);
		boxxx mybox2=new boxxx();
		boxxx mycube=new boxxx(7);
		boxxx myclone=new boxxx(mybox1);
		double vol;
		vol=mybox1.vol();
		System.out.println("Volume of mybox1 is"+vol);
		vol=mybox2.vol();
		System.out.println("Volume of mybox2 is"+vol);
		vol=mycube.vol();
		System.out.println("Volume of mycube is"+vol);
		vol=myclone.vol();
		System.out.println("Volume of myclone is"+vol);

	}

}

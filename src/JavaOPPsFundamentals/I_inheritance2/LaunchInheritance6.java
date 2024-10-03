package JavaOPPsFundamentals.I_inheritance2;

class Alpha
{
	int a, b;
	
	public Alpha()
	{
		a=10;
		b=20;
		System.out.println("Alpha zero Param Constructor");
	}
	public Alpha(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Param Constructor of Alpha");
	}

}
class Beta extends Alpha
{
	int x, y;
	
	public Beta()
	{
		x=1;
		y=2;
		System.out.println("Beta Zero Param Constructor");
	}
	public Beta(int x, int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Beta Param Constructor");
	}
	
	public void disp()
	{
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
	}
}
public class LaunchInheritance6 
{

	public static void main(String[] args) 
	{
		
		Beta b=new Beta();
		b.disp();
	}

}
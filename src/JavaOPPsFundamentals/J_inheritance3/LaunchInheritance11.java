package JavaOPPsFundamentals.J_inheritance3;


class Demo4
{

	static int a;

	int b;
	public static void disp()
	{

		a=10;
		System.out.println(a+ " parent class disp");
	}
	public void show()
	{
		b=50;
		System.out.println("show of parent" +b );
	}
}
class Demo5 extends Demo4
{
	
	public static void disp()//method hiding
	{
		a=50;
		
		System.out.println(a + " child class disp");
	}
	
	public void show()
	{   b=1000;
	
		System.out.println("show of child" +b);

	// /	System.out.println("super" +super.b  +"   " + super.a + "   " +this.b +"   "+this.a);
	}
}

public class LaunchInheritance11 
{

	public static void main(String[] args) 
	{
		//new Demo4().show();

			Demo4 d=new Demo5();
			d.disp();
			d.show();
			
			Demo4.disp();
			System.out.println("**********************");
			Demo5.disp();
//			Demo5 d2=new Demo5();
//			d2.disp();
//            d2.show();
//			Demo4.disp();

	}

}


/* static members and inheritance  */
// static variables-> gets inherited with same value as in parent
// static methods-> method hiding takes place

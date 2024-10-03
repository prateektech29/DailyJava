package JavaOPPsFundamentals.I_inheritance2;

class Parent
{
	int i=10;
	int y=30;
	void disp()
	{
		System.out.println("Disp of parent");
	}
	
}
class Child extends Parent
{
	int i=100;
	
	void alpha()
	{
		System.out.println("alpha");
		System.out.println(i);
		System.out.println(super.i);
		//disp();
		super.disp();
		
		
		disp();
	}
	void disp()
	{
		System.out.println("Disp of child");
		
	}

	void fieldY()
	{
		System.out.println();
		System.out.println("in fieldY() of child class");
		System.out.println(this.y);
		System.out.println(super.y);

		y=y+10;

		System.out.println(this.y);
		System.out.println(super.y);


	}
}


public class LaunchInheritance9 
{

	public static void main(String[] args) 
	{
		
		
		Child c=new Child();
		c.alpha();
		c.fieldY();
//		new Child().alpha();
//		new Child().disp();
		
	}

}

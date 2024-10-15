package JavaInterfacesAndLambdas.Topic1Interfaces;

interface Planet
{
	void show();
	default void disp()
	{
		System.out.println("Yep! we can also have body of a method within interface");
	}
}

class Alien implements Planet
{
	public void show()
	{
		System.out.println("Hello Aliens, Welcome back!");
	}
	
//	public void disp()
//	{
//		System.out.println("overridden method in child class");
//	}
	
}


public class LaunchInterface3 
{

	public static void main(String[] args)
	{
		
		Alien a=new Alien();
		a.show();
		a.disp();
	}

}
/*INTERFACES-default keyword*/
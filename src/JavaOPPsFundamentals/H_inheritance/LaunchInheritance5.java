package JavaOPPsFundamentals.H_inheritance;

class Telusko2
{
	Telusko2()
	{
		System.out.println("Telusko 2 zero param Constructor");
	}
	{
		System.out.println("Java Init block-> funFact-> it runs just-after super() in constructor");
	}
}

class Alien2 extends Telusko2
{

	
}


public class LaunchInheritance5 
{

	public static void main(String[] args) 
	{
		
			Alien2 a=new Alien2();
	}

}
/* super() call and java initiablization block execution in case of inheritance */
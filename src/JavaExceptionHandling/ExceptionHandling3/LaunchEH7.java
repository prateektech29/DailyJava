package JavaExceptionHandling.ExceptionHandling3;

class Gamma
{
	public int disp()
	{
		try
		{
			System.out.println("Disp method of alpha");
			return 10;
		}
		finally
		{
			System.out.println("Finally block of Gamma");
			return 44;
			//System.out.println("Text after finally"); // unreachable statement
		}
		//return 4; // unreachable statement
	}
}

public class  LaunchEH7
{

	public static void main(String[] args)
	{
		Gamma g=new Gamma();
		System.out.println(g.disp());
		

	}

}
/*try-finally and return */
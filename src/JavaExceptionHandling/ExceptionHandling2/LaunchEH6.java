package JavaExceptionHandling.ExceptionHandling2;

import java.util.Scanner;

class Alpha2
{
	public void calc() throws ArithmeticException
	{
			System.out.println("Alpha Connection Established");
			try
			{
			Scanner scan=new Scanner(System.in);
			System.out.println("Kindly Enter the Numerator for division");
			int n=scan.nextInt();
		
			System.out.println("Kindly Enter the Denominator for division");
			int d=scan.nextInt();
		
			int res=n/d;
		
			System.out.println("Result is "+ res);

			}
			catch(ArithmeticException e)
			{

				System.out.println("Handled in Alpha");


				throw e;

			}

			finally
			{
				System.out.println("Alpha Connection Terminated");

			}

	}
}



public class LaunchEH6 
{

	public static void main(String[] args) 
	{

		
		try
		{
		System.out.println("Main connection established");
		Alpha2 a=new Alpha2();
		a.calc();
	////		System.out.println(a.calc());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught by main");
		}

		System.out.println("Main connection terminated");


	}

}
/*'throw' keyword in java , 'finally' after a 'throw' */
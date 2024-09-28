package JavaOPPsFundamentals.E_consturctor;

public class LaunchTernary
{

	public static void main(String[] args) 
	{
		int num1=1000;
		int num2=4400;
		int num3=300;
		
//		if(num1>num2)
//		{
//			System.out.println("Greater num is "+ num1);
//		}
//		else
//		{
//			System.out.println("Greater num is "+ num2);
//		}
		
//		int res=(num1>num2)? num1:num2 ;
//		System.out.println("Greater num is "+ res);


//		if(num1>num2)
//		{
//			if(num1>num3)
//			{
//				System.out.println("Greater num is "+ num1);
//			}
//			else
//			{
//				System.out.println("Greater num is "+ num3);
//			}
//		}
//		else if(num2>num3)
//		{
//			System.out.println("Greater num is "+ num2);
//		}
//		else {
//			System.out.println("Greater num is "+ num3);
//		}


		int res=(num1>num2)? (num1>num3 ? num1: num3) : (num2>num3? num2: num3);
		System.out.println("Greater num is "+ res);

		

	}

}

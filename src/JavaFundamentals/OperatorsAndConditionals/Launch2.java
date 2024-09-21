package JavaFundamentals.OperatorsAndConditionals;

public class Launch2
{

	public static void main(String[] args)
	{
		int age=17;
		
//		if(age>=18)
//		
//			System.out.println("Eligible for License");
//		
//		else
//		
//			System.out.println("Calm down! kiddo");


//		if(age==18)
//		{
//			System.out.println("You have grown be responsble");
//		}
//		else if(age<=18)
//		{
//			System.out.println("You might turn 18 soon");
//		}
//		else if(age>18)
//		{
//			System.out.println("You're not more a teen ager");
//		}
//		else
//		{
//			System.out.println("Something");
//		}
		
		if(age<=18)
		{
			if(age<18)
			{
				System.out.println("Youre gonna be 18 soon have patinece!");
			}
			else 
			{
				System.out.println("You have grown be responsble");
			}	
		}
		
		else if(age>18)
		{
			System.out.println("You're not more a teen ager");
		}
		else
		{
			System.out.println("code will never enter this block");
		}

	}

}

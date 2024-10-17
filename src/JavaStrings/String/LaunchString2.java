package JavaStrings.String;

public class LaunchString2
{

	public static void main(String[] args) 
	{
		
//		String str1="planets";
//		System.out.println(str1);
//		
//		str1.concat(" Alien");
//		System.out.println(str1);
		
//		String str1="planets";
//		System.out.println(str1);
//		
//		str1=str1.concat(" Alien");
//		System.out.println(str1);
		
//		String s1="planets";
//		String s2=s1.concat(" Java");
//		System.out.println(s1);
//		System.out.println(s2);
		
		String s1="planets";
		String s2=s1.concat(" Java");
		String s3="planets Java";
		String s5="planets Java";

		System.out.println(s2==s3);//false
		System.out.println(s2.equals(s3));//true

		System.out.println(s3==s5);//true
////

		String s4=s1+s2;

		System.out.println(s3==s4);//false
		
//		String s1="planets "+ "Java "+"SpringBoot "+" Microservices";
//		String s2="planets "+ "Java "+"SpringBoot "+" Microservices";
//
//		System.out.println(s1==s2);//true
//		
		
//
//	     String s3=s1+s2;
//
//	     System.out.println(s1);
//	     System.out.println(s2);
//	     System.out.println(s3);
		
//		String s="Springboot "+2500+3900+4500; //Springboot 250039004500
//		System.out.println(s);
		
//		String s=45+55+" planets";//100 planets
		String s=45+55+" planets"+100+200+300; //100 planets100200300
		System.out.println(s);

	}

}
/* Concatenation(concat(),+), String constant pool and heap,
 memory location(SCP or inside heap)  during concatenation */
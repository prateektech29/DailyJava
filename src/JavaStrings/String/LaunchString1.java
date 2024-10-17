package JavaStrings.String;

public class LaunchString1 {

	public static void main(String[] args)
	{
		String str1="Coursera";
		String str2="Coursera";
		System.out.println(str1==str2);//true
		System.out.println(str1.equals(str2));//true
		
		String str3=new String("Coursera");
		String str4=new String("Coursera");
		System.out.println(str3==str4);//false
		System.out.println(str3.equals(str4));//true
		
		
		String str5="Coursera";
		String str6=new String("Coursera");
		System.out.println(str5.equals(str6));//true
		System.out.println(str5==str6);//false
		
		String str7="Coursera";
		String str8="coursera";
		System.out.println(str7.equals(str8));//false
		System.out.println(str7==str8);//false
		System.out.println(str7.equalsIgnoreCase(str8));//true

	}

}
/* String creation in 2 ways -> using direct literal & using new keyword, String pool and heap memory,
*  Comparison using -. ==,equals(),equalsIgnoreCase()*/
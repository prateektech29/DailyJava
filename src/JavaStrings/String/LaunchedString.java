package JavaStrings.String;

public class LaunchedString
{

	public static void main(String[] args) 
	{
		String str="RajaRamMohanRoy";
		System.out.println(str.length());//15
		System.out.println(str.toUpperCase());//RAJARAMMOHANROY
		System.out.println(str.toLowerCase());//rajarammohanroy
		System.out.println(str.substring(4, 12));//RamMohan
		System.out.println(str.substring(4));//RamMohanRoy
//		char ch[]=str.toCharArray();
//		for(char c:ch)
//		{
//			System.out.println(c);
//		}
		
		System.out.println(str.charAt(4));//R
		System.out.println(str.contains("Mohan"));//true
		System.out.println(str.startsWith("Raj"));//true
		System.out.println(str.startsWith("Rajaa"));//false

		System.out.println(str.startsWith("Roy"));//false
		System.out.println(str.indexOf("a"));//1
		System.out.println(str.indexOf("an"));//10
		System.out.println(str.lastIndexOf("a"));//10
		
		

	}

}
/*Some imp. functions of String class*/
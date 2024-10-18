package JavaStrings.String2;

public class LaunchStringMutable3 {

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder("Sachin");
		StringBuilder sb2=new StringBuilder("Sachin");
		System.out.println(sb1.equals(sb2)); // false  -> why


//		System.out.println(sb1==sb2);
//		System.out.println(sb1.compareTo(sb2));
	}

}

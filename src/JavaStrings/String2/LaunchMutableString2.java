package JavaStrings.String2;

public class LaunchMutableString2 {

	public static void main(String[] args) 
	{
//		StringBuffer sb1=new StringBuffer();
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1.capacity());//22
//		System.out.println(sb1.capacity());//16
		sb1.append("Sachin");//6
		sb1.trimToSize();
		
		sb1.append("Tendulkar India");//21
		System.out.println(sb1);
		System.out.println(sb1.capacity());//old capacity * 2 + 2  ==> 16 *2 + 2==>34
//		
//		//35   or 34*2 + 2==>70
		

	}

}

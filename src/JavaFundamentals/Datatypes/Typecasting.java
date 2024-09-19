package JavaFundamentals.Datatypes;
//DemoApp
public class Typecasting
{

	public static void main(String[] args)
	{
//		int a=44;
//		System.out.println("a");//a
//		System.out.println(a);//44
		
		byte a=45;
		double b;
		b=a; //implicit typecasting

		System.out.println(b);
		
		double v=45.5;
		byte k;
		k=(byte)v; //explicit typecasting
		System.out.println(k);

		int i;
		i=(int)v; //explicit typecasting
		System.out.println(i);

		//Some typeCasting  eg:-
		int m=5;
		byte b1=(byte) m;
		float f=m;
		double d1=m;
		System.out.println(f+" "+d1+" "+b1);

	}

}

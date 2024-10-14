package JavaArrays.Array2;

import java.util.Arrays;

class Masai
{
	String courseName;
	int courseCost;
	String city;

}

public class LaunchArray5
{

	public static void main(String[] args) 
	{
		Masai t=new Masai();

		System.out.println(t);

		System.out.println(t.getClass().getName());
//		
//		System.out.println("*****************************");
//	//	Tech t2=new Tech();
//		
		int a[]=new int[4];
		System.out.println(a);
		System.out.println(a.getClass().getName());

		int ar[][]=new int[4][2];
		System.out.println(ar.getClass().getName());
		
		int array[]= {8,6,2,4};
		
		for(int elem:array)
		{
			System.out.print(elem+ " ");
		}
		System.out.println();
		System.out.println("*********************");
		Arrays.sort(array);
		for(int elem:array)
		{
			System.out.print(elem+ " ");
		}
		System.out.println();
		
		
//		String s="Prateek";
//		s.

	}

}
/*Array - utility class, predifined array object class name*/
package JavaStrings.String2;

public class LaunchString5
{

	public static void main(String[] args)
	{
		String s1="Raja Ram Mohan Roy";

//		String[] str = s1.split("a");
		String[] str = s1.split(" ");
		System.out.println(str.length);//4
		for(String s:str)
		{
			System.out.print(s+"/");
		}
		System.out.println();
		
		String s2="   Raja Ram Mohan Roy  ";
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s2);
		System.out.println(s2.stripTrailing());
		System.out.println(s2.stripLeading());

	}

}

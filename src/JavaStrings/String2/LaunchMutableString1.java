package JavaStrings.String2;

public class LaunchMutableString1 {

	public static void main(String[] args) 
	{
//		StringBuffer s= (String)"prateek"; //CE
//		StringBuffer s= "prateek"; //CE

		StringBuffer sb1=new StringBuffer("prateek");
//		StringBuilder sb1=new StringBuilder("prateek");
		System.out.println(sb1);
		sb1.append(" Alia");
		System.out.println(sb1);
		sb1.append(45.4);
		sb1.append(true);
		System.out.println(sb1);

	}

}

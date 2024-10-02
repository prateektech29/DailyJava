package JavaOPPsFundamentals.H_inheritance;

class Telusko
{
	int age=45;

	Telusko()
	{
		age=100;
	}
	
	void disp()
	{
		age=10;
		System.out.println("Telusko is "+ age+" year old");
	}
}
class Alien extends Telusko   // inherit ->fields and their values ,methods
{


/*	void disp2()
	{
		age--;
		System.out.println(super.age);
	}*/
	
}

//class Demo1
//{
//	
//}
//class Demo2 extends Demo1
//{
//	
//}
public class LaunchInheritance1
{

	public static void main(String[] args)
	{
//		Telusko t=new Telusko();
//		t.disp();
		
		Alien a=new Alien();
		a.disp();


        /*a.disp2();*/
	}

}

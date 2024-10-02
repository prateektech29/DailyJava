package JavaOPPsFundamentals.H_inheritance;

class Telusko1
{
	private String name="Telusko Edu";
	
	void disp()
	{
		System.out.println("Name is "+ name);
	}

	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
}
class Alien1 extends Telusko1
{
	
//	void disp2()
//	{
//		name="alien";
//	}


}


public class LaunchInheritance3 
{

	public static void main(String[] args) 
	{
		Alien1 a=new Alien1();
		a.disp();


		a.setName("Scaler Academy");
		//System.out.println(a.getName());
         a.disp();
	}

}

/* encapsulation and inheritance-
private members do not take part in inheritance (but we can get/set their values using parent class getters/setters)*/
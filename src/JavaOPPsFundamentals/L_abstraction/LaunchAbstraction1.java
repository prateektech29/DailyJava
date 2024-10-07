package JavaOPPsFundamentals.L_abstraction;

//final abstract class AeroPlane2 //illegal
abstract class AeroPlane3
{
	
	static
	{
		System.out.println("AeroPlane3 static block called");
	}
	
	public AeroPlane3()
	{
		System.out.println("AeroPlanr3 Constrctor");
	}
	//abstract int age; Illegal modifier for the field age; only public, protected, private, static, final, transient & volatile are permitted
//	public final abstract void takingOff(); //illegal
	
	public abstract void takingOff();
	
	public abstract void fly();
	
	public abstract void landing();
	
}
class CargoPlane3 extends AeroPlane3
{
	public void takingOff()
	{
		System.out.println("CargoPlane requires longer runway to takeOFF");
	}
	public void fly()
	{
		System.out.println("cargoPlane is flying");
	}
	public void landing()
	{
		System.out.println("cargoplane is landing");
	}
	
}
class FighterPlane3 extends AeroPlane3
{
	public void takingOff()
	{
		System.out.println("FighterPlane requires shorter runway to takeOFF");
	}
	public void fly()
	{
		System.out.println("fighterPlane is flying");
	}
	public void landing()
	{
		System.out.println("fighterplane is landing");
	}
	
}

class PassengerPlane3 extends AeroPlane3
{
	public void takingOff()
	{
		System.out.println("PassengerPlane1 requires meidum runway to takeOFF");
	}
	public void fly()
	{
		System.out.println("PassengerPlane1 is flying");
	}
	public void landing()
	{
		System.out.println("PassengerPlane1 is landing");
	}
	
}

class Airport1
{
	public void permit(AeroPlane3 aeroPlane)
	{
		aeroPlane.takingOff();//1:M
		aeroPlane.fly();
		aeroPlane.landing();
	}
}
public class LaunchAbstraction1
{
	public static void main(String[] args)
	{
		//AeroPlane3 ar=new AeroPlane3(); we cannot create instance/object of an abstract class
		
		CargoPlane3 cp=new CargoPlane3();

		FighterPlane3 fp=new FighterPlane3();
		
		PassengerPlane3 pp=new PassengerPlane3();
		Airport1 a=new Airport1();
		a.permit(cp);
		a.permit(fp);
		a.permit(pp);

	}

}
/*Abstraction - Run time polymorphism,static-block,constructors execution in case of inheritance*/
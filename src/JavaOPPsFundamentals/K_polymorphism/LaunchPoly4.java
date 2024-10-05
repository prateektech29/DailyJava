package JavaOPPsFundamentals.K_polymorphism;

class Animal
{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	
	public void running()
	{
		System.out.println("Animal is running");
	}
}

class Tiger extends Animal
{
	public void eat()
	{
		System.out.println("Tiger hunts and eats");
	}
	
	public void running()
	{
		System.out.println("Tiger is running to hunt");
	}
}

class Monkey extends Animal
{
	public void eat()
	{
		System.out.println("Monkey steals and eats");
	}
	
	public void running()
	{
		System.out.println("Monkey is running after stealing");
	}
}

class Forest
{
	public void permit(Animal animal)
	{
		animal.eat();//1:M
		animal.running();
	}
}

public class LaunchPoly4 
{

	public static void main(String[] args) 
	{
		
		Tiger t=new Tiger();
		
		Monkey m=new Monkey();
		
		Forest f=new Forest();
		f.permit(t);
		f.permit(m);
	}

}

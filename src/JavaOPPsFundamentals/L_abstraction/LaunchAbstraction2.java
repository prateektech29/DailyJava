package JavaOPPsFundamentals.L_abstraction;

abstract class Animal1
{
	
	 public abstract void eat();
	
	
	 public void running()
	{
		System.out.println("Animal is running");
	}
}

class Tiger1 extends Animal1
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

class Monkey1 extends Animal1
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

class Forest1
{
	public void permit(Animal1 animal)
	{
		animal.eat();//1:M
		animal.running();
	}
}

public class LaunchAbstraction2
{

	public static void main(String[] args) 
	{
		
		Tiger1 t=new Tiger1();
		
		
		Monkey1 m=new Monkey1();
		
		Forest1 f=new Forest1();
		f.permit(t);
		f.permit(m);
	}

}
/*Showcasing how Run time polymorphism can be achieved via abstract class*/
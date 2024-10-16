package JavaInterfacesAndLambdas.Topic2LooseCoupling.UdemyAssociationProject2.main;

import JavaInterfacesAndLambdas.Topic2LooseCoupling.UdemyAssociationProject2.service.*;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		Udemy udemy =new Udemy(new Java());
		
		//udemy.setCourse(new SpringBoot());
		
		
		Boolean status= udemy.buyTheCourse(2500.0);
		if(status)
			System.out.println("Course Purchased Successfully");
		else
			System.out.println("Failed to buy the course");

	}

}

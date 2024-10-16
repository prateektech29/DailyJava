package JavaInterfacesAndLambdas.Topic2LooseCoupling.UdemyAssociationProject2.main;

import JavaInterfacesAndLambdas.Topic2LooseCoupling.UdemyAssociationProject2.service.ICourse;

public class Udemy
{
	private ICourse course;

	
	public Udemy(ICourse course)
	{
		super();
		this.course = course;
	}
	
	public Udemy()
	{
		super();
	}

	public void setCourse(ICourse course) 
	{
		this.course = course;
	}
	public Boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
	
}

package JavaInterfacesAndLambdas.Topic2LooseCoupling.UdemyAssociationProject2.service;

public class SpringBoot implements ICourse 
{

	@Override
	public Boolean getTheCourse(Double amount) 
	{
		System.out.println("SpringBoot Course purchased and the price paid is "+ amount);
		return true;
	}

}

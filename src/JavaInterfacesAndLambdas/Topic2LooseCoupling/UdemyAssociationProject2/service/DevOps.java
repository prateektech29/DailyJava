package JavaInterfacesAndLambdas.Topic2LooseCoupling.UdemyAssociationProject2.service;

public class DevOps implements ICourse {

	@Override
	public Boolean getTheCourse(Double amount) 
	{
		System.out.println("DevOps Course purchased and the price paid is "+ amount);
		return true;
	}

}

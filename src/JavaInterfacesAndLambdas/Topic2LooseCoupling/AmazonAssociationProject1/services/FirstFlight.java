package JavaInterfacesAndLambdas.Topic2LooseCoupling.AmazonAssociationProject1.services;

public class FirstFlight implements IDeliveryService 
{

	@Override
	public Boolean deliverProduct(Double amount)
	{
		System.out.println("Product delivered through FirstFlight and amount paid is "+ amount);
		return true;
	}

}

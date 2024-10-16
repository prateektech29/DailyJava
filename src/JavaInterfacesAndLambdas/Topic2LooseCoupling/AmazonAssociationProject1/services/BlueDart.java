package JavaInterfacesAndLambdas.Topic2LooseCoupling.AmazonAssociationProject1.services;

public class BlueDart implements IDeliveryService
{

	@Override
	public Boolean deliverProduct(Double amount)
	{
		System.out.println("Product delivered through Bluedart and amount paid is "+ amount);
		return true;
	}

}

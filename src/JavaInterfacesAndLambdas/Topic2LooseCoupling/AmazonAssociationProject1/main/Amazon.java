package JavaInterfacesAndLambdas.Topic2LooseCoupling.AmazonAssociationProject1.main;

import  JavaInterfacesAndLambdas.Topic2LooseCoupling.AmazonAssociationProject1.services.IDeliveryService;
public class Amazon 
{
	private IDeliveryService service;
	
	public Amazon(IDeliveryService service)
	{
		this.service = service;
	}
	
	public void setService(IDeliveryService service)//IDeliveryService service =new FedEx();
	{
		this.service = service;
	}
	
	public Amazon()
	{

	}

	public Boolean deliverTheProduct(Double amount)
	{
		
		return service.deliverProduct(amount);
		
		
//		Boolean status=fed.deliverProduct(amount);
//		
//		return status;
	}

}

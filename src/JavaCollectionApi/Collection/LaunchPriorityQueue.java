package JavaCollectionApi.Collection;

import java.util.PriorityQueue;

public class LaunchPriorityQueue 
{

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);

		System.out.println(pq);
		pq.add(125);
		System.out.println(pq);
		try {
			pq.add(null); // NullPointerException

		}
		catch (Exception e)
		{
          e.printStackTrace();
			System.out.println("Enter a non null value");
			System.out.println("Printing the stack trace below");
		}
	}

}

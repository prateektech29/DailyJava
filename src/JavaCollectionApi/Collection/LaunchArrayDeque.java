package JavaCollectionApi.Collection;

import java.util.ArrayDeque;

public class LaunchArrayDeque 
{

	public static void main(String[] args) 
	{
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		System.out.println(ad);
		ad.add(40);

		System.out.println(ad);

		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		ad.addFirst(75);
		ad.addLast(715);
		System.out.println(ad);
		ad.offer(5);
		ad.offerFirst(55);
		ad.offerLast(555);
		System.out.println(ad);
      // ad.add(null); // NullPointerException


	}

}
//it doesn't have get-set methods just like ArrayList class
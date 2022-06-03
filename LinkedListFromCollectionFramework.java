package DSA;

import java.util.LinkedList;

public class LinkedListFromCollectionFramework
{

	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();

		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);

		list.addFirst("This");
		list.addLast("list"); // by default adds at last but for first we have to specify
		System.out.println(list);
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + "  -> "); // if(list.get(i)==value ) for search
		}
		System.out.println("null");

		list.removeFirst();
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

		list.remove(1);
		System.out.println(list);

	}


}

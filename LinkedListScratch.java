package DSA;

public class LinkedListScratch
{
	Node head;
	private int size;

	LinkedListScratch()
	{
		this.size = 0;
	}

	class Node
	{
		String data;
		Node next;

		Node(String data)
		{
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// add-first , last

	public void addFirst(String data)
	{

		Node newNode = new Node(data);

		if (head == null)
		{
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	// add-last

	public void addLast(String data)
	{

		Node newNode = new Node(data);

		if (head == null)
		{
			head = newNode;
			return;
		}

		Node currentNode = head;

		while (currentNode.next != null)
		{
			currentNode = currentNode.next;
		}

		currentNode.next = newNode;
	}

	// print

	public void printList()
	{

		if (head == null)
		{
			System.out.println("List is empty");
			return;
		}

		Node currentNode = head;

		while (currentNode != null)
		{
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}

		System.out.println(" Null");

	}

	// delete-first

	public void deleteFirst()
	{
		// corner case
		if (head == null)
		{
			System.out.println("The list is empty");
			return;
		}

		size--;

		head = head.next;

	}

	// delete-last

	public void deleteLast()
	{

		// corner case
		if (head == null)
		{
			System.out.println("The list is empty");
			return;
		}

		size--;

		if (head.next == null)
		{
			head = null;
			return;
		}

		Node secondLast = head;
		Node lastNode = head.next;

		while (lastNode.next != null)
		{
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}

		// corner case : if head.next first thekei null mane ekta element then
		// lastNode.next not possible

		secondLast.next = null;
	}

	public int getSize()
	{
		return size;
	}

	public static void main(String[] args)
	{

		LinkedListScratch list = new LinkedListScratch();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();

		list.addLast("list");
		list.printList();

		list.addFirst("This");
		list.printList();

		list.deleteFirst();
		list.printList();

		list.deleteLast();
		list.printList();
		
		
		System.out.println(list.getSize());

		list.addFirst("This");
		System.out.println(list.getSize());
	}

}

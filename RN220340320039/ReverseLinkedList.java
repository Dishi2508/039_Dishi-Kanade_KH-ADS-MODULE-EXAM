import java.util.*;
class ReverseLinkedList
{
	Node head = null;
	static int t;
	static int n;
	static int m;
	static int l;
	
	static class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	Node reverse(Node node)
	{
		Node prev = null;
		Node temp = node;
		Node next = null;
		while(temp != null)
		{
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		node = prev;
		return node;
	}
	
	void displayLinkedList(Node node)
	{
		while(node != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public static void main(String args[ ])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Test Case : ");
		t = sc.nextInt( );
		/*System.out.println("Enter no. of elements of list : ");
		n = sc.nextInt( );
		do
		{
			System.out.println("Enter data : ");
			int data = sc.nextInt( );
		    System.out.println("Press 1 to continue adding data");
		    m = sc.nextInt( );
			System.out.println("Press 0 to stop");
			l = sc.nextInt( );
		}
		while(m != 0);
			//System.out.println("Linked list is " );*/
	    ReverseLinkedList list = new ReverseLinkedList( );
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next =  new Node(3);
		list.head.next.next =  new Node(4);
		list.head.next.next.next = new Node(5);
		
		head = list.reverse(head);
	}
}

		
		
}

		
		
	
	
 package queue;

public class queue<T> {
	class Node{
		T data;
		Node next;
		Node(T val)
		{
			data = val;
			next= null;
			}
		}
	Node front,rear;
	int size=0;
	queue()
	{
		front = null;
		rear = null;
		}
	public void enqueue(T val)
	{
		Node newNode = new Node(val);
		if(front == null)
			front = newNode;
		else
			rear.next = newNode;
			rear = newNode;
			size++;
			}
	public T dequeue()
	{
		if(front == null)
		{
			System.out.println("stack is empty");
			return null;
			}
		T temp = front.data;
		front = front.next;
			rear = null;
			size--;
		return temp;
		}
	public boolean  isEmpty()
	{
		return front == null;
		}
	public int size () {

	    return size;
	  }
	
	public void display() {
		Node newNode = front;
		while(newNode != null)
		{
			System.out.print(newNode.data + " ");
			newNode = newNode.next;
		}
	}
	public T peek() {
	if(front == null)
	{
		System.out.println("stack is empty");
		return null;
		}
	
		return front.data;
		}
	}


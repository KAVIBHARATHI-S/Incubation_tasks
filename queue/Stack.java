package queue;

public class Stack<T> {
private int length;
class Node
	{
	    T data;
	    Node next;
	    Node(T val){
	    data = val;
	    next = null;
		}
	   }
            Node top;
            Stack(){
            top = null;
       }

public void push(T val)
	    {
			Node newNode = new Node(val); 
			newNode.next = top;
			top=newNode;
			length ++;
		}
public T pop()
	{
	T newNode =null;
		if(top == null)
		{
			System.out.println("stack is empty");
			}
		else {
		newNode = top.data;
		top = top.next;
		length--;
		
	}
		return newNode;
	}

public boolean isEmpty()
	{
		return top == null;
	}

public T peek()
	{	
		return top.data;
	}

public void display()
        {
			Node newNode = top;
			while(newNode != null)
		{
				System.out.print(newNode.data +" ");
				newNode = newNode.next;
   }
        }

public int size()
{
return length;
}
}
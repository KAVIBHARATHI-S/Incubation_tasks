package queue;
import java.util.*;

import queue.queue;
public class Mains {
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	queue<String> s =new queue<String>();
	boolean start= true;	
	while(start)
	{
		System.out.println("\n1. enqueue\n2. dequeue\n3. Peek\n4. Size\n5. Display" );
		System.out.println("Enter your choice" );
				int choice=sc.nextInt();
	switch(choice) 
	{
	  case 1:
		  System.out.println("Enter your value " );
		  String v=sc.next();
		  s.enqueue(v);
		  break;
	 case 2:
		  System.out.println("dequeue is: " + s.dequeue());	    
	    break;
	 case 3:
		  System.out.println("peek is: " + s.peek());
		    break;
	 case 4:
		  System.out.println("size is: " + s.size());
		  break;
	 case 5:
		   s.display();
		    break;
	 case 0:
			start=false;
			break;
			
			    
			}
		}	
	}	
}

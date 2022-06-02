package queue;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	Stack<String> s =new Stack<String>();
	boolean start= true;	
	while(start)
	{
		System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Size\n5. Isempty\n6. Display" );
		System.out.println("Enter your choice" );
				int choice=sc.nextInt();
	switch(choice) 
	{
	  case 1:
		  System.out.println("Enter your number " );
		  String v=sc.next();
		  s.push(v);
		  break;
	 case 2:
		  System.out.println("popped is: " + s.pop());	    
	    break;
	 case 3:
		  System.out.println("peek is: " + s.peek());
		    break;
	 case 4:
		  System.out.println("size is: " + s.size());
		  break;
	 case 5:
		  System.out.println(s.isEmpty());
		  break;
	 case 6:
		   s.display();
		    break;
	 case 0:
			start=false;
			break;
			    
		}
		}	
	}	
}
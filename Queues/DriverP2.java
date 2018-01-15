/*
* Purpose: Data Structure and Algorithms Lab 6 Problem 2
* Status: Complete and thoroughly tested
* Last update: 02/27/17
* Submitted:  03/01/17
* Comment: test suite and sample run attached
* @author: Philip Quinn
* @version: 2017.02.27
*/
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class DriverP2 {

	    private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

	    public static void main(String args[])throws IOException
	    {
	        Deq<String> deq = new Deq<String>();
	        String obj;
	        int choice = 0;
	        do {
	            System.out.print("Select from the following menu:\n1. Insert item at back of Deq.\n2. Insert item at front of Deq.\n3. Remove item from front of Deq.\n4. Remove item from back of Deq.\n5. Display item from front of Deq.\n6. Display item from back of Deq.\n7. Clear Deq.\n8. Display content of deq.\n9. Exit program.\nMake your selection now: ");
	            choice = Integer.parseInt(stdin.readLine());
	            System.out.println(choice);
	            switch(choice) {
	            case(1):
	                System.out.print("You are now inserting an item into the deq.\nEnter item: ");
	                obj = stdin.readLine();
	                System.out.println(obj);
	                deq.enqueue(obj);
	                System.out.println("Item " + obj + " inserted at back of deq.");
	                break;
	            case(2)://insert at front
	                System.out.print("You are now inserting an item into the deq.\nEnter item: ");
	            	obj = stdin.readLine();
	            	System.out.println(obj);
	            	deq.enqueueFirst(obj);
	                System.out.println("Item " + obj + " inserted at front of deq.");
	            	break;
	            case(3):
	            	try{
		                System.out.println("Item " + deq.dequeue() + " removed from front of deq.");	            		
	            	}
	            	catch(QueueException e)
	            	{
	            		System.out.println("There are no items in this deq.");
	            	}
	                break;
	            case(4)://remove from back
	            	try
	            	{
	            		System.out.println("Item " + deq.dequeueLast() + " removed from back of deq.");
	            	}	
	            	catch(ExtendedQueueException e)
	            	{
	            		System.out.println("There are no items in this deq.");
	            	}	
	            	break;
	            case(5):
	            	try
	            	{
		                System.out.println("Item " + deq.peek() + " retrieved from the front of deq.");
	            	}
	            	catch(QueueException e)
	            	{
	            		System.out.println("There are no items in this deq.");
	            	}
	                break;
	            case(6)://peekLast
	            	try
	            	{
		                System.out.println("Item " + deq.peekLast() + " retrieved from the back of deq.");
	            	}
	            	catch(QueueException e)
	            	{
	            		System.out.println("There are no items in this deq.");
	            	}
	            	break;
	            case(7):
	                deq.dequeueAll();
	                break;
	            case(8):
	            	if(deq.isEmpty())
	            	{
	            		System.out.println("Empty deq.");
	            	}
	            	else
	            	{
	            		System.out.println(deq);
	            	}
	            	break;
	            default:
	            }
	        } while(choice != 9);
	        System.out.println("Exiting program...Good Bye");
	    }
	}

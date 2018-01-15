/*
* Purpose: Data Structure and Algorithms Lab 6 Problem 1
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

	public class DriverP1 {

	    private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

	    public static void main(String args[])throws IOException
	    {
	        Queue<String> queue = new Queue<String>();
	        String obj;
	        int choice = 0;
	        do {
	            System.out.print("Select from the following menu:\n1. Insert item at back of queue.\n2. Remove item from front of queue.\n3. Display item from front of queue.\n4. Clear queue.\n5. Display content of queue.\n6. Exit program.\nMake your selection now: ");
	            choice = Integer.parseInt(stdin.readLine());
	            System.out.println(choice);
	            switch(choice) {
	            case(1):
	                System.out.print("You are now inserting an item into the queue.\nEnter item: ");
	                obj = stdin.readLine();
	                System.out.println(obj);
	                queue.enqueue(obj);
	                System.out.println("Item " + obj + " inserted into queue.");
	                break;
	            case(2):
	            	try{
		                System.out.println("Item " + queue.dequeue() + " removed from queue.");	            		
	            	}
	            	catch(QueueException e)
	            	{
	            		System.out.println("There are no items in this queue.");
	            	}
	                break;
	            case(3):
	            	try
	            	{
		                System.out.println("Item " + queue.peek() + " retrieved from the queue.");
	            	}
	            	catch(QueueException e)
	            	{
	            		System.out.println("There are no items in this queue.");
	            	}
	                break;
	            case(4):
	                queue.dequeueAll();
	                break;
	            case(5):
	            	if(queue.isEmpty())
	            	{
	            		System.out.println("Empty queue.");
	            	}
	            	else
	            	{
	            		System.out.println(queue);
	            	}
	            	break;
	            default:
	            }
	        } while(choice != 6);
	        System.out.println("Exiting program...Good Bye");
	    }
	}

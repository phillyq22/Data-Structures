/*
 * Purpose: Data Structure and Algorithms Lab 4 Problem 1
 * Status: Complete and thoroughly tested
 * Last update: 02/11/17
 * Submitted:  02/16/17
 * Comment: test suite and sample run attached
 * @author: Philip Quinn
 * @version: 2017.02.11
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DriverArray {

    private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String args[])throws IOException
    {
        Stack<Integer> stack = new Stack<Integer>();
        Integer obj;
        int choice = 0;
        do {
            System.out.print("Select from the following menu:\n1. Push item onto stack.\n2. Pop item from stack.\n3. Display top item from stack.\n4. Clear.\n5. Exit program.\nMake your selection now: ");
            choice = Integer.parseInt(stdin.readLine());
            System.out.println(choice);
            switch(choice) {
            case(1):
                System.out.print("You are now inserting an item onto the stack.\nEnter item: ");
                obj = Integer.parseInt(stdin.readLine());
                System.out.println(obj);
                stack.push(obj);
                System.out.println("Item " + obj + " inserted onto stack.");
                break;
            case(2):
                System.out.println("Item " + stack.pop() + " removed from stack.");
                break;
            case(3):
                System.out.println("Item " + stack.peek() + " retrieved from the stack.");
                break;
            case(4):
                stack.popAll();
                break;
            default:

            }
        } while(choice != 5);
        System.out.println("Exiting program...Good Bye");
    }
}

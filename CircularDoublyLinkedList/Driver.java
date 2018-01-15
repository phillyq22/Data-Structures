import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

    private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String args[])throws IOException
    {
        ListCDLSBased<Object> cdls = new ListCDLSBased<Object>();
        Object obj;
        int index;
        int choice = 0;
        do {
            System.out.print("Select from the following menu:\n1. Insert item to list.\n2. Remove item from list.\n3. Get item from list.\n4. Clear list.\n5. Print size and contents of list.\n6. Exit program.\nMake your selection now: ");
            choice = Integer.parseInt(stdin.readLine());
            System.out.println(choice);
            switch(choice) {
            case(1):
                System.out.print("You are now inserting an item into the list.\nEnter item: ");
                obj = stdin.readLine();
                System.out.println(obj);
                System.out.print("Enter position to insert item in: ");
                index = Integer.parseInt(stdin.readLine());
                System.out.println(index);
                try
                {
                    cdls.add(index, obj);
                    System.out.println("Item " + obj + " inserted in position " + index + " in the list.");
                }
                catch(ListIndexOutOfBoundsException e)
                {
                    System.out.println("Position specified is out of range!");
                }
                break;
            case(2):
                System.out.print("You are now removing an item from the list.\nEnter index: ");
                index = Integer.parseInt(stdin.readLine());
                System.out.println(index);
                try
                {
                	obj = cdls.get(index);
                    cdls.remove(index);
                    System.out.println("Item " + obj + " removed from position " + index + " in the list.");
                }
                catch(ListIndexOutOfBoundsException e)
                {
                    System.out.println("Positon specified is out of range!");
                }
                break;
            case(3):
                System.out.print("Enter position to retrieve item from: ");
                index = Integer.parseInt(stdin.readLine());
                System.out.println(index);
                try
                {
                    System.out.println("Item " + cdls.get(index) + " retrieved from position " + index + " in the list.");
                }
                catch(ListIndexOutOfBoundsException e)
                {
                    System.out.println("Position specified is out of range!");
                }
                break;
            case(4):
                cdls.removeAll();
                break;
            case(5):
                if(cdls.isEmpty())
                {
                    System.out.println("List is empty");
                }
                else
                {
                    System.out.println("List of size " + cdls.size() + " has the following items: " + cdls.toString());
                }
            break;
            default:

            }
        } while(choice != 6);
        System.out.println("Exiting program...Good Bye");
    }
}


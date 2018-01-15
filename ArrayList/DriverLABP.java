import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DriverLABP {

    private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String args[])throws IOException
    {
        ListArrayBasedPlus labp = new ListArrayBasedPlus();
        String obj = "";
        int index;
        int choice = 0;
        do {
            System.out.print("Select from the following menu:\n1. Insert item to list.\n2. Remove item from list.\n3. Get item from list.\n4. Clear list.\n5. Print size and content of list.\n6. Reverse list.\n7. Exit program.\nMake your selection now: ");
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
                    labp.add(index, obj);
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
                    labp.remove(index);
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
                if(index == labp.items.length)
                {
                    System.out.println("Position specified is out of range!");
                }
                try
                {
                    System.out.println("Item " + labp.get(index) + " retrieved from position " + index + " in the list.");
                }
                catch(ListIndexOutOfBoundsException e)
                {
                    System.out.println("Position specified is out of range!");
                }
                break;
            case(4):
                labp.removeAll();
                break;
            case(5):
                if(labp.isEmpty())
                {
                    System.out.println("List is empty");
                }
                else
                {
                    System.out.println("List of size " + labp.size() + " has the following items: " + labp.toString());
                }
            break;
            case(6):
                labp.reverse();
                System.out.println("List reversed.");
                break;
            default:

            }
        } while(choice != 7);
        System.out.println("Exiting program...Good Bye");
    }
}

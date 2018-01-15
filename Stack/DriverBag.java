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

public class DriverBag {

    private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String args[])throws IOException
    {
        Stack<Layer> stack = new Stack<Layer>();
        int numItems = 0;
        double weight = 0.0;
        int layers = 0;
        double bagWeight = 0.0;

        Stack<Double> sampleBag = new Stack<Double>();
        int sampleBagItems = 0;
        double sampleBagWeight = 0.0;

        int choice = 0;
        do {
            System.out.print("Select from the following menu:\n1. Place a layer of item(s) in the bag.\n2. Remove a layer of item(s) from the bag.\n3. Display the weight of the bag.\n4. Dispaly the number of layers in the bag.\n5. Display the number of items and the weight of the sample bag.\n6. Remove an item from the sample bag.\n7. Empty the sample bag.\n8. Exit.\nMake your selection now: ");
            choice = Integer.parseInt(stdin.readLine());
            System.out.println(choice);
            switch(choice) {
            case(1):
                System.out.print("Enter number of items to place in bag: ");
                numItems = Integer.parseInt(stdin.readLine());
                System.out.println(numItems);
                System.out.print("Enter weight of item (lb): ");
                weight = Double.parseDouble(stdin.readLine());
                System.out.println(weight);
                Layer layer = new Layer(numItems, weight);
                stack.push(layer);
                bagWeight += (weight*numItems);
                layers++;
                System.out.println(numItems + " items weighing " + weight + " lbs have been placed in the bag.");
                break;
            case(2):
                if(layers != 0)
                {
                        Layer curr = (Layer) stack.peek();
                        stack.pop();
                        System.out.println(curr.getNumItems() + " items have been removed from the bag");
                        bagWeight -= curr.getWeight();
                        layers--;
                        System.out.print("Would you like to store a smaple from this layer(Y/N)?");
                        String answer = stdin.readLine();
                        System.out.println(answer);
                        if(answer.equalsIgnoreCase("Y"))
                        {
                                double itemWeight = curr.getWeightOfItem();
                                sampleBag.push(itemWeight);
                                sampleBagItems++;
                                sampleBagWeight += itemWeight;
                                System.out.println("Sample stored.");
                        }
                }
                else
                {
                        System.out.println("Error: Empty bag.");
                }
                break;
            case(3):
                if(bagWeight != 0)
                {
                    System.out.println("The weight of the bag is " + bagWeight + " lbs.");
                }
                else
                {
                        System.out.println("The bag is empty: Weight is 0 lbs.");
                }
                break;
            case(4):
                if(layers != 0)
                {
                        System.out.println("The number of layers in the bag is " + layers + ".");
                }
                else
                {
                        System.out.println("The bag is empty: No layers.");
                }
                break;
            case(5):
                if(sampleBagItems != 0)
                {
                        System.out.println("The number of items in the sample bag is " + sampleBagItems + ".");
                        System.out.println("The sample bag weighs " + sampleBagWeight + " lbs.");
                }
                else
                {
                        System.out.println("The sample bag is empty: No items.");
                }
                break;
            case(6):
                if(sampleBagItems != 0)
                {
                        Double curr = sampleBag.pop();
                        sampleBagItems--;
                        sampleBagWeight -= curr;
                        System.out.println("An item weighing " + curr + " lbs has been removed from the sample bag.");
                }
                else
                {
                        System.out.println("Error: Empty sample bag.");
                }
                break;
            case(7):
                sampleBag = new Stack<Double>();
                sampleBagItems = 0;
                sampleBagWeight = 0;
                System.out.println("The sample bag has been emptied.");
                break;
            default:

            }
        } while(choice != 8);
        System.out.println("Exiting program...Good Bye");
    }
}

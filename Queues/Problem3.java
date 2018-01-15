import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
    private static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
    public static void main(String args[])throws IOException
    {
    	boolean isPalindrome = true;
    	boolean wasMinus = false;
    	boolean period = false;
    	boolean isEqual = true;
    	int leftLength = 0;
    	int rightLength = 0;
    	ListArrayBasedPlus<Character> left = new ListArrayBasedPlus<Character>();
		System.out.print("Enter Character: ");
    	char input = stdin.readLine().toLowerCase().charAt(0);
    	System.out.println(input);
    	while(input != '-' && input != '.')
    	{
    		left.add(leftLength, input);
    		leftLength++;
    		System.out.print("Enter Character: ");
    		input = stdin.readLine().toLowerCase().charAt(0);
        	System.out.println(input);
    	}
    	if(input == '-')
    	{
    		wasMinus = true;
    	}
    	if(input == '.')
    	{
    		period = true;
    	}
    	if(wasMinus)
    	{
    		while(!period)
        	{
        			for(int i = 0; i < leftLength && isEqual ; i++)
        			{
            			System.out.print("Enter Character: ");
        				input = stdin.readLine().toLowerCase().charAt(0);
                    	System.out.println(input);
                		if(input != '.')
                		{
            				char curr = left.get(i);
            				isEqual = (curr == input);
            				if(!isEqual)
            				{
            					isPalindrome = false;
            				}
            				if((i < leftLength/2 && isPalindrome) && isEqual)
            				{
            					isPalindrome = (left.get(leftLength - rightLength - 1) == curr);
            				}
                		}
        				else
        				{
        					period = true;
        					i = leftLength;
        				}
        			}
        			rightLength++;
        		}
        		
        	}
    	
    	
    	if(wasMinus)
    	{
    		if(leftLength > rightLength)
    		{
    			System.out.println("Left longer.");
    		}
    		else if(rightLength > leftLength)
    		{
    			System.out.println("Right longer.");
    		}
    		else
    		{
    			if(isEqual && isPalindrome)
    			{
    				System.out.println("Same length and content, palindrome.");
    			}
    			else if(isEqual && !isPalindrome)
    			{
    				System.out.println("Same length and content, no palindrome.");
    			}
    			else
    			{
    				System.out.println("Same length, different content.");
    			}
    		}
    	}
    	else
    	{
    		System.out.println("No minus.");
    	}
    }
}

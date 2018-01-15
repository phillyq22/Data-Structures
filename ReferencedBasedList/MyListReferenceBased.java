/*
 * Purpose: Data Structure and Algorithms Lab 3 Problem 1
 * Status: Complete and thoroughly tested
 * Last update: 02/9/17
 * Submitted:  02/10/17
 * Comment: test suite and sample run attached
 * @author: Philip Quinn
 * @version: 2017.02.09
 */
public class MyListReferenceBased<T> implements ListInterface<T>
{
    // reference to linked list of items
    private Node<T> head;

    public MyListReferenceBased()
    {
        head = null;
    }  // end default constructor

    public boolean isEmpty()
    {
        return head == null;
    }  // end isEmpty

    public int size()
    {
        Node<T> curr = head;
        int i = 0;
        while(curr != null)
        {
            curr = curr.getNext();
            i++;
        }
        return i;
    }  // end size

    private Node<T> find(int index)
    {
        // --------------------------------------------------
        // Locates a specified Node<T> in a linked list.
    	 // Precondition: index is the number of the desired
        // Node<T>. Assumes that 0 <= index <= numItems
        // Postcondition: Returns a reference to the desired
        // Node<T>.
        // --------------------------------------------------
        Node<T> curr = head;
        for (int skip = 0; skip < index; skip++)
        {
            curr = curr.getNext();
        } // end for
        return curr;
    } // end find

    public T get(int index)throws ListIndexOutOfBoundsException
    {
        if (index >= 0 && index < size())
        {
            // get reference to Node<T>, then data in Node<T>
            Node<T> curr = find(index);
            T dataItem = curr.getItem();
            return dataItem;
        }
        else
        {
            throw new ListIndexOutOfBoundsException(
                "List index out of bounds exception on get");
        } // end if
    } // end get

    public void add(int index, T item) throws ListIndexOutOfBoundsException
    {
        if (index >= 0 && index < size()+1)
        {
            if (index == 0)
            {   // insert the new Node<T> containing item at
                // beginning of list
                Node<T> newNode = new Node<T>(item, head);
                head = newNode;
            }
            else
            {
                Node<T> prev = find(index-1);
                // insert the new Node<T> containing item after
                // the Node<T> that prev references
                Node<T> newNode = new Node<T>(item, prev.getNext());
                prev.setNext(newNode);
            } // end if
        }
        else
        {
            throw new ListIndexOutOfBoundsException(
                "List index out of bounds exception on add");
        } // end if
    }  // end add

    public void remove(int index)
    throws ListIndexOutOfBoundsException
    {
        if (index >= 0 && index < size())
        {
            if (index == 0)
            {
                // delete the first Node<T> from the list
                head = head.getNext();
            }
            else
            {
                Node<T> prev = find(index-1);
                // delete the Node<T> after the Node<T> that prev
                // references, save reference to Node<T>
                Node<T> curr = prev.getNext();
                prev.setNext(curr.getNext());
            } // end if
        } // end if
        else
        {
            throw new ListIndexOutOfBoundsException(
                "List index out of bounds exception on remove");
        } // end if
    } // end if


public void removeAll()
{
    // setting head to null causes list to be
    // unreachable and thus marked for garbage
    // collection
    head = null;
} // end removeAll

public String toString()
{
    String returnString = "";
    Node<T> curr = head;
    while(curr != null)
    {
        returnString += curr.getItem() + " ";
        curr = curr.getNext();
    }
    return returnString;
}

} // end ListReferenceBased

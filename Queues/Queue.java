/*
* Purpose: Data Structure and Algorithms Lab 6 Problem 1
* Status: Complete and thoroughly tested
* Last update: 02/27/17
* Submitted:  03/01/17
* Comment: test suite and sample run attached
* @author: Philip Quinn
* @version: 2017.02.27
*/
public class Queue<T> implements QueueInterface<T>{

	T[] items = (T[])new Object[3];
	int front = 0;
	int back = 0;
	int numItems = 0;
	
	public boolean isEmpty() {
		return numItems == 0;
	}

	public void enqueue(T newItem) throws QueueException{
		if(numItems == items.length)
		{
			resize();
		}
		items[back] = newItem;
		back = (back+1)%items.length;
		numItems++;		
	}
	
	public T dequeue() throws QueueException {
		T item = items[front];
		if(numItems != 0)
		{
			items[front] = null;
			front = (front+1)%items.length;
			numItems--;
		}
		else
		{
			throw new QueueException("Error on dequeue");
		}
		return item;
	}

	public void dequeueAll() {
		items = (T[]) new Object[3];
		front = 0;
		back = 0;
		numItems = 0;
	}

	public T peek() throws QueueException {
		if(numItems != 0)
		{
			return items[front];
		}
		else
		{
			throw new QueueException("Error on peek.");
		}
	}

	public String toString()
	{
		String returnString = "";
		for(int i = 0; i < numItems; i++)
		{
			returnString += (items[(i+front)%items.length] + " ");
		}
		return returnString;
	}
	protected void resize()
	{
		T[] newItems = (T[]) new Object[items.length*2];
		for(int i = 0; i < numItems; i++)
		{
			newItems[i] = items[(front+i)%(items.length)];
		}
		front = 0;
		back = numItems;
		items = newItems;
	}
}

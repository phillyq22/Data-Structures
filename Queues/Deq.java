/*
* Purpose: Data Structure and Algorithms Lab 6 Problem 2
* Status: Complete and thoroughly tested
* Last update: 02/27/17
* Submitted:  03/01/17
* Comment: test suite and sample run attached
* @author: Philip Quinn
* @version: 2017.02.27
*/
public class Deq<T> extends Queue<T> implements ExtendedQueueInterface<T>{

	public void enqueueFirst(T newItem) throws ExtendedQueueException {
		if(numItems == items.length)
		{
			resize();
		}
		front = (front+items.length-1)%items.length;
		items[front] = newItem;
		numItems++;
	}

	public T dequeueLast() throws ExtendedQueueException {
		if(numItems != 0)
		{
			back = (back+items.length-1)%items.length;
			T last = items[back];
			items[back] = null;
			numItems--;
			return last;
		}
		else
		{
			throw new ExtendedQueueException("Error on dequeueLast");
		}
	}

	public T peekLast() throws ExtendedQueueException {
		if(numItems != 0)
		{
			return items[back-1];

		}
		else
		{
			throw new ExtendedQueueException("Error on peekLast");
		}
	}
}

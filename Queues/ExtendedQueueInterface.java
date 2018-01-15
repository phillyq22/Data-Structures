/*
* Purpose: Data Structure and Algorithms Lab 6 Problem 2
* Status: Complete and thoroughly tested
* Last update: 02/27/17
* Submitted:  03/01/17
* Comment: test suite and sample run attached
* @author: Philip Quinn
* @version: 2017.02.27
*/
public interface ExtendedQueueInterface<T> {
	  public void enqueueFirst(T newItem) throws ExtendedQueueException;
	  public T dequeueLast() throws ExtendedQueueException;
	  public T peekLast() throws ExtendedQueueException;
}

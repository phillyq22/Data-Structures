
public class Stack <T> implements StackInterface<T>{

	T[] items = ((T[]) new Object[3]);
	int top = -1;
	
	public boolean isEmpty() {
		return top == -1;
	}

	public void popAll() {
		items = (T[]) new Object[3];
		top = -1;
	}

	public void push(T newItem) throws StackException {
		if(top == items.length-1)
		{
			resize();
		}
		items[++top] = newItem;
	}

	public T pop() throws StackException {
		if(top != -1)
		{
			T item = items[top];
			items[top] = null;
			top--;
            return item;
		}
		else
		{
			throw new StackException("Error on pop.");
		}
		
	}

	public T peek() throws StackException {
		if(top != -1)
		{
			return items[top];
		}
		else
		{
			throw new StackException("Error on peek.");
		}
	}
	
	private void resize()
    {
        T[] newArray = (T[])new Object[items.length*2];
        for(int i = 0; i < items.length; i++)
        {
            newArray[i] = items[i];
        }
        items = newArray;
    }
}

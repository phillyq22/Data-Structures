public class NodeD<T>
{
    private T item;
    private NodeD<T> next;
    private NodeD<T> back;

    public NodeD()
    {
    	this.item = null;
    	this.next = this;
    	this.back = this;
    }
    public NodeD(T item)
    {
        this.item = item;
        next = this;
        back = this;
    } // end constructor
    
    public NodeD(T item, NodeD<T> back)
    {
    	this.item = item;
    	this.back = back;
    	this.next = back.getNext();
    }
    
    public NodeD(T item, NodeD<T> next, NodeD<T> back)
    {
        this.item = item;
        this.next = next;
        this.back = back;
    } // end constructor

    public void setItem(T item)
    {
        this.item = item;
    } // end setItem

    public T getItem()
    {
        return item;
    } // end getItem

    public NodeD<T> getNext()
    {
        return next;
    } // end getNext
    
    public NodeD<T> getBack()
    {
        return back;
    } // end getBack

    public void setNext(NodeD<T> next)
    {
        this.next = next;
    } // end setNext

    public void setBack(NodeD<T> back)
    {
        this.back = back;
    } // end setNext

} // end class Node

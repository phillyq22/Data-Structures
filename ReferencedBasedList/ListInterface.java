public interface ListInterface<T>
{
    boolean isEmpty();
    int size();
    void add(int index, T item)
    throws ListIndexOutOfBoundsException;
    Object get(int index)
    throws ListIndexOutOfBoundsException;
    void remove(int index)
    throws ListIndexOutOfBoundsException;
    void removeAll();
}  // end ListInterface


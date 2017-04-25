package Stack_Implementation;

/**
 * Created by Mihail on 3/23/2017.
 */
public class ArrayBasedStack implements Stack{

    private static final int capacity = 8;
    private Object[] s;
    private final int N; // capacity
    private int top = -1;

    public ArrayBasedStack(){
        this (capacity );
    }

    public ArrayBasedStack( int capacity){
        N = capacity;
        s = new Object[ N];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top < 0 ? true : false;
    }

    public Object top() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException( "Stack is Empty");
        return s [top ];
    }

    public Object pop() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException( "Stack is Empty");
        Object item = s[ top];
        s[ top --] = null ;
        return item;
    }

    public void push(Object obj) throws StackOverflowException {
        if (size() == N )
            throw new StackOverflowException( "Stack is Full");
        s[++ top ] = obj;
    }

}

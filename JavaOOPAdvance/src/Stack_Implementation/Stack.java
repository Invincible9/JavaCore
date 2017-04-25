package Stack_Implementation;

/**
 * Created by Mihail on 3/23/2017.
 */
public interface Stack {

    //to get the size of the stack
    public int size();

    //check whether stack is empty or not
    public boolean isEmpty();

    // To get the top element of the stack without removing it.
    public Object top() throws StackEmptyException;

    // To get the top element of the stack after removing it from stack
    public Object pop() throws StackEmptyException;

    //To push the element inside stack.
    public void push(Object obj) throws StackOverflowException ;

}

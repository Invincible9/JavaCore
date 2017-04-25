package IteratorsAndComperators_Exercises.StackIterator_03;

import java.util.Iterator;

/**
 * Created by Mihail on 3/23/2017.
 */
public class StackIterator implements IIterable {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackIterator() {
        this.maxSize = 1000000;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int j) {
        this.stackArray[++top] = j;
    }

    public int pop() throws IllegalArgumentException {
        if (this.isEmpty()) {
            throw new IllegalArgumentException("No elements");
        }else {
            return this.stackArray[top--];
        }
    }

    public void printALl(){
        while(this.top != -1){
            System.out.println(this.stackArray[top--]);
        }
    }

    public long peek() {
        return this.stackArray[top];
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return (this.top == this.maxSize - 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            if(top != -1){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Integer next() {
            return stackArray[top--];
        }
    }

}



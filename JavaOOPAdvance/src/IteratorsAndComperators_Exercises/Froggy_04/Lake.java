package IteratorsAndComperators_Exercises.Froggy_04;

import java.util.Iterator;

/**
 * Created by Mihail on 3/23/2017.
 */
public class Lake implements Iterable<Integer> {

    private int count = 0;
    private int[] stack;
    private int countEven;
    private int countOdd;

    private int lastEl;

    private int capacity;
    private int oddElem;
    private int evenElem;

    public Lake() {
        //default constructor
    }

    public Lake(int size) {
        this.countEven = 0;
        this.countOdd = 0;

        this.capacity = size;
        this.stack = new int[this.capacity];
        this.lastEl = this.stack.length - 1;
        this.oddElem = -1;
        this.evenElem = this.stack.length - 1;
    }

    protected void CreateEl(int element) {
        if (Math.abs(element) % 2 == 1) {
            this.stack[++this.oddElem] = element;
            this.countOdd++;
        } else {
            this.stack[this.evenElem--] = element;
            this.countEven++;
        }
    }

    public void printElements() {

        if (this.countOdd != 0) {
            for (int i = 0; i < this.countOdd; i++) {
                if (i != this.countOdd - 1) {
                    System.out.print(String.valueOf(this.stack[i]) + ", ");
                } else {
                    System.out.print(String.valueOf(this.stack[i]));
                }
            }
        }

        if (this.countEven != 0) {
            if (this.evenElem == -1) {
                for (int i = this.stack.length - 1; i >= 0; i--) {
                    if (i > 0) {
                        System.out.print(String.valueOf(this.stack[i]) + ", ");
                    } else {
                        System.out.print(String.valueOf(this.stack[i]));
                    }
                }
            } else {
                System.out.print(", ");

                if (this.countOdd > this.countEven && this.stack.length % 2 == 0) {
                    for (int i = this.stack.length - 1; i >= this.countOdd; i--) {
                        if (i > this.countOdd) {
                            System.out.print(String.valueOf(this.stack[i]) + ", ");
                        } else {
                            System.out.print(String.valueOf(this.stack[i]));
                        }
                    }
                } else if (this.evenElem == 0) {
                    for (int i = this.stack.length - 1; i > this.evenElem; i--) {
                        if (i > this.evenElem + 1) {
                            System.out.print(String.valueOf(this.stack[i]) + ", ");
                        } else {
                            System.out.print(String.valueOf(this.stack[i]));
                        }
                    }
                } else if (this.stack.length % 2 == 0) {
                    for (int i = this.stack.length - 1; i >= this.countEven; i--) {
                        if (i > this.countEven) {
                            System.out.print(String.valueOf(this.stack[i]) + ", ");
                        } else {
                            System.out.print(String.valueOf(this.stack[i]));
                        }
                    }
                } else {
                    for (int i = this.stack.length - 1; i > this.evenElem; i--) {
                        if (i > this.evenElem + 1) {
                            System.out.print(String.valueOf(this.stack[i]) + ", ");
                        } else {
                            System.out.print(String.valueOf(this.stack[i]));
                        }
                    }
                }
            }
        }
    }

    protected int size() {
        return this.stack.length;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            if (count != countOdd && lastEl != countEven) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Integer next() {
            if (count != countOdd) {
                return stack[count++];
            }
            if (lastEl != countEven) {
                return stack[lastEl--];
            }
            return null;
        }

    }
}
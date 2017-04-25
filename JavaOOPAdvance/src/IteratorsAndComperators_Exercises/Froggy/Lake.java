package IteratorsAndComperators_Exercises.Froggy;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Mihail on 3/25/2017.
 */
public class Lake implements Iterable<Integer> {

    private List<Integer> numbers;

    public Lake(List<Integer> arr) {
        this.setElements(arr);
    }

    private void setElements(List<Integer> arr) {
        this.numbers = arr;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator<Integer> {

        private int count;
        private int index;
        private boolean flag;
        private int element;

        public Frog() {
            this.count = 0;
            this.index = -2;
            this.flag = false;
            this.element = 0;
        }

        public int getNumber() {
            if (!this.flag) {
                if (index + 2 < numbers.size()) {
                    this.element = numbers.get(index += 2);
                    this.count++;
                    return this.element;
                }
                this.index = -1;
                this.flag = true;
            }
            this.element = numbers.get(index += 2);
            this.count++;
            return this.element;
        }

        @Override
        public boolean hasNext() {
            return count < numbers.size();
        }

        @Override
        public Integer next() {
            if (this.hasNext()) {
                getNumber();
                return this.element;
            }
            return null;
        }
    }


}

package lesson18;

import java.util.NoSuchElementException;

public class Array2D<V> {

    V[][] array;

    public Array2D(V[][] array) {
        this.array = array;
    }

    public Iterator<V> iterator() {
        return new Iterator<>();
    }

    public class Iterator<V> {
        private int i, j;

        public boolean hasNext() {
            return i < array.length && j < array[i].length;
        }

        public V next() {
            if (!hasNext())
                throw new NoSuchElementException();
            V item = (V) array[i][j];
            j++;
            if (j >= array[i].length) {
                j = 0;
                i++;
//                if(array[i].length == 0){
//                    i++;
//                }
            }
            return item;
        }
    }


}

package lesson17;

public interface Iterator {
    public boolean hasNext();

    public Object next();
}

// add collection class
class Collection {
    private Object[] array;

    Collection(Object[] array) {
        this.array = array;
    }

    class Forward implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Object next() {
            return array[index++];
        }
    }

    class Backward implements Iterator {

        int index = array.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Object next() {
            return array[index--];
        }
    }

    public Iterator createForwardIterator() {
        return new Forward();
    }

    public Iterator createBackwardIterator() {
        return new Backward();
    }


}
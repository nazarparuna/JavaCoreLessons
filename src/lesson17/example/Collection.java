package lesson17.example;

public class Collection {

    private Number[] array;

    public Collection(Number[] array) {
        this.array = array;
    }

    public ForwardIterator getForwardIterator() {
        return new ForwardIterator();
    }

    public BackwardIterator getBackwardIterator() {
        return new BackwardIterator();
    }

    class ForwardIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Number next() {
            return null;
        }
    }

    class BackwardIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Number next() {
            return null;
        }
    }

}

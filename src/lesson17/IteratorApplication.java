package lesson17;

public class IteratorApplication {
    public static void main(String[] args) {

        // create array of integers
        Integer[] array = {3, 6, -6, 2, 55, 90, -39, 1, 0, 32};

        // create collection
        Collection collection = new Collection(array);

        // get forward iterator
        Iterator forwardIterator = collection.createForwardIterator();

        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        System.out.println();
        // get backward iterator
        Iterator backwardIterator = collection.createBackwardIterator();
        while (backwardIterator.hasNext()) {
            System.out.println(backwardIterator.next());
        }
    }
}

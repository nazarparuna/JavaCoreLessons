package lesson18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //With one generic

        SimpleGenerics<String> generic1 = new SimpleGenerics<>("java");
        generic1.showType();
        System.out.println("Value is " + generic1.getOb());
        System.out.println();
        SimpleGenerics<Integer> generic2 = new SimpleGenerics<>(2);
        generic2.showType();
        System.out.println("Value is " + generic2.getOb());

        System.out.println();
        SimpleGenerics<Object> generic3 = new SimpleGenerics<>("java 8");
        generic3.showType();
        System.out.println("Value is " + generic3.getOb());
        generic3.setOb(3);
        generic3.showType();
        System.out.println("Value is " + generic3.getOb());
        System.out.println();

        List<Object> list = new ArrayList<>();
        list.add("Nazar");
        list.add("Andriy");
        list.add(4);

        System.out.println(list.get(0).getClass().getName());
        System.out.println(list.get(2).getClass().getName());

        List noParameterList = new ArrayList();
        noParameterList.add("1");
        noParameterList.add("2");
//        noParameterList.add(3); // error
        for (Object item : noParameterList) {
            System.out.println(((String) item).toUpperCase());
        }

        //with two generics
        System.out.println();
        TwoGen<String, Integer> twoGen = new TwoGen<>("Java", 13);
        System.out.println(twoGen.getOb1());
        System.out.println(twoGen.getOb2());
        twoGen.showTypes();

        TwoGen<Integer, String> twoGen2 = new TwoGen<>(13, "Java");
        System.out.println(twoGen2.getOb1());
        System.out.println(twoGen2.getOb2());
        twoGen2.showTypes();
        System.out.println();
        twoGen2.setOb1(14);
        twoGen2.setOb2("Java updated to version ");
        System.out.println(twoGen2.getOb1());
        System.out.println(twoGen2.getOb2());
        twoGen2.showTypes();

        //Restrictions

        Restrictions<Integer> restrictions =
                new Restrictions<>(new Integer[]{1, 4, 7, 0, -3, 10});

        System.out.println();
        for (Integer item : restrictions.nums) {
            System.out.println(item);
        }
        System.out.println();

        Restrictions<Double> restrictions2 =
                new Restrictions<>(new Double[]{1.2, 4.0, 7.0, (double) 0, -3.0, 10.8});

        System.out.println();
        for (Double item : restrictions2.nums) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("Average for integers is " + restrictions.average());
        System.out.println("Average for double is " + restrictions2.average());
        System.out.println();

        //will not work because of bounds
//        Restrictions<String>

        //wildCards
        TwoC[] points = {new TwoC(2, 4), new TwoC(5, 6), new TwoC(8, 9)};
        Coords<TwoC> coords = new Coords<>(points);
        Coords.showXY(coords);

        ThreeC[] threePoints =
                {new ThreeC(2, 4, 0),
                        new ThreeC(5, 6, 1), new ThreeC(8, 9, 2)};
        Coords<ThreeC> coords2 = new Coords<>(threePoints);

        //will not compile
        System.out.println();
        Coords.showXY(coords2);
        Coords.showXYZ(coords2);
//        Coords.showXYZT(coords2);


        // FourC
        System.out.println();
        // parametrized method
        Integer nums[] = {1, 2, 3, 4, 5};
        if (isIn(2, nums))
            System.out.println("2 міститься в масиві!");

        if (isIn(6, nums))
            System.out.println("6 міститься в масиві!");


        // hierarhy
        System.out.println();
        GenSubClass<Integer, String> subClass = new GenSubClass<>(10, "years");
        System.out.println(subClass);

        System.out.println();
        // iterator for double array

        Integer[][] array = {{1, 4, 7, -5, 4}, {}, {5, 2, 0}, {6}};
        Array2D<Integer> array2D = new Array2D<>(array);
        Array2D<Integer>.Iterator<Integer> iterator = array2D.iterator();

        System.out.println("Array 2D: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    static <T, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i])) return true;
        return false;
    }
}

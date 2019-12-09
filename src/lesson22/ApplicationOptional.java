package lesson22;


import java.io.FileNotFoundException;
import java.util.Optional;

public class ApplicationOptional {
    public static void main(String[] args) throws FileNotFoundException {

        // empty optional
        Optional<String> empty = Optional.empty();
        empty.ifPresent(System.out::println);
        if (!empty.isPresent()) {
            System.out.println("Value is empty!");
        }


        // create optional
        Optional<String> string = Optional.of("Java");
        System.out.println(string);
        string.ifPresent(System.out::println);

        // ofNullable
        // work with null
        Optional<Object> optional = Optional.ofNullable(null);
        showOptional(optional);

        optional = Optional.ofNullable("Java 8");
        showOptional(optional);


        // if-present with consumer

        // or-else
        optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("Java 13"));

        // orElseGet supplier
        System.out.println(optional.orElseGet(() -> "Happy New Year!"));

        // or-else throw
        optional = Optional.ofNullable("not null");
        optional.orElseThrow(() -> new FileNotFoundException());
//
        // get


        // filter
        System.out.println(optional.filter(x -> ((String) x).length() > 5).get());
        System.out.println(optional.filter(x -> ((String) x).length() > 15));

    }

    private static void showOptional(Optional<Object> optional) {
        if (optional.isPresent()) {
            System.out.println("Optional is not null. Value is " + optional.get());
        } else {
            System.out.println("Optional is null");
        }
    }
}
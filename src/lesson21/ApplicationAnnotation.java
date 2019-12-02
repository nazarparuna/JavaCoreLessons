package lesson21;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ApplicationAnnotation {

    //    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

//        SubClass subClass = new SubClass();
//        subClass.print();
//        subClass.print2();
//
//        createList();

        // create Droid class
        Class<Droid> droidClass = Droid.class;

        // mark field with annotation

        // get annotation values
        getAnnotationValues(droidClass);

        System.out.println();
        // get not annotation values
        getNonAnnotatedFields(droidClass);


        // create class Student
        Student student = new Student("Nazar", 24, 1300);

        // create new annotation

        // get annotated fields and values
        System.out.println();
        getAnnotationFieldsAndValues(student);

        System.out.println();
        SubClass subClass = new SubClass("name", 123, true);
        System.out.println(subClass);
        subClass.isOld();

        subClass.setNumber(200);
        subClass.setOld(false);
        subClass.setName("new name");
        System.out.println(subClass);

        SubClass subClass1 = SubClass.builder().name("name").number(34).build();
        System.out.println(subClass1);
    }

    private static void getAnnotationFieldsAndValues(Student student) {
        Field[] fields = student.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotation(StudentAnnotation.class) instanceof StudentAnnotation) {
                StudentAnnotation annotation = field.getAnnotation(StudentAnnotation.class);
                System.out.println("Field " + field.getName() + " with type " + field.getType() + " has annotation StudentAnnotation with values: " + annotation.nick()
                        + " and grade - " + annotation.grade());
            }
        }
    }

    private static void getNonAnnotatedFields(Class<Droid> droidClass) {
        Field[] fields = droidClass.getFields();
        for (Field field : fields) {
            if (!(field.getAnnotation(Fielder.class) instanceof Fielder)) {
                System.out.println("Field " + field.getName() + " with type " + field.getType().getSimpleName() + " has not annotation Fielder.");
            }
        }
    }

    private static void getAnnotationValues(Class<Droid> droidClass) {
        Field[] fields = droidClass.getFields();
        for (Field field : fields) {
            if (field.getAnnotation(Fielder.class) instanceof Fielder) {
                System.out.println("Field " + field.getName() + " with type " + field.getType() + " has annotation Fielder with value " + field.getAnnotation(Fielder.class).value());
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static void createList() {
        List list = new ArrayList();
        list.add("dsjlj");
    }

}

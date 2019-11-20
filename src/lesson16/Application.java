package lesson16;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {

        String str = "";
        System.out.println(str.getClass().getName());

        // create person class
        Class<Person> personClass = Person.class;


        // get name of class
        System.out.println();
        System.out.println(personClass.getName());
        System.out.println();

        // get simple name
        System.out.println(personClass.getSimpleName());
        System.out.println();

        // get number of Modifiers
        int modifiers = personClass.getModifiers();
        System.out.println(modifiers);
        System.out.println();

        // public
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println();

        // static
        System.out.println(Modifier.isStatic(modifiers));
        System.out.println();

        // private
        System.out.println(Modifier.isPrivate(modifiers));


        // abstract
        System.out.println(Modifier.isAbstract(Human.class.getModifiers()));

        System.out.println();
        System.out.println(Human.class.getModifiers());
        System.out.println();

        // get package
        Package aPackage = personClass.getPackage();
        System.out.println(aPackage);
        System.out.println();

        // get super class
        Class superclass = personClass.getSuperclass();
        System.out.println(superclass.getSimpleName());
        System.out.println();

        // get interfaces
        System.out.println("Interfaces:");
        Class<?>[] interfaces = personClass.getInterfaces();
        for (Class inter : interfaces) {
            System.out.println(inter);
        }
        System.out.println();

        // get Constructors
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor cons : constructors) {
            System.out.println(cons);
        }
        System.out.println();


        // get param types of first constructor
        Constructor<?> constructor = constructors[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (Class param : parameterTypes) {
            System.out.println(param);
        }

        // get Consctuctor by parameters
        Constructor<Person> baseConstructor = personClass.getConstructor(String.class, int.class);
        System.out.println(baseConstructor);
        System.out.println();

        // create new instance
        Person person = personClass.newInstance();
        System.out.println(person);
        System.out.println();

        Person personFromConstructor = baseConstructor.newInstance(new Object[]{"Nazar", 24});
        System.out.println(personFromConstructor);
        System.out.println();

        // get Fields
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println();

        // get all fields
        Field[] declaringFields = personClass.getDeclaredFields();
        for (Field field : declaringFields) {
            System.out.println(field);
        }
        System.out.println();

        //get field, set value

        System.out.println(person);
        System.out.println();
        Field lastName = person.getClass().getDeclaredField("lastName");
        lastName.setAccessible(true);
        lastName.set(person, "Runner");
        lastName.setAccessible(false);
        System.out.println(person);
        System.out.println();

        Field[] personFields = person.getClass().getFields();
        for (Field field : personFields) {
            System.out.println(field);
        }

        // get private field by index, change accessibility
        personFields[0].set(person, "Igor");
        personFields[1].set(person, 18);
        System.out.println();
        System.out.println(person);
        System.out.println();


        //get all Methods
        Method[] methods = personClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println();

        // invoke method
        methods[4].invoke(person, new Object[]{"Olga"});
        System.out.println(person);
        System.out.println();


        AnnotatedType[] annotatedInterfaces = personClass.getAnnotatedInterfaces();

        System.out.println("Annotated Interfaces:");
        for (AnnotatedType inter : annotatedInterfaces) {
            System.out.println(inter);
        }
        System.out.println();

        for (AnnotatedType annotatedType : Person.class.getAnnotatedInterfaces()) {
            Type tp = annotatedType.getType();  //get annotated type
            System.out.println(" Anotated Type :" + tp);

            Annotation[] antn = annotatedType.getAnnotations(); //get annotations
            System.out.println("Annotations     :" + Arrays.toString(antn));

            Annotation[] decAntn = annotatedType.getDeclaredAnnotations(); //getdeclared annotations
            System.out.println("Declared Annotations     :" + Arrays.toString(decAntn));


            Method run = personClass.getSuperclass().getDeclaredMethod("run");

            System.out.println(run);
        }
    }


}

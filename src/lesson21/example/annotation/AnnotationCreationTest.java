package lesson21.example.annotation;

import java.lang.annotation.Annotation;

@MyAnnotation
@Deprecated
public class AnnotationCreationTest {

    @MyAnnotation
    public static int field;

    public static void main(String[] args) {
        Class<AnnotationCreationTest> annotationCreationTestClass = AnnotationCreationTest.class;
        Annotation[] annotations = annotationCreationTestClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }

    @MyAnnotation
    public void show(@MyAnnotation("123") String value) {

    }
}

package lesson9.example;

public class TestStackTrace {
    public static void main(String[] args) {
        try {
            getException();
        } catch (MyExceptionWithOldStackTrace e) {
            e.printStackTrace();
            System.out.println("=======");
            for (StackTraceElement stackTraceElement : e.getOldStackTrace()) {
                System.out.println(stackTraceElement.getMethodName());
            }

        }
    }

    private static void getException() {
        try {
            getInnerException();
        } catch (Exception e) {
            System.out.println("We get an exception in getException() method!");
//            throw e;
            throw new MyExceptionWithOldStackTrace(e.getStackTrace());
        }
    }

    private static void getInnerException() {
        throw new RuntimeException("message");
    }

}

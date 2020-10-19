package lesson9.example;

public class MyExceptionWithOldStackTrace extends RuntimeException {
    private final StackTraceElement[] oldStackTrace;

    public MyExceptionWithOldStackTrace(StackTraceElement[] stackTrace) {
        oldStackTrace = stackTrace;
    }

    public StackTraceElement[] getOldStackTrace() {
        return oldStackTrace;
    }
}

package prof;

public class JITProfilingExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10_000; i++) {
            testMethod(i);
        }
    }

    private static int testMethod(int x) {
        return x * x;
    }
}

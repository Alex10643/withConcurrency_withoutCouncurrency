import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int size = 10_000_000;
        withoutConcurrency(size);
        //withConcurrency(size);
    }

    public static void withoutConcurrency(int size) {
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long startTime = (long) System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("withoutConcurrency пропыхтел за " + executionTime + " миллисекунд");
    }
}


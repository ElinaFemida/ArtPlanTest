package firstTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;

public class StringReverse {

    public static void main(String[] args) throws IOException {
        System.out.print("Введите строку: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(str);
        long time1 = timer(() -> {
            for (int i = 0; i < 1000; i++) {
                reverse(str);
            }
        });
        long time2 = timer(() -> {
            for (int i = 0; i < 10000; i++) {
                reverse(str);
            }
        });
        long time3 = timer(() -> {
            for (int i = 0; i < 100000; i++) {
                reverse(str);
            }
        });
        System.out.println(reverse(str));
        System.out.print(time1 + ", " + time2 + "+, " + time3);
    }

    //result in ms
    private static long timer(Runnable method) {
        Instant start = Instant.now();
        method.run();
        Instant finish = Instant.now();
        return Duration.between(start, finish).toMillis();
    }

    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
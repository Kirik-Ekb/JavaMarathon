package day8;

import java.time.Duration;
import java.time.Instant;

public class Task1 {
    public static void main(String[] args) {
        Instant startStr = Instant.now();
        String str = "";
        for (int i = 0; i <= 20000; i++) {
            str = str + " " + i;
        }
        System.out.println(str);
        Instant finishStr = Instant.now();
        long resStr = Duration.between(startStr, finishStr).toMillis();
        System.out.println("Время выполнения " + resStr);

        Instant startSb = Instant.now();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        Instant finishSb = Instant.now();
        long resSb = Duration.between(startSb, finishSb).toMillis();

        System.out.println("Время выполнения 'String' " + resStr + " мсек");
        System.out.println("Время выполнения 'StringBuilder' " + resSb + " мсек");
    }
}

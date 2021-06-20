package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(177177717));
    }

    public static int count7(int number) {
        if (number % 10 == 7) {
            if (number / 10 == 0) return 1;
            return 1 + count7(number / 10);
        }
        if (number / 10 == 0) return 0;
        return count7(number / 10);
    }
}

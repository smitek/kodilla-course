import java.util.Random;

public class RandomNumbers {
    private static int sum;
    private static int max;
    private static int min;

    public static void main(String[] args) {
        Random r = new Random();

        while (sum < 5000) {
            int a = r.nextInt(31);
            //   sum = sum + a;
            sum += a;
            //System.out.println("Wylosowana " + a);
            //System.out.println("Suma " + sum);
            findMax(a);
            findMin(a);
        }
        System.out.println("Wart max " + max);
        System.out.println("Wart min " + min);
    }

    private static void findMax(int a) {
        if (a > max) {
            max = a;
        }
    }

    private static void findMin(int a) {
        if (a < min) {
            min = a;
        }
    }
}

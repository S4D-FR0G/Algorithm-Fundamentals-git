package A;
//right
import java.util.Scanner;

public class demo04_2 {
    public static class FibonacciSeries {

        public static void main(String[] args) {
            System.out.println("输入:");
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            for (int i = 0; i <= N; i++) {
                int result = fibonacciSeries(i);
                System.out.print(result+" ");
            }
            scanner.close();
        }

        private static int fibonacciSeries(int n) {
            if (n < 0) {
                return 1;
            } else if (n > 0) {
                return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
            }
            return 0;
        }
    }
}

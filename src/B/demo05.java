package B;

import java.text.DecimalFormat;

public class demo05 {
    public static class FenShu {
        public static void main(String[] args) {
            int x = 2, y = 1, t;
            double sum = 0;

            DecimalFormat df = new DecimalFormat("#0.0000");

            for (int i = 1; i <= 30; i++) {
                sum += (double) x / y;
                t = y;
                y = x;
                x = y + t;
                System.out.println("第 " + i + " 次相加，和是 " + df.format(sum));
            }
            System.out.println("第 " + 30 + " 次相加，和是 " + df.format(sum));
        }
    }
}

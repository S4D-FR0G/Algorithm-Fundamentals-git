package A;

import java.util.Scanner;

public class demo04兔子 {
    public static void main(String[] args) {
//如果用scanner接收========================
        Scanner input=new Scanner(System.in);
        int fi= input.nextInt();
//=======================================
        System.out.println(fib(fi));
    }

    private static int fib(int n) {
        if (n < 3) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

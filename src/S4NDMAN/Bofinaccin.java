package S4NDMAN;

import java.util.Scanner;

public class Bofinaccin {
    public static void main(String[] args) {
        System.out.println("输入fi");
        Scanner input=new Scanner(System.in);
        int fi= input.nextInt();
        System.out.println(fib(fi));
    }

    private static int fib(int n) {
        if (n < 3) {
            return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }

    }
}

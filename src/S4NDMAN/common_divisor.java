package S4NDMAN;

import java.util.Scanner;

//最大公约数 最小公倍数
public class common_divisor {
    public static void main(String[] args) {
        System.out.println("请输入m:");
        Scanner input=new Scanner(System.in);
        int m= input.nextInt();
        System.out.println("请输入n:");
        int n= input.nextInt();

        int min=((n<m)?n:m);
//        System.out.println(max);
        //最大公约数
        for (int i = min; i >=1; i--) { //从最小值到1，最大公约数的最小值为1
            if (m%i==0 && n%i==0) {
                System.out.println("m与n的最大公约数："+i);
                break;
            }
        }

        int max=(n<m?m:n);
        //最小公倍数
        for (int i = max; i <=m*n ; i++) { //最小公倍数的最大值不超过M*N
            if (i%m == 0&& i%n==0) {   //大除以小 max / (m or n)
                System.out.println("最小公倍数:"+i);
                break;
            }
        }

    }
}

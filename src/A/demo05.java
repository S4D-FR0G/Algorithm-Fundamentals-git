package A;
//最大公约数： 两个或多个[整数]公有的倍数叫做它们的公倍数，其中除0以外最小的一个公倍数就叫做这几个整数的最小公倍数
import java.util.Scanner;
//8 12
public class demo05 {
    public static void main(String[] args) {
    //输入两个正整数m和n，求其最大的公约数和最小公倍数
    // 12和20的最大公约数是4，最小公倍数是60

        Scanner scan = new Scanner(System.in);
        System.out.println("请输第一个正整数ｍ：");
        int m = scan.nextInt();

        System.out.println("请输第二个正整数ｎ：");
        int n = scan.nextInt();

        //获取两个数中的较小值（三目运算）
        int min=(m <= n) ? m : n;

        //获取最大公约数
        for(int i = min;i >= 1; i--){
            if(m % i ==0 && n % i ==0){  //最大公约数
               System.out.println("最大公约数为："+i);
               break;    //满足条件跳出循环
            }
        }
        //获取最小公倍数
        //获取较大值

        int max = (m>=n)?m:n;

       for(int i = max;i<= m*n; i++){
           if(i % m ==0 && i %n ==0)
               {
                   System.out.println("最小公倍数为："+i);
                   break;    //满足条件跳出循环
               }
       }
    }
}

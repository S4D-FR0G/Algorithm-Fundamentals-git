package B;
//给你一个四位数整数 4352，要求你计算每一位数字的和
import java.util.Scanner;
public class demo02 {
    public static void main(String[] args) {
        System.out.println("请输入四位整数");
        Scanner input=new Scanner(System.in);
        int scan = input.nextInt();
        int arr[]=new int[4];
        int i=3;  //数组最后一位下标，开始往前遍历赋值
        do{
            arr[i]=scan%10;
            scan/=10;
            i--;
        }while (i>=0);

        int sum=0;

        for (int j = 0; j < 4; j++) {
            sum=sum+arr[j];
        }
        System.out.println("四位数之和"+sum);
    }
}

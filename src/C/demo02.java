package C;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;
//error
public class demo02 {
    //任意输入一个整数（不低于 6 位），输出去掉重复数字后的整数.如，输入 12312，输出 3
    public static void main(String args[]){
        System.out.print("Enter 6 numbers: ");
        Scanner input = new Scanner(System.in);
        String scan=input.next();
        int sca;
        sca=Integer.parseInt(scan);

        ArrayList<Number> arr=new ArrayList<>();
//        ArrayList<Integer> arr=new ArrayList<>();

        int i=0;

        if (scan.length()<6) {
            System.out.println("请正确输入");
        }else{
            do {
                int v=sca%10;
                sca/=10;
                arr.set(i,v);
                i--;
            }while (i>=0);
            System.out.println(arr);

        }

/*
        int[] a = new int[10];
        for(int i = 0; i < 10; i++)
        {
            a[i] = input.nextInt();
        }
//筛选
        System.out.print("The distinct numbers are: ");
        int[] b = {1,1,1,1,1,1,1,1,1,1};
        for(int i = 0; i < 10; i++)
        {
            for(int j = 9; j > i; j--)
            {
                if(a[i] == a[j])
                {
                    b[j] = -1;
                }
            }
        }
//输出
        for(int i = 0; i < 10; i++)
        {
            if(b[i] == 1)
            {
                System.out.print(a[i] +" ");
            }
        }*/

    }

}




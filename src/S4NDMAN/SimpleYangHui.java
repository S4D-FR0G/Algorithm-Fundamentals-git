package S4NDMAN;

import java.util.Scanner;

public class SimpleYangHui {



    private static void printYangH(int n) {
        int[][] a=new int[n][n];
        for (int i = 0; i <n; i++) {
            a[i][0]=1;
            a[i][i]=1;
            if (i>=2){  //从第3行
                for (int j = 1; j <i ; j++) {
                    a[i][j]=a[i-1][j]+a[i-1][j-1];
                }
            }
        }
        //打印
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(a[i][j]);
                if (j!=i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        System.out.println();


    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        int a= input.nextInt();
        printYangH(input.nextInt());
    }
}

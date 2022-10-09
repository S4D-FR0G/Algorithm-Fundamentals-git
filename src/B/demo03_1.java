package B;

import java.util.Scanner;
//杨辉三角 练习
public class demo03_1 {
    /** i行 j行中的第几个元素
     * 打印杨辉三角        ----- n=5
     *     1            ------4空格
     *    1 1           ------3空格
     *   1 2 1          ------2空格
     *  1 3 3 1         ------1空格
     * 1 4 6 4 1        ------0空格
     * @param n
     *      杨辉三角有多少边
     */
    public static void printYangHui(int n) {
        //用二元数组
        int[][] a=new int[n][n];//n*n的二元数组
        for (int i = 0; i < n; i++) {
            a[i][0]=1;//每行的首位元素=1
            a[i][i]=1;//每行尾元素=1
            if (i>=2){//从第3行开始
                for (int j = 1; j < i; j++) {//-----------j的值不用从0开始，因为上面已经赋过值了
                    a[i][j]=a[i-1][j]+a[i-1][j-1];//j---i行中的第j个
                //a[4][1]=a[3][1]+a[i-1][0]==========>4

                }
            }
        }
        //打印杨辉三角
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n-i; k++) {//
                System.out.print(" ");
            }
            
            for (int j = 0; j <=i; j++) {//j不能小于n,n是固定大小的，意味着打印矩阵
                // j<i====j的数量随行数打印,BUT  j<=i j每行打印的数量与i相等
                System.out.print(a[i][j]);
                if (i!=j){//不是每行的结尾就有空格
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
//=========================== 主方法 ================================
    public static void main(String[] args) {
        System.out.println("输入行数，打印杨辉三角");
        Scanner input=new Scanner(System.in);
//        int a=input.nextInt();
        printYangHui(input.nextInt());
    }
}

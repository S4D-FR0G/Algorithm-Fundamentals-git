package S4NDMAN;

import java.util.Scanner;
public class yangHui {
    /**
     * i代表行
     * j代表列
     * 打印杨辉三角  ---设共有n=5行
     * 1     ----n-1个空格
     * 1 1    ----n-2个空格
     * 1 2 1   ----n-3个空格
     * 1 3 3 1  ----n-4个空格
     * 1 4 6 4 1       0个
     */
    private static void printYangHui(int n) {
        //先处理值
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;

            if (i >= 2) { //从第3行开始
                for (int j = 1; j < i; j++) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                    //写出 杨辉三角的最大特点 的 计算等式
                }
            }
        }

        //然后打印
        //正金字塔型
        for (int i = 0; i < n; i++) {//打印n行

            for (int k = 1; k < n - i; k++) { //要金字塔型的
                // 第i行 空格数为（n-i）
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
//               System.out.print(arr[i][j]+" ");//非金字塔型请用这条
                System.out.print(arr[i][j]);
                if (j != i) {
                    System.out.print(" ");//i=j 是i行的最后一个元素
                }
            }
            System.out.println();
        }

        //倒金字塔型
        for (int i = n - 1; i >= 0; i--) {//打印n行  //与正金字塔打印的唯一区别  n-1
            //i>=0 防止没底
            for (int k = 1; k < n - i; k++) { //要金字塔型的
                // 第i行 空格数为（n-i） k=1时 每行开头没有空格
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
//               System.out.print(arr[i][j]+" ");//非金字塔型请用这条
                System.out.print(arr[i][j]);
                if (j != i) {
                    System.out.print(" ");//i=j 是i行的最后一个元素
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner input = new Scanner(System.in);
        printYangHui(input.nextInt());
    }
}

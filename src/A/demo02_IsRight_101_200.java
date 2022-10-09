package A;
//本题为找101-200间的素数，0-100间的素数不适用于本题
//因为按照此代码输出的0-10的数不对   Math.sqrt()?
public class demo02_IsRight_101_200 {
    public static void main(String[] args) {
        int sum=0;//统计素数个数
        for (int i = 100; i <200 ; i++) {
            if(IsRightNum(i)){
                System.out.print(i+" ");
                sum++;
//                if (sum%10==0){
//                    System.out.println(); //十个一行
//                }
            }
        }
        System.out.println("素数个数："+sum);
    }
//质数和合数的讨论范围是大于1的自然数
    private static boolean IsRightNum(int i) {
/*        if (i == 0) {
            return false;
        }*/
        for (int j = 2; j < Math.sqrt(i); j++) {   //为社么J必须小于I的平方根 保证被除数大于除数？
            if (i%j==0) {
                return false;
            }
        }
        return true;
    }
}

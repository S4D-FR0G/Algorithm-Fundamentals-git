package A;
//什么是素数？只能被自身和1整除的数
//例如：2，3，5，7，11
//1不是素数
public class demo02_2 {
    public static void main(String[] args) {
        System.out.print(2 +" ");
        System.out.print(3 +" ");
        System.out.print(5 +" ");
        System.out.print(7 +" ");
        int sum=4;
        for(int i=10;i<=100;i++){
            if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                System.out.print(i+" ");
                sum++;
            }
        }
        System.out.println();
        System.out.print("素数个数："+sum);
    }
}

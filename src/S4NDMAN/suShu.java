package S4NDMAN;

public class suShu {
    public static void main(String[] args) {
        //100以内的素数
        int sum=4;
        System.out.print("2"+" ");
        System.out.print("3"+" ");
        System.out.print("5"+" ");
        System.out.print("7"+" ");
        for (int i = 7; i <100 ; i++) {
            if (i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0) {
                System.out.print(i+" ");
                sum++;
                if (sum%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("素数个数"+sum);
    }
}

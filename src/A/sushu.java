package A;
//素数又叫质数，是在大于1的自然数中只能被1和其自身整除的数。
public class sushu {
    public static void main(String[] args) {
        int i,j;
        int z=1;
        for(i=1;i<=100;i++){
            if( i==2){   //1不是素数
                System.out.print(i +" ");
                continue;
            }
            for(j=2;j<i;j++){
                if(i%j==0)
                    break;
                if(j==i-1) {
                    System.out.print(i + " ");
                    z++;
                }
            }
        }
        System.out.println("100以内的素数："+ z);
    }
}
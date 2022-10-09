package A;
//素数又叫质数，是在 大于1 的自然数中只能被1和其自身整除的数。
public class demo02 {
    public static void main(String[] args) {
        int i,j;
        int z = 1;
        for(i=1;i<=100;i++) {

            if(i==2)
                System.out.print(i+" ");

            for(j=2;j<i;j++) {
                if(0==i%j)       //素数对非1和它本身的数求余不为零
                    break;
                if(j==(i-1)&&0!=(i%(i-1))){
                    z++;
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println();
        System.out.println("100以内有多少素数？");
        System.out.println(z);
    }
}

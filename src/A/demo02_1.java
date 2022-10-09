package A;
//?
public class demo02_1 {
    public static void main(String[] args) {
        int i, j, k;
        int z = 0;
        for (i = 2; i < 100; i++) {
            k = (int) Math.sqrt(i);
            for (j = 2; j <= k; j++) {

                if (i % j == 0)
                    break;

            }
            if (j > k) {
                z++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("100以内有多少素数？");
        System.out.println(z);
    }
}

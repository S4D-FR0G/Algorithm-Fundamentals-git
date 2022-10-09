package A;

public class demo04_1 {

    public static void main(String[] args) {
        int index = 0;
        while (true) {
            System.out.println(fibonacci(index));
            index++;
        }
    }
    public static long fibonacci (int i) {
        if (i == 0) return 0;
        if (i<= 2) return 1;

        long fibTerm = fibonacci(i - 1) + fibonacci(i - 2);
        return fibTerm;
    }
//记得手动关停

}

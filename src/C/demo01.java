package C;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input year:");
        int year = input.nextInt();
        System.out.println("Please input month:");
        int month = input.nextInt();
        System.out.println("Please input day:");
        int day = input.nextInt();

        int daysInYear = getDaysInYear(year, month, day);
        System.out.println("daysInYear:" + daysInYear);
    }

    public static int getDaysInYear(int year,int month,int day){
        int sum=0;
        switch (month) {
            case 1:
                sum=0;
                break;
            case 2:
                sum=31;
                break;
            case 3:
                sum=59;
                break;
            case 4:
                sum=90;
                break;
            case 5:
                sum=120;
                break;
            case 6:
                sum=151;
                break;
            case 7:
                sum=181;
                break;
            case 8:
                sum=212;
                break;
            case 9:
                sum=243;
                break;
            case 10:
                sum=273;
                break;
            case 11:
                sum=304;
                break;
            case 12:
                sum=334;
                break;
            default:
//                System.out.println("error!");
                System.err.println("error");
                break;
        }
        sum=sum+day;
        return sum;
    }

}


package S4NDMAN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;

/*

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.*;
import java.util.Scanner;

public class GregorianCalender {
    public static void main(String[] args) throws ParseException {
        Scanner input=new Scanner(System.in);
        String Date= input.next();

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date=sdf.parse(Date);
        GregorianCalendar gc=  (GregorianCalendar) Calendar.getInstance();
//        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        System.out.println(gc.get(6));

    }

}
*/
public class GregorianCalender {
    public static void main(String[] args) throws ParseException {
        Scanner input=new Scanner(System.in);
        String Date= input.next();

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(Date);
        GregorianCalendar gc=(GregorianCalendar) Calendar.getInstance();

        System.out.println(gc.get(6));
    }
}
package C;

//GregorianCalendar类
//Calendar类实现了公历日历，GregorianCalendar是Calendar类的一个具体实现。

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class demo01_1 {


    //二、使用字符串转换的日期
    public static void main(String[] args) throws ParseException {
        //从键盘获取日期
        System.out.println("输入日期");
        Scanner input=new Scanner(System.in);
        String Date=input.next();

//        String Date="2002-06-01";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//格式化规则
        Date date = sdf.parse(Date);//获得你要处理的时间  Date型----->parse成Date类型时间数据
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();////将Date格式日期转换成GregorianCalendar?
        //java基础系列--Calendar类 https://www.cnblogs.com/V1haoge/p/7136575.html
        gc.setTime(date);
        //打印天数
        //一年中的第几天 DAY_OF_YEAR，在Calendar中的Field为6，获取
        System.out.println(gc.get(6));
    }
}





//一、直接使用当前日期
    /*public static void main(String[] args){
        Date date = new Date();
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        //打印天数
        //一年中的第几天 DAY_OF_YEAR，在Calendar中的Field为6，直接获取
        System.out.println(gc.get(6));
    }*/
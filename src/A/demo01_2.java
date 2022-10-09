package A;

import java.util.Scanner;

public class demo01_2 {
    public static void main(String[] args) {

        System.out.println("请输入11位手机号：");
        Scanner input=new Scanner(System.in);
        String mobile=input.next();

        if ((mobile.length())!=11) {
            System.out.println("输入错误");
        }
        String a =mobile.replaceAll("(\\d{3})\\d{5}(\\d{3})","$1*****$2");
        //参数：
        //regex -- 匹配此字符串的正则表达式
        //replacement -- 用来替换每个匹配项的字符串

        //正则表达式：https://www.runoob.com/regexp/regexp-metachar.html
        //\d   匹配一个数字字符 == [0-9]
        //\   将下一个字符标记为一个特殊字符、或一个原义字符、或一个 向后引用、或一个八进制转义符。
        //{n}  n 是一个非负整数。匹配确定的 n 次
        //$	   匹配输入字符串的结束位置
        //
        //  \\d{3}-----向后匹配3次数字  regex:（\\d{3})\\d{5}(\\d{3}),replacement: $1*****$2 ===== $1第一个括号  $2第二个括号

        // $1，$2表达的是小括号分组里面的内容：$1是第一个小括号里的内容，$2是第二个小括号里面的内容，依此类推。
        // 比如(\\d{4})(\\d{2})(\\d{2}) 匹配"20190919"。
        // $1是第一个括号里匹配的2019，$2是第二个括号里匹配的09，$3是第三个括号里匹配的19。
        System.out.println("输出："+a);
    }
}


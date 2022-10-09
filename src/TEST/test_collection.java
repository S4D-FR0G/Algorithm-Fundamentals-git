package TEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test_collection {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("a");
        mylist.add("b");
        mylist.add("c");
        Collections.reverse(mylist);
        for (Object string : mylist) {
            System.out.print(string);
        }
    }
}

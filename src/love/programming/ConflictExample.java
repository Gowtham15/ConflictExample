package love.programming;


import java.sql.Date;
import java.util.List;

/**
 * Created by balajakka on 06/10/2018.
 */
public class ConflictExample {
    public static void main(String[] args) {
//        java.util.Date date;

//        Date sqlDate;

        java.util.Date myDate = new Date(23);
        Date myDate2 = new Date(23);

        java.util.Date utilDate;
        java.sql.Date sqlDate;



    }

    public void checkEmpty(List list) {
        if (list.isEmpty()) {
            System.out.println("Empty");} else {System.out.println("Not empty");
        }
    }

//    public class LineNumber {
//
//        public void checkEmpty(List list) {
//            if (list.isEmpty()) {System.out.println("Empty");} else {System.out.println("Not empty");
//            }
//        }
//    }
}
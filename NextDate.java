package org.example;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class NextDate {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 2012;

        String nextDate = getNextDate(day, month, year);
        System.out.println("Ngày kế tiếp là: " + nextDate);
    }

    public static String getNextDate(int day, int month, int year) {
        if(day>31 || day<1 || month>12 || day <1 || year >2012 || year < 1812){
            return "Không hợp lệ";        }
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        calendar.add(calendar.DAY_OF_MONTH, 1);

        int nextDay = calendar.get(calendar.DAY_OF_MONTH);
        int nextMonth = calendar.get(calendar.MONTH) + 1;
        int nextYear = calendar.get(calendar.YEAR);

        return nextDay + "/" + nextMonth + "/" + nextYear;
    }
}

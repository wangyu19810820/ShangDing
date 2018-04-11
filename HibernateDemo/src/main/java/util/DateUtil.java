package util;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public DateUtil() {
    }

    public static String format(Date date) {
        return format(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String format(Date date, String pattern) {
        if (date == null) {
            return "null";
        } else {
            if (pattern == null || pattern.equals("") || pattern.equals("null")) {
                pattern = "yyyy-MM-dd HH:mm:ss";
            }

            return (new SimpleDateFormat(pattern)).format(date);
        }
    }

    public static Date format(String date) {
        return format((String)date, (String)null);
    }

    public static Date format(String date, String pattern) {
        if (pattern == null || pattern.equals("") || pattern.equals("null")) {
            pattern = "yyyy-MM-dd HH:mm:ss";
        }

        if (date != null && !date.equals("") && !date.equals("null")) {
            Date d = null;

            try {
                d = (new SimpleDateFormat(pattern)).parse(date);
            } catch (ParseException var4) {
                ;
            }

            return d;
        } else {
            return new Date();
        }
    }
}


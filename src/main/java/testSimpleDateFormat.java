import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testSimpleDateFormat {

    @Test
    public void test() throws ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化:日期---->字符串

        Date date = new Date();//默认构造器
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);

        //解析：格式化的逆过程，字符串
        String str = "19/12/12 上午11:46";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //自己定义的构造器,带参的构造器
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf2.format(date);
        System.out.println(format1);

        /*
        练习一：字符串”2020-09-08“ 转换为java.sql.date
        练习二："三天打渔两天晒网" 1990-01-01
         */

    }

    @Test
    public void test1() throws ParseException {
        String my_date = "2020-09-08";

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf3.parse(my_date);
        System.out.println(date1.getClass());
        java.sql.Date sql_date = new java.sql.Date(date1.getTime());
        System.out.println(sql_date.getClass());
    }
    //日历类的使用

    @Test
    public void test3(){
            //实例化
            //方式一：创建其子类(GregorianCalendar) 的对象
            //方式二：调用其静态方法getInstance（）
        Calendar calendar  = Calendar.getInstance();
        System.out.println(calendar.getClass());
            //常用方法
            //get()
        int days = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(days);
            //set()

            //add()

            //getTime()

            //setTime()
    }

}

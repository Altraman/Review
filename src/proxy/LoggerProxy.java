package proxy;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class LoggerProxy implements AbstractLog {
    private BusinessClass business;

    public LoggerProxy() {
        business = new BusinessClass();
    }

    @Override
    public void method() {
        final Calendar calendar = new GregorianCalendar();
        final int year = calendar.get(Calendar.YEAR);
        try {
            business.method();
            System.out.println("method 调用成功");
        } catch (Exception e) {
            System.out.println("method 调用失败");
        }
    }
}

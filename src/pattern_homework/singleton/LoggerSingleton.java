package pattern_homework.singleton;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LoggerSingleton {
    private static LoggerSingleton singleton;

    private LoggerSingleton() {}

    public static LoggerSingleton getInstance() {
        if (singleton == null) {
            singleton = new LoggerSingleton();
        }

        return singleton;
    }

    public void classLogg(Object obj, String info) {
        String dateTime = "[" + LocalDate.now() + " "
                + LocalDateTime.now().getHour() + ":"
                + LocalDateTime.now().getMinute() + ":"
                + LocalDateTime.now().getSecond() + "]";
        System.out.println(dateTime + "Log info: " + obj.getClass().getSimpleName() + " - " + info);
    }
}

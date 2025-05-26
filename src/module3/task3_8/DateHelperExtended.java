package module3.task3_8;

import java.util.Date;

public class DateHelperExtended extends DateHelper {

    public static long differenceInDays(Date startDate, Date endDate)
    {
        long diffInMillis = endDate.getTime() - startDate.getTime();
        return diffInMillis / (1000 * 60 * 60 * 24);
    }
}


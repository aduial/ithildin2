package aduial.ithildin.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by luthien on 20/03/2021.
 */
public class Utilities {
    public static Date convertToDate(LocalDate localDate){
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate convertToLocalDate(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}

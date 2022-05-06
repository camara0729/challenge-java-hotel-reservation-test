import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates {

    public Date toDate(String format) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(format);
            return date;
        }catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isWeekend(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if(dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
            return true;
        }
        else {
            return false;
        }
    }
}
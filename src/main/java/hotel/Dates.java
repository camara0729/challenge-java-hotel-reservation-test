package hotel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
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

    public List<Date> getDate(Date startDate, Date endDate) {
        List<Date> dateList = new ArrayList<Date>();
        Calendar calendarList = new GregorianCalendar();
        calendarList.setTime(startDate);
        while (calendarList.getTime().before(endDate) || calendarList.getTime().equals(endDate)) {
            Date result = calendarList.getTime();
            dateList.add(result);
            calendarList.add(Calendar.DATE, 1);
        }
        return dateList;
    }
}
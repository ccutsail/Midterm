import java.util.Calendar;

public class MyDate extends Person{
	Calendar myDate = Calendar.getInstance();
    int year = myDate.get(Calendar.YEAR);
    int month = myDate.get(Calendar.MONTH);
    int day = myDate.get(Calendar.DAY_OF_MONTH);
}

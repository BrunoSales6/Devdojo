package calendario;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        Date data=c.getTime();
        System.out.println(data);
        DateFormat[] dateFormat=new DateFormat[1];
        dateFormat[0]=DateFormat.getDateInstance();


    }
}

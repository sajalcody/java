import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.time.ZoneId;

class DateTimeTest {
    public static void main(String[] args){
        SimpleDateFormat dateFormatX = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        SimpleDateFormat dateFormatZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        SimpleDateFormat dateFormatz = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz");
        String date1 = dateFormatX.format(new Date());
        String date2 = dateFormatZ.format(new Date());
        dateFormatz.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date3 = dateFormatz.format(new Date(System.currentTimeMillis()));
        Date d1 = new Date(); // OR Date d2 = new Date(System.currentTimeMillis());
        // System.out.println("Date in ms: " + System.currentTimeMillis());
        // System.out.println("Raw date: " + d1);
        // System.out.println("Date XXX:  " + date1);
        // System.out.println("Date SSSZ: " + date2);
        // System.out.println("Date SSSz: " + date3);

        // FINAL REQUIREMENTS

        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));    
        // dateFormat.setTimeZone(TimeZone.getTimeZone(ZoneId.of("UTC")));
        System.out.println("zone id " + ZoneId.of("UTC"));
        System.out.println("Date in UTC format: " + dateFormat.format(new Date()));
    }
}
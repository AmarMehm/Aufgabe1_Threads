import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable {
    public int n;

    public DatePrinter(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i <= n; i++) {
            SimpleDateFormat formatter= new SimpleDateFormat("dd.MM.yyyy 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            System.out.println(formatter.format(date));
        }
    }
}

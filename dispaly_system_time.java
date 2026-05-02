import java.util.Date;
public class dispaly_system_time {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        Date currentDate = new Date(currentTime);
        System.out.println("Current system time: " + currentDate.toString());
    }
}

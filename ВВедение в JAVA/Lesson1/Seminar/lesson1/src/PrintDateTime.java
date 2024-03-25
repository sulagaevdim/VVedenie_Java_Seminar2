import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PrintDateTime {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd MMMM yyyy г., Время: HH:mm:ss");
        System.out.println(formatter.format(LocalDateTime.now()));

    }

}

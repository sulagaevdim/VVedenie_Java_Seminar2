import java.time.LocalTime;
import java.util.Scanner;

//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, представьтесь пожалуйста: ");
        String next = scanner.next();
//        System.out.println("Привет, " + next);
//        scanner.close();

        LocalTime now = LocalTime.now();

        if(now.isAfter(LocalTime.from(LocalTime.of(5, 0))) && now.isBefore(LocalTime.from(LocalTime.of(12, 0)))) {
            System.out.println("Доброе утро, " + next);
        } else if(now.isAfter(LocalTime.from(LocalTime.of(12, 0))) && now.isBefore(LocalTime.from(LocalTime.of(18, 0)))) {
            System.out.println("Добрый день, " + next);
        } else if(now.isAfter(LocalTime.from(LocalTime.of(18, 0))) && now.isBefore(LocalTime.from(LocalTime.of(23, 0)))) {
            System.out.println("Доброе вечер, " + next);
        } else System.out.println("Доброй ночи, " + next);
    }
    public static void hard() {
        LocalTime now = LocalTime.now();

        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in, "cp866");
        String name = scanner.nextLine();

        String mask = "%s, %s!%n";
        String morning = "Доброе утро";
        String day = "Добрый день";
        String evening = "Добрый вечер";
        String night = "Доброй ночи";

        if (now.isAfter(LocalTime.of(5, 0)) && now.isBefore(LocalTime.of(12, 0))) {
            System.out.printf(mask, morning, name);
        } else if (now.isAfter(LocalTime.of(12, 0)) && now.isBefore(LocalTime.of(18, 0))) {
            System.out.printf(mask, day, name);
        } else if (now.isAfter(LocalTime.of(18, 0)) && now.isBefore(LocalTime.of(23, 0))) {
            System.out.printf(mask, evening, name);
        } else {
            System.out.printf(mask, night, name);
        }
        scanner.close();
    }

}

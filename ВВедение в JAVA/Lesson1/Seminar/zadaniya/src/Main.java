import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("11.txt");
            System.out.println("Прочитали");

        } catch (FileNotFoundException e) {
            try {
                FileWriter writer = new FileWriter("Error.txt", true);
                writer.write("Мы здесь потому что ошибка \n");
                writer.flush();
            } catch (IOException ex) {
                System.out.println("Catch 2");
            }

        }
    }
}
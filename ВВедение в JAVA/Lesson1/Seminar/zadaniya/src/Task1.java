// Дано четное число N (>0) и строки c1 и c2, которые следует учитывать как 1 символ.
// Написать метод, который вернет строку длины N*2, которая
// состоит из чередующихся последовательностей c1 и c2, начиная с c1.


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int N = console.nextInt();
        String c1 = "1";
        String c2 = "2";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < N; i++) {
            str.append(c1);
            str.append(c2);

        }
        System.out.println(str);
    }
}

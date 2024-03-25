// Дано четное число N (>0) и строки c1 и c2, 
//которые следует учитывать как 1 символ. 
//Написать метод, который вернет строку длины N*2, 
//которая состоит из чередующихся последовательностей 
//c1 и c2, начиная с c1.

public class Task1 {
    public static void main(String[] args) {
        String c1 = "c1";
        String c2 = "c2";
        int N = 6;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= N; i++) {
            sb.append(c1).append(c2);

        }
        System.out.println(sb);
    }

    
}
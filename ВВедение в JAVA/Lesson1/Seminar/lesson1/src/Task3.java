public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 3, 7, 3, 2, 1, 3, 3, 7, 8, 12};
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(sortArray(array)[i] + " ");
        }
    }
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 3) {
                for (int j = array.length - 1; j >= 0; j--) {
                    if (array[j] != 3) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}

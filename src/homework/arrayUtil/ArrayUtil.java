package homework.arrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 7, 9, 8, 1, 4, 11, 17};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        int counts = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counts++;
            }
        }
        System.out.println(counts);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println(sum / array.length);

    }
}

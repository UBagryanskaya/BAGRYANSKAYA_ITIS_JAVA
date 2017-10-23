import java.util.Arrays;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 78, 0, 4, 0};
        kfh(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void kfh(int[] array) {
        for (int i = 0; i < 6; i++) {
            if (array[i] == 0) {
                array[i] = array[i - 1] * (-1);
            }
        }
    }
}
import java.util.Arrays;

public class Strinarr {
    public static void main(String[] args) {
        String arr[] = {"abc", "jgh", "hgf"};
        System.out.println(danet(arr));
    }

    static boolean danet(String[] arr) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("str")) {
                b = true;
            }

        }
        return b;
    }
}

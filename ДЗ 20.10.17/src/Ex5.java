import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        String[] arr = {"ghj", "pro", "str", "pro", "jok"};
        System.out.println(takliato7(arr));
    }
    static boolean takliato7 (String arr[]){
        boolean b = false;
        for(int j = 0; j < arr.length; j++){
            for(int i = j+1; i < arr.length; i++)
                if(arr[i] .equals (arr[j]))
                    b = true;
        }
        return b;
    }
}

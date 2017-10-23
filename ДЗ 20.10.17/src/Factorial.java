import java.util.Scanner;
public class Factorial {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Число n: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
    static int fact(int n){
        int pro = 1;
        for(int i = 1; i < n + 1; i++) {
            pro = pro*i;
        }
        return pro;
    }
}

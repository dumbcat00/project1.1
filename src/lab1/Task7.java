package lab1;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("введите натуральное число: ");
        int n= in.nextInt();
        int res=fact(n);
        System.out.println("факториал от "+n+" равен "+res);
    }
    private static int fact(int n) {
        int res=1;
        for (int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
}

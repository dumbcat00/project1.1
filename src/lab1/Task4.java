package lab1;
import java.lang.*;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во элементов массива: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        int[] arr = new int[i];



        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        System.out.println("Введите значения массива: ");
        for (int j=0;j<i;j++){
            arr[j]=in.nextInt();
            if (arr[j]<min){min=arr[j];}
            if (arr[j]>max){max=arr[j];}
            //System.out.println(arr[j]);
        }

        int a=0;
        double sum=0;
        while(a<i){
            sum+=arr[a];
            a++;
        }

        System.out.println("sum = "+sum+"\nmin = "+min+"\nmax = "+max);

        in.close();
    }
}

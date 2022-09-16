package lab1;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("первые 10 чисел гармонического ряда:");
        System.out.print("1");
        for (double i=2; i<=10; i++){
            //double res=1/i;
            //String str=String.format(" + %.2f", 1/i);
            System.out.printf(" + %.2f", 1/i);
        }
        System.out.println(" + ...");
    }
}

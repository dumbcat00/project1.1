package lab1;

public class Task3 {
    public static void main(String[] args) {
        double sum=0;
        int arr[]=new int[11];
        for (int i=1; i<11; i++){
            arr[i]=i;
            System.out.println(arr[i]);
            sum+=i;
        }
        double average=sum/10;
        System.out.println("sum = "+sum+"\naverage = "+average);
    }
}

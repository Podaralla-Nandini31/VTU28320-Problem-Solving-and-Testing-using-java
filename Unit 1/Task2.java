import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,5,3,6,7,3,4};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the index of the element:");
        int n=s.nextInt();
        System.out.println("Element at the entered index:");
        System.out.println(arr[n]);
    }
}

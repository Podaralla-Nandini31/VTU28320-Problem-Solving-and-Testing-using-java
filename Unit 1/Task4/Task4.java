import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int arr[]=new int[]{7,67,45,34,90,178,200,44,78};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element in the array is "+max);
    }
}

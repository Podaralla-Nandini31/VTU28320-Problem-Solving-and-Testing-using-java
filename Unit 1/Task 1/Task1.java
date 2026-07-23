import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
       }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+(arr[i]/10);
            System.out.print(arr[i]+" ");
        }
        
    }
}


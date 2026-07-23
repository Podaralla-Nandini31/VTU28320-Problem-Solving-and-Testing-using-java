import java.util.*;
;public class Task5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int []{4,5,3,89,76,34,98,21};
        System.out.println("Enter the number :");
        int k=s.nextInt();
           if (k > arr.length || k<= 0) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        Arrays.sort(arr);
       System.out.println("The "+k+" th smallest element is "+arr[k]);
    }
}

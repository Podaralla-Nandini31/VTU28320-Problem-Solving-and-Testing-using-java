import java.util.Scanner;
public class Task3 {
    public static int binarySearch(int arr[],int n){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]>n){
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[]{23,44,56,78,79,83,89,90};
        System.out.println("Enter the element to search:");
        int n=s.nextInt();
        int result=binarySearch(arr,n);
        if(result!=-1){
        System.out.println("The element is present at the index "+result);
        }
        else{
            System.out.println("The element is not present in the array");
        }
    }
}

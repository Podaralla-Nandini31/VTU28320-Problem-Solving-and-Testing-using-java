public class Task6 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,8,6};
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                System.out.println("["+arr[i]+","+arr[j]+"]");
            }
        }
    }
}

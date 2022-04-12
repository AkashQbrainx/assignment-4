public class ReverseOrder {

    public static void print(int[] arr,int n){
        if(n==0) return;
        else{
            System.out.print(arr[n-1] + " ");
            print(arr,n-1);
        }
    }
}

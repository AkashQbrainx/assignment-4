import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PrimeNumberProg.prime(20);
        System.out.println("\n--------------");
        int[] arr=new int[]{1,2,3,4,5};
        ReverseOrder.print(arr,arr.length);
        System.out.println("\n-------------");
        int[] array=new int[]{22,33,21,44,55,66};
        System.out.println(Arrays.stream(array).sorted().limit(array.length-2).max().getAsInt());
    }
}

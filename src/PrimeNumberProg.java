
import java.util.ArrayList;

public class PrimeNumberProg {

    public static void prime(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr.add(i);
                if (arr.indexOf(i) % 2 == 0)
                    System.out.print(i + " ");
            }
        }

    }
}

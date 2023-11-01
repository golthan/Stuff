import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int a,b,n, temp;
        double nemax = Double.NEGATIVE_INFINITY,
                pomin = Double.POSITIVE_INFINITY;
        ArrayList<Integer> arr =  new ArrayList<Integer>();
        a = input.nextInt();
        b = input.nextInt();
        n = input.nextInt();
        input.close();
        while (n > 0) {
            temp = random.nextInt(b-a) + a ;
            arr.add(temp);
            n -= 1;
        }
        for (Integer i : arr) {
            System.out.println(i);
            if (i > nemax && i < 0) {nemax = i;}
            if (i < pomin && i > 0) {pomin = i;}
        }
        if(pomin == Double.POSITIVE_INFINITY || b <= 0) System.out.println("khong co so duong nho nhat");
        else System.out.println("so duong nho nhat " + pomin );
        if(nemax == Double.NEGATIVE_INFINITY || a >= 0) System.out.println("khong co so am lon nhat");
        else System.out.println("so am lon nhat " + nemax );
    }
}
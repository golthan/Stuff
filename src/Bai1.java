import java.util.Scanner;

public class Bai1 {
   public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a,b,i,min;
        System.out.print("Nhap vao hai so: ");
        a = input.nextInt();
        b = input.nextInt();
        input.close();
        min= Math.min(a, b);
        for(i=2;i<min;i++) {
            if (((a%i)==0)&&((b%i)==0)) break;
        }
        if(i==min) {
            System.out.print("Khong co mau chung nho nhat");
        }
        System.out.print("mau chung nho nhat la: "+ i);
    }
}

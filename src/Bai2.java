public class Bai2 {
    public static void main(String[] args) {
        int a,b;
        for(a=1; a<=500; a++) {
            for(b=a; b<=Math.sqrt(500*500-a*a); b++) {
                double c = Math.sqrt(a*a+b*b);
                if(c == Math.round(c) && c <=500) {
                    System.out.printf("( %d, %d, %d)\n", a,b, (int) c);
                }
            }
        }
    }
}
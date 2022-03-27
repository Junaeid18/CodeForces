import java.util.Scanner;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next(), in2 = s.next();
        int n = in.length(),i=0;
        while (i < n){
            if(in.charAt(i) == in2.charAt(i)){
                System.out.print(0);
            }else System.out.print(1);
            i++;
        }
    }
}

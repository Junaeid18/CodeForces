import java.text.DecimalFormat;
import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000000000000");
        int n = s.nextInt(),i=0; double d = 0,ds=0;
        while(i < n){
            d = s.nextDouble(); d = d/100;
            ds += d; i++;
        }
        ds = (ds/n)*100;
        System.out.println(df.format(ds));
    }
}

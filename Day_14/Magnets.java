package Day_14;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt(),i=0,j,k,count=1;
        j = s.nextInt();i++;
        while(i < l){
            k = s.nextInt();
            if (j != k)count++;
            j = k; i++;
        }
        System.out.println(count);
    }
}

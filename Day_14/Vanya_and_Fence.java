package Day_14;

import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), h = s.nextInt(),i=0,j=0,width=0;
        while(i<n){
            j = s.nextInt();
            if(j <= h) width++;
            else width = width + 2; i++;
        }
        System.out.println(width);
    }
}

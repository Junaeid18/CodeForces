import java.util.Scanner;

public class Gravity_Flip {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),i=0; int[] ar = new int[n];
        while(i < n){
            ar[i] = s.nextInt(); i++;
        }
        for (int j = 0; j < n; j++) {
            for (int k = 1; k < (n-j); k++) {
                if (ar[k-1] > ar[k]){
                    int tmp = ar[k-1];
                    ar[k-1] = ar[k];
                    ar[k] = tmp;
                }
            }
        }i=0;
        while(i<n){
            System.out.print(ar[i]+" "); i++;
        }
    }
}

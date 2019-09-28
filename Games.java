import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); int[] h = new int[n]; int[] a = new int[n];
        int i=0,count=0;
        while (i<n){
            h[i] = s.nextInt(); a[i] = s.nextInt(); i++;
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if(h[j] == a[k]) count++;
            }
        }
        System.out.println(count);
    }
}

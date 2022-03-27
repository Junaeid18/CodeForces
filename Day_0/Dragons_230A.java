import java.util.Scanner;

public class Dragons_230A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int st = s.nextInt(), n = s.nextInt(),i=0;
        int[] ds = new int[n]; int[] bonos = new int[n];
        while (i<n){
            ds[i] = s.nextInt(); bonos[i] = s.nextInt(); i++;
        }
        for (int j = 0; j < n; j++) {
            for (int k = 1; k < (n-j); k++) {
                if(ds[k-1] > ds[k]){
                    int tmp = ds[k-1], tmp2 = bonos[k-1];
                    ds[k-1] = ds[k];   bonos[k-1] = bonos[k];
                    ds[k] = tmp;    bonos[k] = tmp2;
                }
            }
        }
        i=0;
        while (i<n){
            if(st > ds[i]){
                st += bonos[i];
            }else break;
            i++;
        }
        if (i == n) System.out.println("YES");
        else System.out.println("NO");
    }
}

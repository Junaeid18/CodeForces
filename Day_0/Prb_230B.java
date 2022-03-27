import java.util.Scanner;

public class Prb_230B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),i=0,l;
        long j = 0,k;
        while(i < n ){
            j = s.nextLong(); k = 2; l = 0;
            while(l < 2 &&  k < j){
                if(j > 10) l = 5;
                else if (j % k == 0){
                    l++;
                }k++;
            }
            if (l == 1) System.out.println("YES");
            else System.out.println("NO");
            i++;
        }
    }
}


/* not solved  */
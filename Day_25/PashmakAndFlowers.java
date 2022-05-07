/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-25
*/
import java.util.Scanner;
import java.util.Arrays;
public class PashmakAndFlowers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),m = n; long diff,count1=1,count2=1,result,m2;
        int[] ar = new int[n];
        while(--n > -1){
            ar[n] = s.nextInt();
        }   Arrays.sort(ar);
        diff = ar[m-1] - ar[0];
        if(ar[0] == ar[m-1]){
            m2 = (long) m;
            result =  m2 * (m2-1)/2 ;
            System.out.println(diff+" "+result);
        }else{
            for (int i = 1; i < m; i++) {
                if(ar[0] == ar[i]){++count1;} else break;
            }
            for (int i = m-2; i > 0; i--) {
                if(ar[m-1] == ar[i]){++count2;} else break;
            }
            result = count1*count2;
            System.out.println(diff+" "+result);
        }
    }
}

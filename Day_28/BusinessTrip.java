/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-28
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class BusinessTrip {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Integer k = s.nextInt(),n = 12, ar[] = new Integer[n],sum=0; 
        boolean status = false;  
        while(!(--n < 0)){
            ar[n] = s.nextInt();
        }   Arrays.sort(ar,Collections.reverseOrder());
        while(++n < 12){
            sum += ar[n];
            if(k == 0){
                System.out.println(0); status = true; break;
            }else if(sum >= k){
                System.out.println(n+1); status = true; break;
            }
        }   s.close();
        if(!status)System.out.println("-1");
    }    
}

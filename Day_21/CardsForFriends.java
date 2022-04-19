/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
import java.util.Arrays;
public class CardsForFriends {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] ar = new int[10001]; 
        Arrays.fill(ar, 1);    ar[2] = 2;
        for (int i = 4; i < ar.length; i+=2) {
            if(i % 2 == 0){ ar[i] = 2 * ar[i/2];}
        }
        int count = 0, testCase = s.nextInt(), nCheck, w,h,n;
        while(count < testCase){
            nCheck = 1;    w = s.nextInt(); h = s.nextInt(); n = s.nextInt();  
            if(w%2==0 || h%2==0){
                if(w%2==0 && h%2==0){   nCheck = ar[w] * ar[h];}
                else if(w%2==0){    nCheck = ar[w];}
                else{   nCheck = ar[h];}
            }
            if(nCheck >= n){ System.out.println("YES");}
            else{   System.out.println("NO");} ++count;
        }
    }
}

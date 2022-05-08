/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-25
*/
import java.util.Scanner;
import java.util.HashSet;
public class SerejaAndSuffixes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        int n = s.nextInt(), m = s.nextInt(), p = n+1, distinct = 1, count = 0;
        int[] ar = new int[n+1]; int[] disNum = new int[n+1]; 
        while(++count < p){ ar[count] = s.nextInt();  }   --count;    
        set.add(ar[count]); disNum[count] = distinct;
        while(--count > 0){
            if(!(set.contains(ar[count]))){
                set.add(ar[count]); ++distinct; disNum[count] = distinct;
            }else{
                disNum[count] = distinct;
            }   
        }
        while(m-- > 0){
              out.append(disNum[s.nextInt()]+"\n"); 
        }   s.close();
        System.out.println(out);
    }
}

/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-27
*/
import java.util.HashMap;
import java.util.Scanner;
public class Lecture {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        int n = s.nextInt(), m = s.nextInt(),len1,len2,c=0;  s.nextLine();
        String inp; String[] ar;
        while(m-- > 0){
            inp = s.nextLine(); ar = inp.split(" ", 2);
            len1 = ar[0].length();  len2 = ar[1].length();
            map.put(ar[0], ar[1]);  
            if(len1 <= len2)map2.put(ar[0], 1); else map2.put(ar[0], 0);
        }
        inp = s.nextLine(); ar = inp.split(" ", n);
        while(c < n){
            if(map2.get(ar[c]) > 0)out.append(ar[c]+" ");
            else out.append(map.get(ar[c])+" ");    ++c;
        }
        System.out.println(out);
    }
}

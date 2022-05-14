/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-28
*/
import java.util.HashSet;
import java.util.Scanner;
import static java.lang.Math.max;
public class TwoTeamsComposing {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        HashSet<Integer> set = new HashSet<>(); 
        int testCase = s.nextInt(),n,num,max,ar[],set_size;
        while(testCase-- > 0){
            n = s.nextInt(); ar = new int[n+1]; max = 0; set.clear();
            for (int i = 0; i < n; i++) {
                num = s.nextInt();
                set.add(num);
                ar[num]++;
            }
            if(n < 3){
                if(n == 2)out.append("1"+"\n");
                else out.append("0"+"\n");
            }
            else{
                for (int i = 1; i <= n; i++) {
                    max = max(max, ar[i]);
                }   set_size = set.size();   
                if(max == set_size)out.append(String.valueOf(max-1)+"\n");
                else if(max < set_size)out.append(String.valueOf(max)+"\n");
                else out.append(String.valueOf(set_size)+"\n");
            }
        }
        System.out.print(out);
    }
}

/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-26
*/
import java.util.Scanner;
import static java.lang.Math.sqrt;
//import java.util.ArrayList;
import java.util.HashSet;
public class TprimeV3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        //ArrayList<Long> list = new ArrayList<>();
        HashSet<Long> set = new HashSet<>();
        long[] ar = new long[1000007];
        //list.add(4l);
        set.add(4l);
        for (int i = 3; i <= 1000000; i+=2) {
            if(ar[i] == 0){
                //list.add((long)i*i);
                set.add((long) i * i);
                for (int j = i; j <= 1000000; j+=i) {
                    ar[j] = 1;
                }
            }
        }
        int n = s.nextInt();    long num,num2;
        while(n-- > 0){
            num = s.nextLong();
            num2 = (long)sqrt(num);
            if(num2 == 1)out.append("NO"+"\n");
            else if(num2 * num2 == num){
                if(set.contains(num))out.append("YES"+"\n");   else out.append("NO"+"\n");
            }else out.append("NO"+"\n");
        }   s.close();
        System.out.print(out);
    }
}

/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-26
*/
import java.util.Scanner;
import static java.lang.Math.abs;
public class CaseOfZeroAndOnes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),c=0,sum=0,m; s.nextLine();
        String inp = s.nextLine();  
        while(c < n){
            sum += Character.getNumericValue(inp.charAt(c));    ++c;
        }
        if(sum == n || sum == 0)System.out.println(n);
        else if(n%2 == 0){
            n /= 2;
            if(sum == n)System.out.println(0);
            else{
                c = abs(sum - n) * 2;   System.out.println(c);
            }
        }else{
            m = n - 1;   m /= 2;
            if(sum == m)System.out.println(1);
            else{
                if(sum > m)sum = n - sum;
                c = n - (sum * 2);   System.out.println(c);
            }
        }s.close();
    }
}

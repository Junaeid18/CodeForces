/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-26
*/
import java.util.Scanner;
public class BoardMoves {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int testCase = s.nextInt(); long n, j , sum;
        while(testCase-- > 0){
            n = s.nextInt();    sum = 0; j = n/2;
            if(n == 1)out.append("0"+"\n");
            else{
                for (long i = n; i >= 3; i-=2) {
                    sum += (i * j + (i-2) * j) * 2; --j;
                }
                out.append(String.valueOf(sum+"\n"));
            }
        }
        System.out.print(out);
    }
}

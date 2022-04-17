/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class MagicalSticks {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count  = 0, n = s.nextInt(),res,i;
        while(count < n){
            i = s.nextInt();    res = (i%2 == 0) ? i/2 : i/2 + 1;   System.out.println(res);    ++count;
        }
        s.close();
    }    
}

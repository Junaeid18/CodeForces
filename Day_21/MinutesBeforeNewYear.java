/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class MinutesBeforeNewYear {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),h,min,total;
        while (count < testCase) {
            h=s.nextInt(); min=s.nextInt();
            if(h < 24){
                total = (23-h)*60 + 60-min; System.out.println(total);
            }else{System.out.println(0);} ++count;
        }
    }
}

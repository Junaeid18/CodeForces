/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.ArrayList;
import java.util.Scanner;
public class FancyFance {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 3,j = 1; i < 1000; i++,++j) {
            int angle = (180 * j) / i; int check = angle * i, check2 = 180 * j;
            if(check == check2){
                if(angle < 180){   if(!(li.contains(angle))) {li.add(angle);}}
                else{ break;}
            }
        }
        //System.out.println(li.toString());
        int count = 0, n = s.nextInt(),inputAngle;
        while(count < n){
            inputAngle = s.nextInt();   
            if(li.contains(inputAngle)){System.out.println("YES");}else{ System.out.println("NO");}
            ++count;
        }
    }
}

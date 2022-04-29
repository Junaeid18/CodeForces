/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-23
*/
import java.util.Scanner;
public class SquareString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),num;  s.nextLine();  
        String input,com1,com2;
        while(count < testCase){
            input = s.nextLine();
            if(input.length()%2==0){
                num = input.length()/2; com1 = input.substring(0, num); com2 = input.substring(num);
                if(com1.equals(com2)){System.out.println("YES");}
                else{System.out.println("NO");}
            }else{System.out.println("NO");}    ++count;
        }
    }
}

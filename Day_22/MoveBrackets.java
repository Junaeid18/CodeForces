/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class MoveBrackets {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String bracketString;    
        int count = 0, testCase = s.nextInt(),move,size,inC,tot;
        while(count < testCase){
            size = s.nextInt(); s.nextLine();   bracketString = s.nextLine();   move = tot = inC = 0;
            while(inC<size){
                if(bracketString.charAt(inC) == '('){++tot;}
                else{--tot; if(tot<0){  ++move; tot = 0; }}  ++inC;
            }
            System.out.println(move);   ++count;
        }
    }    
}

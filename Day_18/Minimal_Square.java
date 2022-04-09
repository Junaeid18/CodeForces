import java.util.Scanner;
public class Minimal_Square {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0,a,b,sqsl,max,min,requiredArea, testCase = s.nextInt();
        while(count < testCase){
            a = s.nextInt();    b = s.nextInt();
            min = a < b ? a : b;  max = min == a ? b : a;  min = min * 2;
            sqsl = Math.max(max, min);
            requiredArea = sqsl * sqsl; System.out.println(requiredArea); 
            count++;
        }
    }    
}
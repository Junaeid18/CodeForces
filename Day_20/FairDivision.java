/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class FairDivision{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),n,w1,w2,weight,input;
        while(count < testCase){
            n = s.nextInt();    w1 = w2 = weight = 0;    
            for (int i = 0; i < n; i++) {
                input = s.nextInt(); 
                if(input == 1){ w1++; weight +=1;}
                else{   w2++;weight +=2;}
            }
            if(weight %2 == 0){
                int sum = weight/2;
                if((w1 % 2 == 0) && (w2 % 2 == 0)){ System.out.println("YES");}
                else if(sum%2 == 0 || (sum%2 == 1 && w1 != 0)){ System.out.println("YES");}
                else{   System.out.println("NO");}
            }else{   System.out.println("NO");}
            count++;
        }
    }
}



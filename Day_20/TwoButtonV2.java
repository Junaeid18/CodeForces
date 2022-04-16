/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class TwoButtonV2 {
    public static int m;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();
        int n = s.nextInt(), value = n; m = s.nextInt();
        boolean doing = false;
        if(n >= m){ System.out.println(n-m);}
        else{
            int num1=0, num2=0, result=0,step = Integer.MAX_VALUE,itr=0,i=0;
            while(!doing){
                num1 = Cal(value);  num2 = Cal(value-1)+1;
                if(Math.max(num1, num2) < 0 ){ doing = true;}
                else{
                    if(num1 <0 || num2 <2){
                        if(num1<1){ result = num2+i;  --value;}
                        else{   result = num1+i;  value*=2;}
                    }else{
                        if(Math.min(num1,num2) == num1){    result = num1+i; value*=2;}
                        else{   result = num2+i;  --value;}
                    }
                    if(result <= step){  step = result; li.add(step);}
                    else{doing = true;}
                }   i++;
            }
            Collections.sort(li);
            System.out.println(li.get(0));
        }
    
    }
    public static int Cal(int target){
        int steps=0;
        if(target > 0){
            while(!(target >= m)){
                target *= 2;  ++steps;
            }
        }
        if(steps == 0){ return steps;}
        else{
            int d1 = target - m;
            return steps+d1;
        }
    }
}

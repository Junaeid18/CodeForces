/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-23
*/
import java.util.Scanner;
public class ArrayWithOddSum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),sum,n,inC,odd,even,num;    
        while(count < testCase){
            n = s.nextInt();    inC=0;  sum=0; odd = even = 0;
            while(inC<n){ num=s.nextInt();  if(num%2==0){ ++even;}else{ ++odd;} sum+=num; ++inC;} ++count;
            if(sum%2==0){
                if(odd>0 && even>0){System.out.println("YES");}
                else{System.out.println("NO");}
            }else{System.out.println("YES");}
        }s.close();
    }    
}

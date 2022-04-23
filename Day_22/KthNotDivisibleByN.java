/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class KthNotDivisibleByN {
  public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      Long count = 0l, testCase = s.nextLong(),n,k,rem,a,b,result=0l;
      while(count < testCase){
        n = s.nextLong();    k = s.nextLong();
        if(n >= k){
            if(n>k){    result = k; }
            else{   result = k+1; }
        }else{
            a = n-1;    b = k/a;    rem = k%a;
            if(rem==0){ result=(n*b)-1; }
            else{   result = (n*b)+rem; }
        }   
        System.out.println(result);    ++count;
      } s.close();
  }  
}

/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-24
*/
import java.util.Scanner;
public class Books {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, n = s.nextInt(),t = s.nextInt(), books=0,pointer=0; long sum = 0;
        int[] ar = new int[n];
        while(count < n){   ar[count] = s.nextInt();    ++count;}
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
            if(sum <= t){   ++books; }   else{   sum -= ar[pointer]; ++pointer;}
        }
        System.out.println(books);  s.close();
    }
}

/* 
if(sum <= t){System.out.println(n);}
else{
    --count;
    if(count >= 1){
        while(!(sum <= t) && (count > 0)){
            sum -= ar[count]; --count;
        }
        if(sum <= t){System.out.println(count+1);}  else{   System.out.println(0);}
    }else{System.out.println(0);}
} */

/* 
int count = 0, n = s.nextInt(),num,res=0; long sum=0, t = s.nextLong(),rem=t;    
while(count < n){
    num = s.nextInt();
    if(num<=rem){++res;   rem-=num;}  ++count; 
}System.out.println(res);   s.close(); */
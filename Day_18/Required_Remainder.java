import java.util.Scanner;
public class Required_Remainder {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0,x,y,n,ans1,num,step,fAns, testCase = s.nextInt();
        while(count < testCase){
            x = s.nextInt(); y = s.nextInt(); n = s.nextInt();
            ans1 = num = step = fAns = 0;
            ans1 = n % x;
            if(ans1 == y){ System.out.println(n);}
            else{
                if(ans1 > y){   num = ans1 - y; fAns = n - num;}
                else{  step = (n / x) - 1; fAns = (step * x) + y; }
                System.out.println(fAns);    
            }
            count++;
        }
    }
}

/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-27
*/
import java.util.Scanner;
public class KanaAndDragonQuest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int testCase = s.nextInt(), x,m,n,res,c;
        while(testCase-- > 0){
            x = s.nextInt(); n = s.nextInt(); m = s.nextInt(); res = x; c = n; 
            while(res > 20 && c > 0){
                res = res/2 + 10;   --c;
            }
            res -= (m * 10);
            if(res > 0)out.append("NO"+"\n");   else out.append("YES"+"\n");
        }s.close();
        System.out.print(out);
    }
}


/* 
double[] ar = new double[31];   double sum = 0, calP;    
for (int i = 0; i < 30; i++) {
    calP = pow(2, i);   sum += 10/calP; ar[i+1] = sum; 
}
int testCase = s.nextInt(); double x,n,m,div1,res; 
while(testCase-- > 0){
    x = s.nextDouble(); n = s.nextDouble(); m = s.nextDouble();
    div1 = pow(2,n);
    res = (x/div1) + ar[(int)n];    res -= m * 10;
    if(res > 0)out.append("NO"+"\n");   else out.append("YES"+"\n");
}
System.out.print(out); */
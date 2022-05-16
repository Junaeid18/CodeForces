/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-28
*/
import java.util.Scanner;
import static java.lang.Math.max;
public class Elections {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int testCase = s.nextInt();
        long a,b,c,aVote,bVote,cVote;
        while(testCase-- > 0){
            a = s.nextLong(); b = s.nextLong(); c = s.nextLong();
            aVote = max(0,(max(b,c)+1 - a));
            bVote = max(0,(max(a,c)+1 - b));
            cVote = max(0,(max(b,a)+1 - c));
            out.append(String.valueOf(aVote)+" "+String.valueOf(bVote)+" "+String.valueOf(cVote)+"\n"); 
        }   s.close();
        System.out.print(out); 
    }
}


/* maxVote = max(a, max(c, b));    minVote = min(a, min(c, b));
if(maxVote == minVote)out.append("1 1 1"+"\n");
else{
    aVote = (a == maxVote)? 0 : maxVote - a + 1;
    bVote = (b == maxVote)? 0 : maxVote - b + 1;
    cVote = (c == maxVote)? 0 : maxVote - c + 1;
    out.append(String.valueOf(aVote)+" "+String.valueOf(bVote)+" "+String.valueOf(cVote)+"\n"); 
} */
/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-29
*/
import java.util.Scanner;
public class RandomTeams {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong(), m = s.nextLong(),eachTeam,xtrMem,xtrMemPair,mainPair,kMin,kMax;
        //k-Max
        if(m == 1){
            if(n > 1){
                kMax = (n * (n-1))/2;
            }else kMax = 0;
        }else if(m == n)kMax = 0;
        else{
            eachTeam = n-m+1; kMax = (eachTeam * (eachTeam-1))/2;
        }
        //k-Min
        if(n%m == 0){
            eachTeam = n/m; 
            if(eachTeam > 1){
                kMin = ((eachTeam * (eachTeam - 1))/2) * m;
            }else kMin = 0;
        }else{
            eachTeam = n/m;     xtrMem = n%m;
            xtrMemPair = ((eachTeam*(eachTeam+1))/2)*xtrMem;
            if(eachTeam > 1){
                mainPair = ((eachTeam*(eachTeam-1))/2) * (m - xtrMem);
            }else mainPair = 0;
            kMin = xtrMemPair + mainPair;
        }
        System.out.println(kMin+" "+kMax);
    }
}

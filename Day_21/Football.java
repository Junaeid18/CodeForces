/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class Football {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, line = s.nextInt(),aScore=0,bScore=0;  s.nextLine();
        String a="",b="",team;
        team = s.nextLine();    a=team; ++aScore;
        while(count < line-1){
            team = s.nextLine();
            if(team.equals(a)){++aScore;}
            else if(team.equals(b)){++bScore;}
            else{b=team; ++bScore;} ++count;
        }
        if(aScore>bScore){System.out.println(a);}   else{System.out.println(b);}
    }
}

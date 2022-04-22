/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class VanyaAndCubes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),height=0,rem=n,lvlCube,lvl=1;   boolean run = false;
        while(!run){
            lvlCube = 0;    
            for (int i = 1; i <= lvl; i++) {    lvlCube += i; }
            if(rem >= lvlCube){rem -= lvlCube; ++lvl;}  else{run=true;}
        } s.close();
        System.out.println(lvl-1);
    }
}

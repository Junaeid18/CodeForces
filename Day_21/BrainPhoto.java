/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class BrainPhoto {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, n = s.nextInt(), m = s.nextInt(); s.nextLine();
        String color; boolean status = false;
        while(count < n){
            color = s.nextLine();
            if(!status){
                for (int i = 0; i < color.length(); i+=2) {
                    char c = Character.valueOf(color.charAt(i));
                    if(c == 'C' || c == 'M' || c == 'Y'){status = true;}
                }
            }
            ++count;
        } s.close();
        if(status){System.out.println("#Color");}
        else{System.out.println("#Black&White");}
    }
}

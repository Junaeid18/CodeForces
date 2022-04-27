/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-22
*/
import java.util.Scanner;
public class FloorNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),n,x,floor,xtra;
        while(count < testCase){
            n = s.nextInt();    x = s.nextInt();
            if(n < 3){floor = 1;}
            else{
                floor = (n-2)/x;    ++floor;    xtra = (n-2)%x;    if(xtra>0)++floor;
            }System.out.println(floor); ++count;
        }   s.close();    
    }
}

//Again Typing mistake, in xtra typed 2 in place of x;

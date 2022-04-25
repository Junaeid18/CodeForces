/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-22
*/
import java.util.Scanner;
public class ParkLighting {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),n,m,minLan;
        while(count < testCase){
            n = s.nextInt(); m = s.nextInt();
            if((n*m)%2==0){minLan = (n*m)/2;}
            else{minLan = ((n*m)+1)/2;}
            System.out.println(minLan); ++count;
        }   s.close();
    }    
}

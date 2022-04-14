/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class BlackBox {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] ar = new int[5];  long sum = 0L;
        for (int i = 1; i < ar.length; i++) {ar[i] = s.nextInt();}
        s.nextLine();  
        String input = s.nextLine();
        for (int i = 0; i < input.length(); i++) {
            int a = Character.getNumericValue(input.charAt(i));
            sum += ar[a]; 
        }
        System.out.println(sum);
        s.close();
    }
}

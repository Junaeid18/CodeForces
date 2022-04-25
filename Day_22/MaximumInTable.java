/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-22
*/
import java.util.Scanner;
public class MaximumInTable {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();       
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || j==0){table[i][j] = 1;}
                else{table[i][j] = table[i][j-1]+ table[i-1][j];}
            }
        }
        System.out.println(table[n-1][n-1]);    s.close();
    }    
}

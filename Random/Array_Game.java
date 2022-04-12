import java.util.Scanner;
public class Array_Game {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = new int[n];
        int[] F = new int[n];
        boolean result = true;
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        int val1 = A[n-1] - A[0],   val2;
        for (int i = 1; i < n; i++) {
            val2 = A[n-1] - A[i];
            if(!(val1 >= val2)){
                result = false; break;
            }
            val1 = val2;
        }
        if(result == false) {   System.out.println("NO");}
        else{   System.out.println("YES");}
    }    
}

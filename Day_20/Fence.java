/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class Fence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, n = s.nextInt(), k = s.nextInt();
        int[] ar = new int[n];  int[] ar2 = new int[k];
        boolean start = false;  int sum = Integer.MAX_VALUE, ind=0,newSum = -1;
        while(count < n){
            ar[count] = s.nextInt();
            if(start){
                newSum += (ar[count] - ar[count-k]); if(newSum < sum) {sum = newSum; ind = count+1-k;}
            }
            else if(count+1 >= k && !start){
                System.arraycopy(ar, count+1-k, ar2, 0, k);  
                newSum = sum(ar2); if(newSum < sum){ sum = newSum; ind=count+1-k;}
                start = true;
            } ++count;
        }
        s.close();
        System.out.println(ind+1);
    }
    public static int sum(int[] sum){
        int resSum = 0;
        for (int i = 0; i < sum.length; i++) {
            resSum += sum[i];
        }
        return resSum;
    }
}

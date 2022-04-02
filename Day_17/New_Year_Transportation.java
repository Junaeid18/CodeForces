import java.util.Scanner;
public class New_Year_Transportation {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), t = s.nextInt(), count = 1;
        int[] ar = new int[n+1]; boolean stop = false;
        while(count < n){
            ar[count] = s.nextInt();    count++;
        } count = 1;
        while(!stop){
            if(t == count) {System.out.println("YES"); stop = true;}
            else if(t < count) {System.out.println("NO"); stop = true;}
            else {
                count = ar[count] + count;
            }
        }
    }
}

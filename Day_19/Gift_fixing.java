import java.util.Scanner;
public class Gift_fixing {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0,n,minA,minB,dif1,dif2, testCase = s.nextInt();
        long step;
        while(count < testCase){
            n = s.nextInt();    int[] a = new int[n];   int[] b = new int[n];   step = 0;   minA = minB = (int) Integer.MAX_VALUE;
            for (int i = 0; i < n * 2; i++) {
                if(i < n){a[i] = s.nextInt();   minA = Math.min(a[i], minA);}
                else{   b[i-n] = s.nextInt();   minB = Math.min(b[i-n], minB);}
            }
            for (int j = 0; j < n; j++) {
                dif1 = a[j] - minA; dif2 = b[j] - minB;
                step += Math.max(dif1, dif2);
            }
            System.out.println(step);
            count++;
        }
    }    
}

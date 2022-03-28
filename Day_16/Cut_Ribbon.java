import java.util.Scanner;
import java.util.Arrays;
public class Cut_Ribbon{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] ar = new int[3];
        int n = s.nextInt(),ans = 0;
        ar[0] = s.nextInt();    ar[1] = s.nextInt();    ar[2] = s.nextInt();
        Arrays.sort(ar);    int a = ar[0], b = ar[1], c = ar[2];
        for (int i = 0; i <= n; i+=c) {
            for (int j = 0; j <= n-i; j+=b) {
                float x = (float)(n - (i+j))/(float)a;
                if(Math.floor(x) == Math.ceil(x)){
                    //System.out.println(Math.floor(x) +" : "+ Math.ceil(x));
                    //System.out.println((int)x+" i : "+i+" j: "+j);
                    int y = j / b;  int z  = i / c;
                    //ans = (int)Math.max(ans, x+y+(int)z);
                    int temp = (int)x+y+z;
                    if(temp >= ans){
                        ans = temp;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

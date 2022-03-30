import java.util.Scanner;
public class Learn_From_Math {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int limit = (int)1e6+1;
        int[] ar = new int[limit];
        ar[2] = 1;
        for (int i = 3; i < limit; i+=2) {
            ar[i] = 1;
        }
        for (int i = 3; i < limit; i+=2) {
            if(ar[i] == 1){
                for (int j = 2 * i; j < limit; j +=i) {
                    ar[j] = 0;
                }
            }
        }
        int num = s.nextInt(),temp;
        for (int i = 4; i <= num; i++) {
            if(ar[i]==0){
                temp = num - i;
                if(ar[temp] == 0){
                    System.out.println(i+" "+temp);
                    break;
                }
            }
        }
    }    
}

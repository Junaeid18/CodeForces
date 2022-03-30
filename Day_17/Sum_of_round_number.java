import java.util.Scanner;
public class Sum_of_round_number {
    public static int[] modar = {10,100,1000,10000};
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] res = new int[5];
        int count = 0,num, test = s.nextInt();
        while(count < test){
            num = s.nextInt();  int rem,rem1; rem = rem1 = num; int length = 0;
            while(rem != 0){
                rem = doTheMath(rem);
                res[length] = rem1-rem; rem1 -= res[length];    length++;
            }
            System.out.println(length);
            for (int i = 0; i < length; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            count++;
        }
    }
    public static int doTheMath(int num){
        String numS = String.valueOf(num); int size = numS.length(), rem;
        if(size == 1){
            rem = 0;
        }else if(size == 2){
            rem = num% modar[0];
        }else if(size == 3){
            rem = num% modar[1];
        }else if(size == 4){
            rem = num% modar[2];
        }else{
            rem = num% modar[3];
        }
        return rem;
    }
}

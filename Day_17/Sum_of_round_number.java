import java.util.Scanner;

import javax.swing.text.html.FormView;
public class Sum_of_round_number {
    public static int[] modar = {10,100,1000,10000};
    int length;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0,num, test = s.nextInt();
        while(count < test){
            num = s.nextInt();  int rem = 1;
            while(rem != 0){
                rem = doTheMath(num);
            }
            ++count;
        }
    }
    public static int doTheMath(int num){
        String numS = String.valueOf(num); int size = numS.length(), rem;
        if(size == 2){
            rem = num% modar[0];
        }else if(size == 3){
            rem = num% modar[1];
        }else if(size == 4){
            rem = num% modar[2];
        }else{
            rem = num% modar[3];
        }
        return 0;
    }
}

package Day_12;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ar = new int[3];
        int res = 0;
        for (int i = 0; i <3 ; i++) {
            ar[i] = s.nextInt();
        }
        if((ar[0]==1 && ar[1]==1 && ar[2]==1)||(ar[0] == 1 && ar[2] == 1)){
            res = ar[0]+ ar[1] + ar[2];
            System.out.println(res);
        }else if(ar[0] == 1){
            res = (ar[0]+ar[1])*ar[2];
            System.out.println(res);
        }else if(ar[2] == 1){
            res = ar[0]*(ar[1]+ar[2]);
            System.out.println(res);
        }else if (ar[1]== 1){
            if (ar[0] > ar[2]){
                res = (ar[1]+ar[2]) * ar[0];
                System.out.println(res);
            }else {
                res = (ar[0]+ar[1])*ar[2];
                System.out.println(res);
            }
        }else{
            res = ar[0]*ar[1]*ar[2];
            System.out.println(res);
        }
    }
}

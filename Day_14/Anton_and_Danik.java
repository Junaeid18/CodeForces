package Day_14;

import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        String in = s.next();
        int a=0,d=0,i=0;
        while(i < j ){
            if(in.charAt(i) == 'A'){
                a++;
            }else d++;
            i++;
        }
        if(a>d){
            System.out.println("Anton");
        }else if(d>a){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}

import java.util.Scanner;
public class Buy_A_Shovel {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int shovelPrice = s.nextInt(), rCoin = s.nextInt(), i = 1, rem = 1, res = 0;
        while(rem != 0){
            if((shovelPrice * i) % 10 == 0){
                rem = 0;    res = i; 
            }else{
                rem = (shovelPrice * i) % 10;
                //System.out.println(rem);        
                if(rem == rCoin){
                    rem = 0;    res = i;
                }
            }
            ++i;
        }
        System.out.println(res);
    }
}

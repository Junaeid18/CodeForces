import java.util.Scanner;
public class GivenLengthAndSumOfDigit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt(), sum = s.nextInt(), rem = sum, len = m, count = 0;
        String res = "";    StringBuilder revRes = new StringBuilder();
        if(m < sum){
            while(count < m){
                if(rem > 9){
                    res += "9"; rem -= 9;   --len;
                }else{
                    if(len > 0){
                        int nextDigit = rem - len + 1; res += String.valueOf(nextDigit);  rem -= nextDigit;  --len;
                    }
                }
                count++;
            }
            revRes.append(res).reverse();
            System.out.println(revRes+" "+res);
        }else{
            System.out.println(-1 +" "+ -1);
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class GivenLengthAndSumOfDigit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int m = s.nextInt(), sum = s.nextInt(), rem = sum, len = m, count = 0;
        String res = "",res2 = "";    StringBuilder revRes = new StringBuilder();
        if(sum == 0){
            System.out.println(-1 +" "+ -1);
        }else if(m < sum){
            list.clear();
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
            for (int i = 0; i < m; i++) {
                list.add(Character.getNumericValue(res.charAt(i)));
            }
            Collections.sort(list,Collections.reverseOrder());
            for (int i = 0; i < m; i++) {
                res2 += list.get(i);
            }
            revRes.append(res).reverse();
            System.out.println(revRes+" "+res2);
        }else{
            while(count < m){
                if(rem > 9){
                    res += "9"; rem -= 9;   --len;
                }else{
                    if(len > 0){
                        int nextDigit = rem; res += String.valueOf(nextDigit);  rem -= nextDigit;  --len;
                    }
                }
                count++;
            }
            System.out.println(res+" "+res);
        }
    }
}

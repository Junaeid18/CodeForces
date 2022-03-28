import java.util.Scanner;
import java.util.ArrayList;
public class XY_Sequence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<Long>();
        int t = s.nextInt(), count = 0, n, innerCount;
        long sum = 0,  B, x, y,term1,term2;
        while(count < t){
            n = s.nextInt(); B = s.nextLong(); x = s.nextLong(); y = s.nextLong();
            System.out.println("n : "+n+" B : "+B+" x : "+x+" y : "+y);
            innerCount = 1; term1 = x; term2 = -y;
            while(innerCount <= n){
                if( (term1 > term2) && (term1  <= B) ){
                    //sum += term1;
                    list.add(term1);
                    term1 = term1 + x;
                    //System.out.println("sum : "+sum+" term1 : "+term1);
                }
                else{
                    //sum += term2;
                    list.add(term2);
                    term2 = term2 - y;
                    //System.out.println("sum : "+sum+" term2 : "+term2);
                }
                if(term1+term2 <= B &&( (term1+term2 > term1) || (term1+term2 > term2) ) ){
                    if(term1 == (list.get(list.size()-1))-x){
                        list.add(term1);
                    }else{
                        list.add(term2);
                    }
                    sum = (term1+term2);
                    list.add(sum);
                    term1 = term2 = sum;
                    //System.out.println("Inner term1 : "+term1+" term2 : "+term2);
                } 
                ++innerCount;
                System.out.println("term1 : "+term1+" term2 : "+term2+" sum : "+sum);
            }
            ++count;
        }
        sum = 0;
        for (Long long1 : list) {
            System.out.print(long1+" ");
            sum += long1;
        }
        //output = (sum1 > sum2)? sum1 : sum2;
        System.out.println(sum);
    }    
}

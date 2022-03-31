import java.util.Scanner;
public class Balanced_Array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, test = s.nextInt();
        long num,sum1,sum2;
        while(count < test){
            num = s.nextLong();
            if(num %2 == 0){
                if((num/2)%2 == 0){
                    sum1 = sum2 = 0;
                    String out = "";
                    for (long i = 2; i <= num; i += 2) {
                        sum1 += i;
                        out += i+" ";
                    }
                    if((num/2) < 4 ){
                        out +="1 5";
                    }else{
                        for (long j = 1; j < num-1; j+=2) {
                            sum2 += j;
                            out +=j+" ";
                        }
                        long l = sum1-sum2; out += l;
                    }
                    System.out.println("YES");
                    System.out.println(out);
                }else{
                    System.out.println("NO");    
                }
            }else{
                System.out.println("NO");
            }
            count++;
        }
    }    
}

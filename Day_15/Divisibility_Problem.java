import java.util.Scanner;
public class Divisibility_Problem {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int test_case = s.nextInt(),num1, num2,count = 0;
        while(count < test_case){
            num1 = s.nextInt(); num2 = s.nextInt();
            if(num1 > num2){
                if(num1 % num2 == 0){
                    System.out.println(0);
                }else{
                    int n = num1 / num2;
                    n = num2 * (n+1);
                    n = n - num1;
                    System.out.println(n);
                }
            }else if(num1 < num2){
                int n = num2 - num1;
                System.out.println(n);
            }else{
                System.out.println(0);
            }
            ++count;
        }
    }
}

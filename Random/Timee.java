import java.util.Scanner;
public class Timee {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        double main = 6000, main1 = 4000, rate = 0.157,profit = 0; 
        int day = 30;
        for (int i = 0; i < day; i++) {
            profit = ((main * rate) / 100) * 23;
            main += profit;
            System.out.println("Profit : "+ profit);
            System.out.println("Here is my amount : " + main);    
        }
        System.out.println("After 28 : " + main);
    }    
}

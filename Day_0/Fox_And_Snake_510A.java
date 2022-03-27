import java.util.Scanner;

public class Fox_And_Snake_510A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt(),i=1;
        while(n>0){
            if(n%2 != 0){
                for (int j = 0; j < m ; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }else{
                if(i%2 != 0){
                    for (int j = 0; j < (m-1); j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                    System.out.println();
                }else{
                    System.out.print("#");
                    for (int j = 0; j < (m-1); j++) {
                        System.out.print(".");
                    }
                    System.out.println();
                }i++;
            }n--;
        }
    }
}

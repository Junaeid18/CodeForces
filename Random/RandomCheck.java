import java.util.ArrayList;
import java.util.Scanner;
public class RandomCheck {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<Integer>();       
        list.add(2); list.add(2); list.add(1); list.add(4); list.add(1); list.add(1);
        for (int i = 0; i < 6; i++) {
            int index = list.indexOf(1);
            System.out.println("Time - "+i+ " index : " +index);
        }
    }
}

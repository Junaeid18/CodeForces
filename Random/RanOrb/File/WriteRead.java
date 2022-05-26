import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class WriteRead {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("output.txt"));    
            String input;
            for (int i = 0; i < 3; i++) {
                input = s.nextLine();   bf.write(input+"\n");
            }   bf.close();
        } catch (Exception e) {
            System.out.println("Caught");
        }
        System.out.println("Time to Read from file :- ");
        try {
            BufferedReader bf2 = new BufferedReader(new FileReader("output.txt"));
            String output;
            while((output = bf2.readLine()) != null){
                System.out.println(output);
            }       bf2.close();
        } catch (Exception e) {
            System.out.println("Caught");
        }
    }  
}

/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
import java.util.ArrayList;
public class RestorePermutationByMerger {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();
        StringBuilder out = new StringBuilder();
        int count = 0, testCase = s.nextInt(),size,i,inp;    
        while(count < testCase){
            size = s.nextInt(); i = 1; li.clear(); inp = s.nextInt(); li.add(inp); out.append(inp+" ");
            while (i < (2*size)) {
                inp = s.nextInt();
                if(!li.contains(inp)){  li.add(inp); out.append(inp+" ");}    ++i;
            }
            System.out.println(out); out.setLength(0); count++;
        }
    }
}
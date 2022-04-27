/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-23
*/
import java.util.Scanner;
import java.util.ArrayList;
public class FavouriteSequence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0, testCase = s.nextInt(),n,inC,i,j;
        StringBuilder out = new StringBuilder();
        while(count < testCase){
            n = s.nextInt();    inC=0;    while(inC<n){list.add(s.nextInt()); ++inC;}
            if(n%2==0){
                for (i = 0, j = n-1; i < n/2; ++i,--j) {
                    out.append(list.get(i)+" "+list.get(j)+" ");
                }
            }else{
                for (i = 0, j = n-1; i < n/2; ++i,--j) {
                    out.append(list.get(i)+" "+list.get(j)+" ");
                }out.append(list.get(n/2));
            }   System.out.println(out);    out.setLength(0);   list.clear();  ++count;
        }   s.close();    
    }
}

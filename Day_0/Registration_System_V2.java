import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
public class Registration_System_V2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        HashMap<String,Integer> namedb = new HashMap<String,Integer>();
        int count = 0, num = 0;
        num = s.nextInt();
        String name = s.next();
        namedb.put(name,0);
        System.out.println("OK");
        ++count;
        while(count < num){
            name = s.next();
            if(namedb.containsKey(name)){
                int val = namedb.get(name)+1;
                namedb.replace(name,val);
                System.out.println(name+val);
            }else{
                System.out.println("OK");
                namedb.put(name,0);
            }
            ++count;
        }
    }
}
        /* ArrayList<String> namedb = new ArrayList<String>();
        int count = 0, num = 0;
        num = s.nextInt();
        String name = s.next();
        namedb.add(name);
        System.out.println("OK");
        ++count;
        while(count < num){
            name = s.next();
            if(namedb.contains(name)){
                int occurance = Collections.frequency(namedb,name);
                System.out.println(name+occurance);
            }else{
                System.out.println("OK");
            }
            namedb.add(name);
            ++count;
        } */


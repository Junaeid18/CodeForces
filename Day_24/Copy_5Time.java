 /*
     Junaeid As Jknight
     Somoy paile dekha koiro
     alap-adda-gopposob hobe
     cha or coffee er sathe.
 ------<<<<<<*>>>>>>>>-----
 D-24
 */
 import java.util.Scanner;
 import java.util.HashSet;
 public class Copy_5Time {
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         HashSet<Integer> set = new HashSet<>();
         int testCase = s.nextInt(), n; 
         while(testCase-- >= 1){
             n = s.nextInt();    set.clear();
             while(n-- >= 1){
                 set.add(s.nextInt());
                }
                System.out.println(set.size());
            }
        }
    }
    

    
    //ArrayList<Integer> list = new ArrayList<>();
    //list.clear();   list.add(s.nextInt());
    /* num = s.nextInt();
    if(!(list.contains(num))){
        list.add(num);
       } */
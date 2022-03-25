/**
 * Registration_System
 */
import java.util.regex.*;

import javax.swing.SingleSelectionModel;

import java.util.*;
public class Registration_System {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        List<String> name = new ArrayList<String>();
        int count = 0,num;
        String var;
        name.add("junaeid");
        name.add("junaeir");
        name.add("nipa");
        name.add("junipa");
        name.add("kohinoor");
        name.add("noor");
        name.add("junaeid1");
        name.add("junaeid2");
        name.add("junaeid10");
        name.add("junaeid11");
        name.add("junaeida1");
        name.add("junaeida2");
        Pattern p = Pattern.compile("junaeid\\d.*");
        num = name.size();
        Matcher m = null;
        boolean b = false;
        for (int i = 0; i < num; i++) {
            m = p.matcher(name.get(i));
            b = m.matches();
            if(b){
                System.out.println("found : "+name.get(i));
            }
            
        }
    }
} 
/* while(count < 5){
    var = s.next();
    name.add(var);
    ++count;
}
for (String string : name) {
    System.out.println(name);
}
System.out.println(name.get(4)); */
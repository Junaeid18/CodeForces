/**
 * Registration_System
 */
import java.util.regex.*;
import javax.swing.SingleSelectionModel;
import java.util.*;
public class Registration_System {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        List<String> namedb = new ArrayList<String>();
        Pattern p= null,p1= null;
        Matcher m= null,m1= null;
        boolean b = false,b1 = false;
        int count = 0,num = 0,size = 0;
        String name;
        num = s.nextInt();
        namedb.add(s.next());
        System.out.println("OK");
        ++count;
        while(count < num){
            int found = 0;
            name = s.next();
            p = Pattern.compile(name);
            p1 = Pattern.compile(name+"\\d.*");
            size = namedb.size();
            for (int i = 0; i < size; i++) {
                m = p.matcher(namedb.get(i));
                m1 = p1.matcher(namedb.get(i));
                b = m.matches();
                b1 = m1.matches();
                if(b || b1){
                    ++found;
                }
            }
            if(found > 0){
                if(found < 2){
                    String sn = name+1;
                    namedb.add(sn);
                    System.out.println(sn);
                }else{
                    int n = found;
                    String sn = name+n;
                    namedb.add(sn);
                    System.out.println(sn);
                }
            }else{
                namedb.add(name);
                System.out.println("OK");
            }
            ++count;
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
/* int count = 0,num;
String var, search="junaeid";
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
Pattern p = Pattern.compile(search+"\\d.*");
num = name.size();
Matcher m = null;
boolean b = false;
for (int i = 0; i < num; i++) {
    m = p.matcher(name.get(i));
    b = m.matches();
    if(b){
        System.out.println("found : "+name.get(i));
    }
    
} */
import java.util.Scanner;
abstract class Employee{
    final int id = 1;
    abstract void designation();
}
class developer extends Employee{
    void doit(){
        System.out.println("done");
    }
    protected void designation(){
        System.out.println("Senior Developer");
    }
}
public class Abstract {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        developer d = new developer();
        d.doit();
        System.out.println(d.id);
        d.designation();
    }  
}

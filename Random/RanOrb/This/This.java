import java.util.Scanner;
class Human{
    protected String name;
    protected int age;
    public Human(){
        this("Junaeid",20);
    }
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
}
public class This {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        Human h = new Human();
        System.out.println(h.name + " "+h.age);
        h = new Human("Faruk",30);
        System.out.println(h.name+" "+h.age);
    }
}

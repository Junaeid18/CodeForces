import java.util.Scanner;
interface Father{
    void Show();
}
interface Animal extends Father{
    void name();
    void age();
    void origin();
}
interface Bangali{
    void area();
    default void msg(){
        System.out.println("OK, default msg is implemented");
    }
}
class Human implements Animal,Bangali{
    public void Show(){
        System.out.println("Show from father is implemneted through Animal");
    }
    public void name(){
        System.out.println("Here is name form Animal");
    }
    public void age(){
        System.out.println("Age from the Animal");
    }
    public void origin(){
        System.out.println("Done with origin");
    }
    public void area(){
        System.out.println("Brother is from planet Earth");
    }
    static int squares(int a){
        return a*a;
    }
}
public class Interface {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        Human h = new Human();
        h.name();
        h.age();
        h.Show();
        h.origin();
        h.area();
        System.out.println("Here Comes the special One's :-  ");
        h.msg();    int a = h.squares(10);  System.out.println(a);
    }
}

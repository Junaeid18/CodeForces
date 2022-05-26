import java.util.Scanner;
class Student{
    void Type(){
        System.out.println("He is a Student");
    }
    void Type(int a){
        String result = (a > 1)? "University":"School";
        System.out.println("He is a "+result+" Student");
    }    
}
class AustStudent extends Student{
    void Type(){
        System.out.println("He is Aust Student");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        Student st = new Student();
        st.Type();  st.Type(4);
        System.out.println("-------------------");
        AustStudent as = new AustStudent();
        as.Type();  as.Type(2);
    }   
}

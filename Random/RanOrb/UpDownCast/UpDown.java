import java.util.Scanner;
class Student{
    void info(){
        System.out.println("I am a Student.");
    }
}
class AustStudent extends Student{
    void info(){
        System.out.println("I am a Aust Graduate.");
    }
    void furtherInfo(){
        System.out.println("I was a CSE Student and Love coding.");
    }
}
class NsuStudent extends Student{
    void info(){
        System.out.println("I am a NSU Graduate.");
    }
    void furtherInfo(){
        System.out.println("I was a BBA Student and Love Marketing.");
    }
}
public class UpDown {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        Student st = new NsuStudent();
        Upcasting(st);

        AustStudent as = new AustStudent();
        Downcasting(as);
    } 
    public static void Upcasting(Student student){
        student.info();
    }
    public static void Downcasting(Student student){
        if(student instanceof AustStudent){
            AustStudent aus = (AustStudent)student;
            aus.info();
            aus.furtherInfo();
        }else if(student instanceof NsuStudent){
            NsuStudent nsu = (NsuStudent)student;
            nsu.info();
            nsu.furtherInfo();
        }else student.info();
    }
}

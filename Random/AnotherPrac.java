import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class AnotherPrac {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        /* for (; ; ) {
            System.out.println("Infinite Loop"); 
        } */
        /* try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
            String text = s.nextLine();
            writer.write(text);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("out.txt"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (Exception e) {
            //TODO: handle exception
        } */


        Junaeid j = new Junaeid();
        j.name = "Nipa";    j.age = 20;
        try {
             FileOutputStream f = new FileOutputStream("out.txt");
             ObjectOutputStream o = new ObjectOutputStream(f);
             o.writeObject(j);
             o.close();
             f.close();
             System.out.println("done");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Junaeid j2 = null;
        try {
            FileInputStream f2 = new FileInputStream("out.txt");
            ObjectInputStream o2 = new ObjectInputStream(f2);
            j2 = (Junaeid) o2.readObject();
            o2.close();
            f2.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        finally{
            System.out.println(j2.name+ " "+j2.age);
        }


    }
}

class Junaeid implements Serializable{
    String name;
    int age;
}

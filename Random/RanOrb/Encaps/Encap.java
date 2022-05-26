import java.util.Scanner;
public class Encap {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        Bank b = new Bank();
        b.setId(5);
        b.setEmail("k@mail.com");    
        b.setName("Hero");  
        System.out.println(b.getemail()+" "+b.getBalance());
        b.setBalance(200);
        System.out.println(b.getemail()+" "+b.getBalance());
    }  
}

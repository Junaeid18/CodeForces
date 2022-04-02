import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class Spy_Delected {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt(), doing = 0;
        while(doing < testCase){
            int element = s.nextInt(), input1 = s.nextInt(),    count = 1;
            boolean done = false;
            while(count <= element){
                int index1 = count, input2 = 0 , index2 = 0;
                input2 = s.nextInt(); 
                if(!done){
                    ++count;  index2 = count;
                    if(input1 == input2){
                        while(input1 == input2){
                            input2 = s.nextInt();   ++count;
                        }
                        System.out.println(count);  done = true;
                    }else{
                        int input3  = s.nextInt(); ++count;
                        if(input3 == input1) {System.out.println(index2);}
                        else {System.out.println(index1);} done = true;
                    }    
                }   ++count;
            }   ++doing;
        } 
    }
}

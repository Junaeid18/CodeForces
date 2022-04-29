/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-23
*/
import java.util.Scanner;
public class ConstructTheString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),n,a,b,inC;
        char c; StringBuilder out = new StringBuilder();  
        while(count < testCase){
            n = s.nextInt();    a = s.nextInt();    b = s.nextInt();    inC = 0;    c = 'a';
            for (int i = 0; i < (n/a); i++) {
                for (int j = 0; j < (a/b); j++) {
                    while(inC<b){   out.append(c++); ++inC;}  inC=0;    c = 'a';
                }
            }   int rem = n - out.length();
            if(rem > 0){
                for (int i = 0; i < (rem/b); i++) {
                    while(inC < b){out.append(c++); ++inC;}  inC=0;    c = 'a';
                }   
            }   rem =   n - out.length();
            if(rem > 0){
                while(inC<rem){out.append(c++); ++inC;}
            }
            System.out.println(out);    out.setLength(0);   ++count;            
        }   s.close();
    }
}

/* for (int i = 0; i < (n/a); i++) {
    while(bCount < b){ out.append(c++); ++bCount; ++inC;}   bCount = 0;    
}   int rem = n - (n/a)*b;  remC = --c;   c='a';
if(b != 1){
    for (int i = 0; i < rem; i++) {
        out.append(c++);    ++inC;  if(c==remC){c='a';}
    }
}
while(inC < n){ out.append(c);  ++inC;}
/* while(inC < a){ out.append(c);  ++inC;} */



/* 
            for (int i = 0; i < (n/b); i++) {
                while(bCount < b){ out.append(c++); ++bCount; ++inC;}   bCount = 0;    
            }int rem = n - (n/b)*b;  remC = --c;   c='a';
            if(b != 1){
                for (int i = 0; i < rem; i++) {
                    out.append(c++);    ++inC;  if(c==remC){c='a';}
                }
            }
            while(inC < n){ out.append(c);  ++inC;}
            System.out.println(out);    out.setLength(0);   ++count; 


*/
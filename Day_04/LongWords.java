/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day_04;

import java.util.Scanner;

/**
 *
 * @author JuNaEiD
 */
public class LongWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] ar = new String[n];
        int count = 0;
        int c = 0;
        int pro=0;
        while(count < n){
            String a = s.next();
            int num1 = a.length();
            for (int i = 0; i < num1; i++) {
                char com = a.charAt(i);
                if(com >= 'a' & com <= 'z') pro = 1;
                else{
                    pro = 0;
                    break;
                }
            }
            if(pro == 1){
            if(a.length() >= 1 && a.length() <= 100){
                ar[count] = a;
                count++;
            }else{}
        }}
        while(c < n){
            String b = ar[c];
            if(b.length() > 10){
                int num = b.length()-2;
                char d = b.charAt(0);
                char e = b.charAt(num+1);
                String wo = new StringBuilder().append(d).append(num).append(e).toString();
                System.out.println(wo);
                c++;
            }
            else{
                String f = ar[c];
                System.out.println(f);
                c++;
            }
        }
    }
}

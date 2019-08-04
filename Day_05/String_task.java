/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day_05;

import java.util.Scanner;

/**
 *
 * @author JuNaEiD
 */
public class String_task {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        String out = null,o;
        int c = input.length();
        input = input.toLowerCase();
        for (int i = 0; i < c; i++) {
            char a = input.charAt(i);
            if((a != 'a')&& (a != 'e')&& (a != 'i')&&(a != 'o')&&(a != 'u')&&(a != 'y')){
                String n = ".";
                String con = Character.toString(a);
                o = n.concat(con);
                if(out == null){
                   out = n.concat(con);
                }else{
                    out = out.concat(o);
                }
            }
        }
        System.out.println(out);
    }
}

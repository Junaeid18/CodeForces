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
public class Next_Round {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,k,count=0,turn=0;
        n = s.nextInt();
        k = s.nextInt();
        while(n < k && k < 1 && n > 100){
            n = s.nextInt();
            k = s.nextInt();
        }
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        int c = ar[k-1];
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] >= c && ar[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }    
}

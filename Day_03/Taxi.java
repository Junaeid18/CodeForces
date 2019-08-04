/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day_03;

import java.util.Scanner;

/**
 *
 * @author JuNaEiD
 */
public class Taxi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = s.nextInt();
        int ar[] = new int[g];
        int ar2[] = new int[g];
        for (int i = 0; i < g; i++) {
            ar[i] = s.nextInt();
            ar2[i] = 4;
        }
        int count = 0;
        for (int i = 0; i < g; i++) {
            int x = ar[i];
            if(x <= 4){
                int a = chk(ar2,x);
                ar2[a] -= x;
            }
        }
        for (int i = 0; i < ar2.length; i++) {
            if(ar2[i] < 4){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int chk(int ar2[],int x){
        int g = ar2.length;
        int j = 0;
        for (int i = 0; i < g; i++) {
            if(x <= ar2[i]){
                j = i;
                break;
            }
        }
        return j;
    }
}

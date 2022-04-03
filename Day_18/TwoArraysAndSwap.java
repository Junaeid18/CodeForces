import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class TwoArraysAndSwap {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0,minA,maxB,sumA, n = s.nextInt();   sumA = minA = maxB = 0;
        Integer[] a = new Integer[n];   Integer[] b = new Integer[n];
        while(count < n) { a[count] = s.nextInt(); sumA += a[count];  if(minA < a[count]){minA = a[count];} ++count;}   count = 0;
        while(count < n) { b[count] = s.nextInt(); if(maxB < b[count]){maxB = b[count];} ++count;}
        Arrays.sort(a); Arrays.sort(b , Collections.reverseOrder());
        
    }    
}

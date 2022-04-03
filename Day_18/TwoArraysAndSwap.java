import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class TwoArraysAndSwap {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int doing = 0,count = 0,minA,maxB,redA,addA,sumA,max,min,testCase = s.nextInt();
        while(doing < testCase){
            int n = s.nextInt(), k = s.nextInt();   count = sumA = redA = addA = 0;
            Integer[] a = new Integer[n];   Integer[] b = new Integer[n];
            minA = a[count] = s.nextInt(); sumA += a[count]; ++count;
            while(count < n) { a[count] = s.nextInt(); sumA += a[count];  if(minA > a[count]){minA = a[count];} ++count;}   count = 0;
            maxB = b[count] = s.nextInt(); ++count;
            while(count < n) { b[count] = s.nextInt(); if(maxB < b[count]){maxB = b[count];} ++count;}
            Arrays.sort(a); Arrays.sort(b , Collections.reverseOrder());    count = 0;
            while(minA < maxB && count < k){
                max = Math.max(a[count], b[count]); min = Math.min(a[count], b[count]);   redA += min; addA += max;
                //System.out.println("redA : "+redA+" addA : "+addA);
                if(count+1 < n) {count++;}    
                else {break;}    
                minA = a[count]; maxB = b[count];
            }
            //System.out.println("SumA: "+sumA+" redA : "+redA+" addA : "+addA);
            sumA = (sumA - redA) + addA;
            System.out.println(sumA);
            doing++;
        }
    }    
}

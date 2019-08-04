
package Day_02;

import java.util.Scanner;

public class Theatre_Square {
  public static void main(String[] args)
  {
      Scanner s = new Scanner(System.in);
      long n,m,a,l,k,r;
      n = s.nextInt();
      m = s.nextInt();
      a = s.nextInt();
      if(n%a == 0)
      {
          l = n/a;
      }else
      {
          l = n/a;
          l++;
      }
      if(m%a == 0)
      {
          k = m/a;
      }else
      {
          k = m/a;
          k++;
      }
      
      r = l * k;
      System.out.println(r);
  }
}

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
public class Taxi2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = s.nextInt();
        int one = 0,two = 0,three = 0,four = 0;
        for (int i = 0; i < g; i++) {
            int x = s.nextInt();
            if(x == 1){
                one++;
            }else if(x == 2){
                two++;
            }else if(x == 3){
                three++;
            }else if(x == 4){
                four++;
            }
        }
        int count = 0;
        if(four > 0)
        {
            count = four;
        }
        while(true){
            boolean com = chk(three,one);
            if(com){
                three--;
                one--;
                count++;
            }else break;
        }
        while(true){
            boolean com2 = chk2(two);
            if(com2){
                two -= 2;
                count++;
            }else break;
        }
        while(true){
            boolean com3 = chk3(two,one);
            if(com3){
                two--;
                one -= 2;
                count++;
            }else break;
        }
        while(true){
            boolean com4 = chk4(two,one);
            if(com4){
                two--;
                one--;
                count++;
            }else break;
        }
        if(two > 0){
            count += two;
        }
        if(three > 0){
            count += three;
        }
        if(one > 0){
            if(one/4 == 0){
                count++;
            }else if(one/4 >= 1){
                    int x = one / 4;
                    count += x;
                    one -= (x*4);
                    if(one > 0){
                        count++;   
                    }
            }
        }
        System.out.println(count);
    }
    public static boolean chk(int three,int one){
        if(three > 0 && one > 0){
            return true;
        }else return false;
    }
    public static boolean chk2(int two){
        if(two >= 2){
            return true;
        }else return false;
    }
    public static boolean chk3(int two,int one){
        if(two > 0 && one > 1){
            return true;
        }else return false;
    }
    public static boolean chk4(int two,int one){
        if(two > 0 && one > 0){
            return true;
        }else return false;
    }
}

import java.util.Scanner;
public class Even_Array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, arrSize, inCount, num, evenC, oddC, testCase = s.nextInt();
        while(count < testCase){
            arrSize = s.nextInt();  inCount = 0; oddC = evenC = 0;
            while(inCount < arrSize){
                num = s.nextInt();
                if(inCount%2 == 0){
                    if(num%2 != 0){ oddC++;}
                }else{
                    if(num%2 == 0){ evenC++;}
                }
                inCount++;
            } 
            if(oddC != evenC){System.out.println(-1);}
            else{System.out.println(oddC);}
            count++;
        }
    }
}


//step += Math.max(inCount-i, i-inCount); i += 2;
//step += Math.max(inCount-j, j-inCount); j += 2;
//System.out.println("Step : "+step);


/* 
    int count = 0,arrSize,inCount,num,i,j,evenC,oddC,step, testCase = s.nextInt();
        while(count < testCase){
            arrSize = s.nextInt(); inCount = step = evenC = oddC = 0; i = 0 ; j = 1; 
            while(inCount < arrSize){
                num = s.nextInt();  
                if(num % 2 == 0){   evenC++;
                    if(inCount% 2 != 0){
                        if(Math.max(inCount-i, i-inCount) > 0){ step++; i += 2;}
                    }
                }else{  oddC++;
                    if(inCount%2 == 0){     
                        if(Math.max(inCount-j, j-inCount) > 0){ step++; j += 2;}
                    }
                }
                inCount++;
            }
            if(arrSize%2==0){if((j-i == 1) && (evenC%2 == 0)){System.out.println(step/2);}  else{System.out.println(-1);}}
            else{
                if(((j-i == 1) || (i-j == 1 )) && (oddC%2 != 0) ){
                    System.out.println(step/2);
                }else{  System.out.println(-1);}
            }
            count++;
        }


*/
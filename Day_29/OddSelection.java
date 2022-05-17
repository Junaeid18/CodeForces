/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-29
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class OddSelection {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
    public static void main(String[] args){
        try {
            FastReader s = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = s.nextInt(),n,x,odd,even,i,num;
            while(testCases-- > 0){
                n = s.nextInt();    x = s.nextInt();    i = even = odd = 0;
                while(i < n){
                    if(s.nextInt()%2 == 0)++even; else ++odd;   ++i;
                }
                if(odd > 0){
                    if(n == x && odd%2 != 0 && even%2 != 0)out.println("Yes");
                    else{
                        if(x%2 == 0){
                            if(even > 0){
                                num = (odd%2 == 0)? odd-1+even : odd+even;
                                if(num >= x)out.println("Yes");
                                else out.println("No");    
                            }else out.println("No");
                        }else{
                            num = (odd%2 == 0)? odd-1+even : odd+even;
                            if(num >= x)out.println("Yes");
                            else out.println("No");       
                        }
                    }
                }else out.println("No");
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

    /* if(odd%2==0){
        if(odd-1+even >= x)out.println("Yes");
        else out.println("No");
    }else{
        if(odd+even >= x)out.println("Yes");
        else out.println("No"); 
    } */
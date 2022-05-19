/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-30 Problem - 1360C
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.Math.abs;
public class SimilarPairs {
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
            ArrayList<Integer> dummyList1 = new ArrayList<>(); 
            int testCases = s.nextInt(),n,i,ar[],even,odd;
            boolean status;
            while(testCases-- > 0){
                n = s.nextInt();  ar = new int[n];  i = even = odd = 0; status = true;  dummyList1.clear();
                while(i < n){
                    ar[i] = s.nextInt();
                    if(ar[i]%2 == 0)++even; else ++odd; 
                    ++i;
                }
                if(even%2 == 0)out.println("YES");
                else{
                    Arrays.sort(ar);  
                    for (int j = 0; j < ar.length; j+=2) {
                        if((ar[j]+ar[j+1])%2 != 0){
                            dummyList1.add(ar[j]);  dummyList1.add(ar[j+1]);  
                        }
                    }
                    if(dummyList1.size() > 0){
                        for (int j = 0; j < dummyList1.size(); j+=2) {
                            if(abs(dummyList1.get(j) - dummyList1.get(j+1)) != 1){
                                status = false;  break;
                            }
                        }
                        if(status)out.println("YES"); else out.println("NO");
                    }else out.println("YES");
                }
            }   
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

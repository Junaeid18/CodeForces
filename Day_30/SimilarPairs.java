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
            int testCases = s.nextInt(),n,i,ar[],even,odd;
            boolean status;
            while(testCases-- > 0){
                n = s.nextInt();  ar = new int[n];  i = even = odd = 0; status = false;
                while(i < n){
                    ar[i] = s.nextInt();
                    if(ar[i]%2 == 0)++even; else ++odd; 
                    ++i;
                }
                if(even%2 == 0)out.println("YES");
                else{
                    Arrays.sort(ar);
                    for (int j = 0; j < ar.length-1; j++) {
                        if((ar[j]%2 != ar[j+1]%2) && abs(ar[j]-ar[j+1]) == 1){
                            status = true; break;
                        }
                    }
                    if(status)out.println("YES");   else out.println("NO");
                }
            }   
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}



        /* for (k = 0; k < ar.length - 1; ++k) {
            if(abs(ar[k] - ar[k+1]) == 1)++k;
            else{
                dummyList.add(ar[k]);
            }
        }   if(k == (n-1))dummyList.add(ar[n-1]);
        if(dummyList.size() > 0){
            for (int j = 0; j < dummyList.size(); j+=2) {
                if((dummyList.get(j)+dummyList.get(j+1))%2 != 0){
                    dummyList1.add(dummyList.get(j));  dummyList1.add(dummyList.get(j+1));  
                }
            }
            if(dummyList1.size() > 0){
                for (int j = 0; j < dummyList1.size(); j++) {
                    if(dummyList1.get(j)%2 == 0)++e;    else ++o;
                }
                max = max(e,o);
                if(max%2 == 0)out.println("YES");
                else out.println("NO");
            }else out.println("YES");
        }else out.println("YES"); */
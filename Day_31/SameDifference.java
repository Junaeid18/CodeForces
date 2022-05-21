/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-31 Problem - 1520D - Same Difference
*/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;
public class SameDifference {
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
            HashMap<Integer,Integer> map = new HashMap<>();
            int testCases = s.nextInt(),n,num,temp; long count;
            while(testCases-- > 0){
                n = s.nextInt();  count = 0l; map.clear();
                for (int i = 0; i < n; i++){
                    num = s.nextInt();     temp = num - i;
                    if(!map.containsKey(temp)){
                        map.put(temp, 1);
                    }else{
                        num = map.get(temp);    ++num;  map.replace(temp, num);
                    }
                }
                if(map.size() == n)out.println(0);
                else{
                    Collection val = map.values();
                    Iterator it = val.iterator();
                    while(it.hasNext()){
                        num = (int)it.next();
                        count += ( (long)num * (num - 1) )/2;
                    }
                    out.println(count);
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

    //Previous Attempt
    /* for (int i = 1; i < n; i++) {
        inCount = 0;
        for (int j = i+1; j <= n; j++) {
            if( ar[i] == ar[j] )++inCount;
        }
        if(inCount == n-i){
            count += ((n-i) * (n-i+1))/2; break;
        }else count += inCount;
    } */
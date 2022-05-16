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
import java.util.Arrays;
public class ReplacingElements {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
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
                str=br.readLine().trim();
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
            StringBuilder output = new StringBuilder();
            FastReader s = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = s.nextInt(),n,ar[],d,i;
            while(testCases-- > 0){
                n = s.nextInt();  d = s.nextInt();  ar = new int[n];  i = 0;
                while(i < n){ ar[i] = s.nextInt(); ++i;} 
                Arrays.sort(ar);
                if(ar[0]+ar[1] <= d)output.append("YES"+"\n");
                else if(ar[n-1] <= d)output.append("YES"+"\n");
                else output.append("NO"+"\n"); 
            }
            System.out.print(output);
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String S = br.readLine(); 
        int N = Integer.parseInt(br.readLine()); 

        while(N --> 0) { 
            st = new StringTokenizer(br.readLine());
            char findChar = st.nextToken().charAt(0); 
            int start = Integer.parseInt(st.nextToken()); 
            int end = Integer.parseInt(st.nextToken()); 

            int count = 0; 

            if(S.indexOf(findChar) >= 0){ 
                for(int i = start; i <= end; i++){
                    if(findChar == S.charAt(i)){ 
                        count++; 
                    }
                }
            }
            bw.write(count+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int N = 0;
		
		while(true){
            if(num%5 == 0) {
                N += num/5;
                break;
            }
            
            num -= 3;
            N++;
            
            if(num < 0) {
                N = -1;
                break;
            }
	    }
		System.out.println(N);
    }
}
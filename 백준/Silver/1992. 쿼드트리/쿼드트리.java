import java.io.*;

public class Main {
	
	static int[][] arr;
	static int N;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		arr= new int[N][N];
		for(int i=0;i<N;i++) {			
			String[] str = br.readLine().split("");
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(str[j]);
			}
		}
		
		quad(0,0,N);
		System.out.println(sb);
	}// main()
	
	static void quad(int startX,int startY,int len) {
		if(check(startX,startY,len)) {
			sb.append(arr[startX][startY]);
			return;
		}
		
		len /=2;
		sb.append("(");
		
		quad(startX,startY,len);
		quad(startX,startY+len,len);
		quad(startX+len,startY,len);
		quad(startX+len,startY+len,len);
		sb.append(")");
		
	}//quad()
	
	public static boolean check(int x, int y,int len){
        for(int i=x;i<x+len;i++){
            for(int j=y;j<y+len;j++){
                if(arr[x][y]!=arr[i][j])    return false;
            }
        }
        return true;
    }	
}
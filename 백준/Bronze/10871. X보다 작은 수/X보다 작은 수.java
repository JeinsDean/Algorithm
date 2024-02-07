import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] tmp = br.readLine().split(" ");
		String[] arr = br.readLine().split(" ");
		br.close();
		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(arr[i]) < Integer.parseInt(tmp[1]))
				sb.append(Integer.parseInt(arr[i])).append(" ");
		}
		System.out.println(sb);
	}
}
package northsoftstudio_exercises;

//2 以上の数値を入力し、素因数分解した結果を表示しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_16 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int x = 2; n > 1; x++) {
			while ((n % x) == 0) {
				System.out.print(x + "");
				n /= x;
			}
		}
	}
}

package northsoftstudio_exercises;

//数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_18 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (;;) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			sum += n;
		}
		System.out.println("合計は" + sum);
	}
}

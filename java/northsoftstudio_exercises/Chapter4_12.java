package northsoftstudio_exercises;

//数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		while (sum <= 100) {
			sum += Integer.parseInt(br.readLine());
		}
		System.out.println("合計は" + sum);
	}
}

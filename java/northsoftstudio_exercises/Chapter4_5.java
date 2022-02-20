package northsoftstudio_exercises;

//整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
//※ 	計算は整数で行い、小数点以下は切り捨ててよい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int x = Integer.parseInt(br.readLine());
			sum += x;
		}
		System.out.println(sum / 10);
	}
}

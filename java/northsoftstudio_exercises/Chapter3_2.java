package northsoftstudio_exercises;

//２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter3_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		if (x > y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}
}

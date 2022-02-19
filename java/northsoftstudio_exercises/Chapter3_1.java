package northsoftstudio_exercises;

//int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter3_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		if (x > y) {
			System.out.println("xはyより大きい。");
		}
	}
}

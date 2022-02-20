package northsoftstudio_exercises;

//サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_20 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			for (int a = 0; a <= i; a++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}

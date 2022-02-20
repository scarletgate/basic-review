package northsoftstudio_exercises;

//個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。
//数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("個数を入力してください。");
		int number = Integer.parseInt(br.readLine());
		for (int i = 0; i < number; i++) {
			System.out.println(i % 10);
		}
	}
}

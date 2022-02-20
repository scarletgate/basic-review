package northsoftstudio_exercises;

//整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("0か1を10回入力してください。");
		int win = 0;
		int lose = 0;
		for (int i = 1; i <= 10; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				lose++;
			} else {
				win++;
			}
		}
		System.out.println("勝ちの総数は" + win + "回です。");
		System.out.println("勝ちの総数は" + lose + "回です。");
	}
}

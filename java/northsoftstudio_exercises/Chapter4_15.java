package northsoftstudio_exercises;

//入力された数が素数かどうかを判定するプログラムを作成しなさい。
//※ 	判定する数は 4 以上としてよい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_15 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int i;
		for (i = 2; i < (number / 2); i++) {
			if (number % i == 0) {
				break;
			}
		}
		if (i > (number / 2)) {
			System.out.println(number + "は素数です。");
		} else {
			System.out.println(number + "は素数ではありません。");
		}
	}
}

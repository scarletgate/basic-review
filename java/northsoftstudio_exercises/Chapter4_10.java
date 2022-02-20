package northsoftstudio_exercises;

//個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapte4_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("個数を入力してください。");
		int number = Integer.parseInt(br.readLine());
		for(int i = 1; i <= number; i++) {
			System.out.println("*");
		}
	}
}

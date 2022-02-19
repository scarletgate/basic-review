package northsoftstudio_exercises;

//正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
//※ 	奇数、偶数の判定には除算の余りを利用する。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter3_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n % 2 == 0) {
			System.out.println("入力された数字は偶数です。");
		} else {
			System.out.println("入力された数字は奇数です。");
		}
	}
}

package northsoftstudio_exercises;

//自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		for (int i = 1; i <= 10;i++) {
			System.out.println("数値を入力してください。");
			int number = Integer.parseInt(br.readLine());
			if (max < number) {
				max = number;
			}
		}
		System.out.println("入力された数値の最大値は" + max + "です。");
	}
}

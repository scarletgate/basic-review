package northsoftstudio_exercises;

//整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int min = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "回目、数値を入力してください。");
			int number = Integer.parseInt(br.readLine());
			if (max < number) {
				max = number;
			} else if (min < number) {
				min = number;
			}
		}
		System.out.println("最大値=" + max);
		System.out.println("最小値=" + min);
	}
}

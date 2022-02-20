package northsoftstudio_exercises;

//数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
//※ 	最後に入力された 0 は平均に含めない。
//※ 	少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_19 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int count = 0;
		for (;;) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			sum += n;
			count++;
		}
		System.out.println("平均値=" + (sum / count));
	}
}

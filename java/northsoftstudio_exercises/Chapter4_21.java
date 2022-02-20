package northsoftstudio_exercises;

//サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_21 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j || (size - i - 1) == j) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}

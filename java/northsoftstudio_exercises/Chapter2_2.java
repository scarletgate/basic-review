package northsoftstudio_exercises;

//int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter2_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt( br.readLine() );
		System.out.println(x);
	}
}

package northsoftstudio_exercises;

//年齢を訊ね、生まれてから現在までの、おおよその日数を表示するプログラムを作成しなさい。
//※ 	日数の計算は閏年等を考慮せず、年齢×365とする。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter2_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("あなたの年齢は？");
		int age = Integer.parseInt(br.readLine());
		System.out.println("生まれてから現在までの日数は" + (age * 365) + "日です。");
	}
}

package northsoftstudio_exercises;

//２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
//※ 	計算は整数で行い、小数点以下は切り捨ててよい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter2_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		System.out.println(x + "と" + y + "の平均値は" + ((x + y)/2));
	}
}

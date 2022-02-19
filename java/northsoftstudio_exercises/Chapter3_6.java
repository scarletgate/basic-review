package northsoftstudio_exercises;

//整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
//“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
//※ 	負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
//※ 	0 は“正の偶数”であるとする。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter3_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n >= 0) {
			if(n % 2 == 0) {
				System.out.println("入力された数字は正の偶数です。");
			} else {
				System.out.println("入力された数字は正の奇数です。");
			}
		}else {
			if(n % 2 == 0) {
				System.out.println("入力された数字は負の偶数です。");
			}else {
				System.out.println("入力された数字は負の偶数です。");
			}
		}
	}
}

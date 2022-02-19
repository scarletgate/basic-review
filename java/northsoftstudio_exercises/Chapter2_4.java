package northsoftstudio_exercises;

//int 型の変数 x、y にそれぞれ数値を入力し、x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter2_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		System.out.println(x + "と" + y + "の和は" + (x + y));
		System.out.println(x + "と" + y + "の差は" + (x - y));
		System.out.println(x + "と" + y + "の積は" + (x * y));
		System.out.println(x + "と" + y + "の商は" + (x / y) + "、余りは" + (x % y));
	}
}

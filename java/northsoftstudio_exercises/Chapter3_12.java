package northsoftstudio_exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter3_12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("好きな寿司を選んでください。");
		System.out.println("1：まぐろ　2：サーモン　3：えび　4：いくら　5：あじ");
		int sushi = Integer.parseInt(br.readLine());
		switch (sushi) {
		case 1:
			System.out.println("今日の運勢は大吉です。");
			break;
		case 2:
			System.out.println("今日の運勢は吉です。");
			break;
		case 3:
			System.out.println("今日の運勢は末吉です。");
			break;
		case 4:
			System.out.println("今日の運勢は凶です。");
			break;
		case 5:
			System.out.println("今日の運勢は大凶です。");
			break;
		default:
			System.out.println("数字を選び直してください。");
		}
	}
}

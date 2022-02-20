package northsoftstudio_exercises;

//九九表（一の段～九の段）を表示するプログラムを作成しなさい。
//※ 	System.out.printfを使用する。System.out.printf(" %2d", x );のように、%2dと記述すると表示が2桁に揃う。

public class Chapter4_17 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int n = 1; n <= 9; n++) {
				System.out.printf("%2d", i * n);
			}
		System.out.println();
		}
	}
}

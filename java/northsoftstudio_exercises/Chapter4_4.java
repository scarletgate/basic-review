package northsoftstudio_exercises;

//7 の階乗を計算し、表示するプログラムを作成しなさい。
public class Chapter4_4 {
	public static void main(String[] args) {
		int x = 1;
		for (int i = 2; i <= 7; i++) {
			x *= i;
			System.out.println(x);
		}
	}
}

package northsoftstudio_exercises;

//int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成しなさい。
//※ 	xとy以外に、もうひとつ変数が必要となる。
public class Chapter1_7 {
	public static void main(String[] args) {
		int x = 3;
		int y = 7;
		int z;
		z = y;
		y = x;
		x = z;
		System.out.println("x=" + x + ",y=" + y);
	}
}

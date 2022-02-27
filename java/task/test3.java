package task;

// 逆数をどんどん足していく
// 整数Nについて、1からNまでの整数の逆数の和を「Nまでの逆数和」と呼ぶことにします。

// 1までの逆数和 = 1/1 = 1
// 2までの逆数和 = 1/1 + 1/2 = 1.5
// 3までの逆数和 = 1/1 + 1/2 + 1/3 = 1.8333333333…
// 4までの逆数和 = 1/1 + 1/2 + 1/3 + 1/4 = 2.0833333333…
// Nまでの逆数和が8を超えるような最小のNを求めてください。
public class test3 {
	public static void main(String[] args) {
		int count = 0;
		double sum = 0;
		while (sum < 8) {
			count++;
			sum += 1.0 / count;
		}
		System.out.println(sum);
		System.out.println(count);
	}
}

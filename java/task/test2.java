package task;

//4乗的ガウス
public class test2 {
	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		while (count <= 99) {
			sum += Math.pow(count, 4);
			count++;
		}
		System.out.println(sum);
	}
}

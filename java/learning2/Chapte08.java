package learning2;

public class Chapte08 {
	public static void main(String[] args) {
		int number1 = 1;
		while (number1 < 5) {
			System.out.println(number1 * number1);
			number1++;
		}

		int array[] = {0, 15, 22, 39};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}

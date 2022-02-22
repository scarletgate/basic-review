package task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvertedPyramid {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for ( int k = 0; k < (number - i) * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

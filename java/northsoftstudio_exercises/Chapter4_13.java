package northsoftstudio_exercises;

//ストライク・カウントを数えるプログラムを作成しなさい。
//１球ごとにストライクかボールかを入力する。
//３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
//※ 	ストライクの場合は1、ボールの場合は2を入力する。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int strike = 0, ball = 0;
		while (strike < 3 && ball < 4) {
			System.out.println("ストライク＝1　or　ボール＝2？");
			int number = Integer.parseInt(br.readLine());
			if (number == 1) {
				strike++;
			} else if (number == 2) {
				ball++;
			}
		}
		System.out.println(ball + "ボール," + strike + "ストライク");
	}
}

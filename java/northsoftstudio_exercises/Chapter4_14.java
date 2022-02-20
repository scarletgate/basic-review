package northsoftstudio_exercises;

//前の問題に次の修正を加えなさい。
//１球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
//ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
//３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter4_14 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int strike = 0, ball = 0;
		while (strike < 3 && ball < 4) {
			System.out.println("ストライク＝1　or　ボール＝2　or　ファウル＝3？");
			int number = Integer.parseInt(br.readLine());
			if (number == 1) {
				strike++;
			} else if (number == 2) {
				ball++;
			} else {
				if (strike < 2) {
					strike++;
				}
			}
		}
		System.out.println(ball + "ボール," + strike + "ストライク");
	}
}

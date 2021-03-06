package northsoftstudio_exercises;

//中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
//両方とも 60 点以上の場合、合格
//合計が 130 点以上の場合、合格
//合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
//上記以外は不合格
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter3_8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		if (x >= 60 && y >= 60) {
			System.out.println("合格");
		} else if (x + y >= 130) {
			System.out.println("合格");
		} else if ((x + y >= 100) && (x >= 90 || y >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}
}

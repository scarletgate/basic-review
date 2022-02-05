public class Operator {
	public static void main(String[] args) {
		int a = 15;
		int c;
		c = a + 3; //C = 18
		System.out.println(c);
		c = a - 5; //C = 10
		System.out.println(c);
		c = a * 2; //C = 30
		System.out.println(c);
		c = a / 6; //C = 2
		System.out.println(c);
		c = a % 4; //C = 3
		System.out.println(c);

		int d;
		d = 10;
		d++; //a = 11
		System.out.println(d);
		d = 10;
		d--; //a = 9
		System.out.println(d);

		int f;
		int g;
		f = 5;
		g = ++f;
		System.out.println(g);
		f = 5;
		g = f++;
		System.out.println(g);

		int h;
		h = 10;
		h += 5;
		System.out.println(h);
		h -= 3;
		System.out.println(h);
		h *= 4;
		System.out.println(h);
		h /= 2;
		System.out.println(h);
		h %= 7;
		System.out.println(h);
	}

}

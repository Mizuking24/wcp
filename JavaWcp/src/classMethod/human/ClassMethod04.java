package classMethod.human;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yoshida = new Human04("吉田");
		Human04.staticMethodPrint();
		System.out.println(Human04.GREETING);

		yoshida.instanceMethodPrint();
	}
}

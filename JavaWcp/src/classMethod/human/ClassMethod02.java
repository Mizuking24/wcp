package classMethod.human;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yoshida = new Human02();
		System.out.println("名前は" + yoshida.name + "で、年齢は" + yoshida.age);

		Human02 sato = new Human02("佐藤", 15);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age);
	}
}

package classMethod.human;

public class ClassMethod03 {
	public static void main(String[] args) {
		Human03 yoshida = new Human03();
		System.out.println("私の名前は" + yoshida.name + "です。");
		String profile = yoshida.getProfile();
		System.out.println(profile + "です。");

		yoshida.greet("田辺");
		yoshida.greet(null);
	}
}

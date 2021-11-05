package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;

	public Human03() {
		this.name = "吉田";
		this.age = 22;
		this.profession = "エンジニア";
	}

	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.profession;
	}

	public void greet(String friend) {
		if (friend == null) {
			System.out.println("挨拶する相手がわかりません。");
			return;
		}
		System.out.println(friend + "さん、こんにちは");
	}
}

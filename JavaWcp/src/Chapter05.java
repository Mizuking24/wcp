
public class Chapter05 {
	public static void main(String[] args) {
		long long1 = 92233720368547L;
		double double1 = 3.14d;
		boolean boolean1 = true;
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);

		Float float1 = Float.valueOf(0.12f);
		Integer integer1 = Integer.valueOf(7);
		Character character1 = Character.valueOf('あ');
		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(character1);

		int[] item5 = new int[] { 10, 20, 30, 40, 50 };
		System.out.println(item5[2]);
	}
}

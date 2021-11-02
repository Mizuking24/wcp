
public class Chapter07 {
	public static void main(String[] args) {
		int span = 12;
		if (span <= 5) {
			System.out.println("とても近いです。");
		} else if (span <= 10) {
			System.out.println("近いです。");
		} else if (span <= 15) {
			System.out.println("遠いです。");
		} else {
			System.out.println("とても遠いです。");
		}
		
		String color = "red";
		switch (color) {
		case "blue":
			System.out.println("青色です。");
			break;
		case "yellow":
			System.out.println("黄色です。");
			break;
		case "red":
			System.out.println("赤色です。");
			break;
		default:
			System.out.println("信号の色ではありません。");
		}
	}
}



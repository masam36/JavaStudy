package pkg02;

public class Sample {

	public static void main(String[] args) {

		// 以下実行結果になるよう実装する。

		// 実行結果１
		// 私の名前は山田太郎です！
		// 年齢は１９歳です！
		// あなたは未成年です。

		// 実行結果２
		// 私の名前は佐藤花子です！
		// 年齢は２０歳です！
		// あなたは成人です。

	}

	private static String confAge(HumanInfo argHumanInfo) {

		System.out.println("私の名前は" + argHumanInfo.getName() + "です！");
		System.out.println("年齢" + argHumanInfo.getAge() + "歳です！");

		if (argHumanInfo.getAge() < 20) {
			return "あなたは未成年です。";
		} else {
			return "あなたは成人です。";
		}
	}
}

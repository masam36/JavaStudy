package pkg01;

public class Sample {

	public static void main(String[] args) {

		// 以下実行結果になるよう実装する。

		// 実行結果１
		// method1を呼び出しました。

		// 実行結果２
		// method2を呼び出しました。 引数⇒引数２です。

		// 実行結果３
		// method3を呼び出しました。
		// method3の戻り値です。

		// 実行結果４
		// method4を呼び出しました。 引数⇒引数４です。
		// method4の戻り値です。

	}

	/**
	 * 引数なし、戻り値なしメソッド
	 */
	private static void method1() {

		System.out.println("method1を呼び出しました。");
	}

	/**
	 * 引数あり、戻り値なしメソッド
	 * 
	 * @param arg 引数
	 */
	private static void method2(String arg) {

		System.out.println("method2を呼び出しました。　引数⇒" + arg);
	}

	/**
	 * 引数なし、戻り値ありメソッド
	 * 
	 * @return 戻り値
	 */
	private static String method3() {

		System.out.println("method3を呼び出しました。");
		return "method3の戻り値です。";
	}

	/**
	 * 引数あり、戻り値ありメソッド
	 * 
	 * @param arg 引数
	 * @return 戻り値
	 */
	private static String method4(String arg) {

		System.out.println("method4を呼び出しました。　引数⇒" + arg);
		return "method4の戻り値です。";
	}

}

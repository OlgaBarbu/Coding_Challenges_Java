
public class StringPeeler {

	public static void main(String[] args) {

		String str = ("MonkeyBusiness");
		System.out.println(removeFirstAndLast(str));

	}

	public static String removeFirstAndLast(String str) {

		str = str.substring(1, str.length() - 1);

		return str;

	}

}

package quick;

public class sec {
	public static void action() {
		String sentence = "cochlear implant";
		long number = Long.parseLong("129610310304851");
		String ans = "";
		while(number > 0) {
			ans += sentence.charAt((int)(number&15));
			number >>= 4;
		}
		System.out.println(ans);
	}
}

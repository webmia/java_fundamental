
public class VarArgEx {
	
	static String concatnate (String delim, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		return result;
	}
	public static void main(String[] args) {
		String[] strArr = {"100","200","300"};
		
		System.out.println(concatnate("","100","200","300"));
		System.out.println(concatnate("-", strArr));
		System.out.println(concatnate(",", new String[] {"100","200","300"}));
		System.out.println(concatnate(",", new String[0]) + "]");
		System.out.println("[" + concatnate (",", new String[0]) + "]");
		System.out.println("[" + concatnate(",") + "]");
	}

}

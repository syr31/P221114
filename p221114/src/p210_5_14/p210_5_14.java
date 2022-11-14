package p210_5_14;

public class p210_5_14 {

	public static void main(String[] args) {
		String src = "ABCDE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + "):" + ch); // ( ) = 괄호 안에 넣으면 결과값이 나온다 (메서드)
																// ex) src.length();,src.charAt(i);
		}
		char[] chArr = src.toCharArray();						// 
		System.out.println(chArr);
	}

}

package P208_5_13;

public class P208_5_13 {

	public static void main(String[] args) {
		char[] hex = { 'C', 'A', 'F', 'E' };
		
		String[]binary = {	"0000","0001","0010","0011",
							"0100","0101","0110","0111",
							"1000","1001","1010","1011",
							"1100","1101","1110","1111",};	//0~9까지 2진수로 표기
		
		String result = "";

		for (int i = 0; i < hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') {		//0~9까지 아스키 코드로 비교하는 것 
														//어떤 문자에서 아스키코드를 빼면 정수값으로 나온다 
				result += binary[hex[i] - '0'];
			} else {
				result += binary[hex[i] - 'A' + 10];
			}
		}
		System.out.println("hex:" + new String(hex));
		System.out.println("binary:" + result);
	}

}

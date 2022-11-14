package p200_5_9;

import java.util.Arrays;

public class p200_5_9 {

	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 };	
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * code.length);		//코드
			arr[i] = code[tmp]; // 난수로 발생한 "code"값을 인덱스로 사용하여 "arr"값에 넣는다.

		}
		System.out.println(Arrays.toString(arr));
	}

}

package p204_5_11;

public class p204_5_11 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;				//해당 숫자가 몇개 출력되는지 counter
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 :" + counter[i]);
		}
	}

}

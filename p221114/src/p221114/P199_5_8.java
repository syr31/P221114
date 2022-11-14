package p221114;

public class P199_5_8 {

	public static void main(String[] args) {
		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) 
			ball[i] = i + 1; 			// i + 1 값을 i에 계속 넣는다.

		int temp = 0;
		int j = 0;

		for (int i = 0; i < 6; i++) {			// 0부터 6까지	1씩증가
			j = (int) (Math.random() * 45);		//j에 난수로 발생된 값을 저장
			temp = ball[i];		// swap
			ball[i] = ball[j];	//난수값으로 사용
			ball[j] = temp;
		}
		for (int i = 0; i < 6; i++)
			System.out.printf("ball [%d]=%d%n", i, ball[i]);
	}

}

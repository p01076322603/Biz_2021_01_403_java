package baekjoon.step03;

// import java.util.Arrays;
import java.util.Scanner;

public class Three_011_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] arr = new int[N];
		int hit = 0;
		int value;
		
		for (int i = 0; i < N; i++) {
			
			value = sc.nextInt();
			
			if (value < X) {
				arr[hit] = value;
				++hit;
			}
		}

		sc.close();
		
	//	arr = Arrays.copyOf(arr, arr.length - (N - hit));
		
	//	for(int a : arr) {
	//		System.out.print(a + " ");
	//	}
	
		for(int i = 0; i < hit; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
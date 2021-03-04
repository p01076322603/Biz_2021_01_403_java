package interfaceTest.calc;

public interface Calc {

	// interface로 선언되면 모두 public abstract가 된다
	// interface로 선언되면 모든 변수는 public final static으로 상수가 된다
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
	}
	
	static int total(int[] arr) {
		int total = 0;

		for (int i : arr) {
			total += i;
		}
		return total;
	}
}

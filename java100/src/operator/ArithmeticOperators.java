package operator;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [ ! ] : 수치 연산자 --> +, -, *, /(몫), %(나머지 연산자)
		int a, b;
		a=60; b=8;
		
		System.out.println( a + b );					// 68
		System.out.println( "a + b = " + a + b );		// a + b = 608 -->계산을 할때는 괄호를 쓰기
		System.out.println( "a + b = " + (a + b) );		// a + b = 68 또는 별도의 변수에 결괏값(68)을 저장하여 사용.
		System.out.println( "a - b = " + (a - b) );		// 52
		System.out.println( "a * b = " + (a * b) );		// 480
		System.out.println( "a / b = " + (a / b) );		// 7(몫)
		System.out.println( "a % b = " + (a % b) );		// 4(나머지)
	}

}

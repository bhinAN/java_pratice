package operator;
//축약된 형태의 연산자를 사용하여 변수 a의 값을 증가시켜보시오.
//이 문제는 수의 연산시 축약된 형태로 사용하는 방법에 대해서 알고 있는지를 묻는 문제이
public class ArithmeticOperators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [ ! ] : 축약된 형태
		int a=0, b=100; 
		
		a = a + 1;		
		System.out.println( a );  // 1
		
		a += 1;
		System.out.println( a );  // 2
		
		a -= 1;
		System.out.println( a );  // 1
		
		b++;
		System.out.println( b );  // 101
		
		b++;
		System.out.println( b );  // 102
		
		b--;
		System.out.println( b );  // 101
	}

}

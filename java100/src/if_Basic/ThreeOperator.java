// 삼항 연산자를 이용하여 12시 보다 작으면 오전, 크면 오후를 출력하도록 구현해보시오.
// 이 문제는 삼항 연산자의 사용법에 대해서 아는지를 묻는 문제이다.

package if_Basic;

public class ThreeOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] : 변수 선언
		int hour = 23;
		
		// [2] : 삼항 연산자 테스트 --> 시간 간단하게 표시하기
		int test = hour <= 12 ? hour : hour%12;
		// 12보다 작거나 같으면->hour 아니면 hour%12를 test에 할당
		System.out.println( "[2]" + test );
			
		// [3] : 삼항 연산자를 이용하여 12시 보다 작으면 오전, 크면 오후 출력
		String str1 = "오전";
		String str2 = "오후";
		String ampm = hour < 12 ? str1 : str2;
		System.out.println( "[3]" + ampm );
		
		System.out.println("현재시간은 "+ ampm +" "+ test + "시 입니다");
	}

}

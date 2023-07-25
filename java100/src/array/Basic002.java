package array;

//배열과 인덱스의 관계에 대해서 설명하고 배열의 초깃값은 어떻게 셋팅되는지 말해보시오.
//크기 10의 정수형 배열을 생성하고 인덱스로 배열 공간의 값을 출력해보시오.
//이 문제는 자바의 배열 및 인덱스 사용법 그리고 배열 생성시 초깃값이 어떻게 정해지는지를 묻는 문제이다.


//[!]:배열과 인덱스
//크기 10의 정수형 배열을 선언하고 크기 10을 지정하면 메모리상에는 10개의 정수형 값을 담을 수 있는 공간이 생성된다.
//배열 변수는 참조형 타입으로써 해당 메모리 공간을 가리키게 된다. --> 즉, ㅎ해당 메모리 공간의 주소 값을 가진다.--> 이 주소 값을 통해서 참조한다.
//주소 값은 다른 표현으로는 참조 값이라고도 부른다.
//공간이 10개 만들어지면 동시에 자동적으로 해당 공간에 접근할 수 있는 인덱스 번호가 자동 부여된다. --> 인덱스 번호는 0부터 시작.
//따라서, 크기가 10인 배열 공간의 첫 번째 인덱스는 0이고, 마지막 공간의 인덱스는 9가 된다. --> 즉, 마지막 인덱스는 "배열의 크기-1"이 된다.
//인덱스 사용 -->배열명[인덱스번호]

public class Basic002 {

	public static void main(String[] args) {
		// [1] : 배열의 선언 및 크기 지정 --> 학생 10명의 성적을 담는 배열
		int[] scores = new int[10];
		int s_size = scores.length;
		scores[0] = 100;
		scores[9] = 90;
		
		
		// [2] : 선언한 배열을 인덱스로 접근하여 값 출력하기
		System.out.println( scores[0] );			// 100
		//System.out.println( scores[-1] );			// 파이썬과 같이 9번인덱스를 가르키지 않음 Err 발생
		// System.out.println( scores[10] );		// Err
		System.out.println( scores[s_size-1] );	// 90
	}

}

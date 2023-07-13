package for_;

//홀수, 짝수 구하기 문제를 while 반복문을 사용하여 구현해보시오.
//1~30 까지의 수에서 짝수만 출력하시오.
//이 문제는 while 반복문과 그 안에서 조건문을 사용할 수 있는지를 묻는 문제이다.


public class while_WithIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] : 변수선언
		int number = 1;
		
		//[2] : 반복문을 풀면서 홀수, 짝수 체크
		while(number <= 30)
		{
			if((number%2)==0) {
				System.out.print(number+" ");
			}
			number++;
		}
		System.out.println("종료");
	}

}

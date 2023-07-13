package array;

//배열 요소에 데이터 값을 넣으려면 어떻게 해야하는지 작성
//이 문제는 배열을 생성한 후에 데이터 값을 입력하는 방법에 대해서 아는지를 묻는 문제이다.


public class Basic003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//배열 선언과 동시에 값 초기화
		int Data_in[] = {3,11,22,33,44};
		
		//배열 선언과 배열의 크기를 정하고 선언한 배열 공간에 값 입력하기
		int[] Data_in2 = new int[5];
		Data_in2[0] = 3;
		Data_in2[1] = 11;
		Data_in2[2] = 22;
		Data_in2[3] = 33;
		Data_in2[4] = 44;
		
		
		//값 출력하기
		int a;
		for(int i=0;i<5;i++) {
			a=Data_in[i];
			System.out.print(a+" ");
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(Data_in2[i]+" ");
		}
		System.out.println();
		//배열 길이-1로 배열 마지막 칸에 들어있는 값 출력하는 방식
		System.out.println(Data_in[Data_in.length-1]);
	}

}

package array;

import java.util.Scanner;
public class TwoArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1, 사용자 입력을 위한 객체 선언
		Scanner sc = new Scanner(System.in);
		
		// 2, 2차원 배열의 행과 열 선언 --> 사용자 입력으로 처리
		System.out.print("행의 갯수를 입력하고 [Enter]를 치세요 =");
		int R = sc.nextInt();
		System.out.print("열의 갯수를 입력하고 [Enter]를 치세요 =");
		int C = sc.nextInt();
		
		//3, char2차원 배열 선언 --> 사용자로부터 R,C입력받아 --> gameMap[R][C] 생성.
		char[][] gameMap = new char[R][C];
		
		//4, 사용자 입력을 받아서 저장할 String 배열 선언-->이때 크기를 [R]로 해주도록 한다.(중요)
		//크기를 R 만큼만 해주면 되는 이유? --> 어차피 사용자가 입력하는 값은 안쪽 for문을 돌면서 2차원 배열에 입력하기 때문이다.
		String[] strAr = new String[R];
		
		//5, 2차원 배열 요소 --> 사용자가 입력하는 값으로 셋팅
		for(int i=0; i<R;i++) {
			System.out.printf("%d번째 행에 입력할 문자 %d개를 차례대로 입력하고 [Enter] 치세요=",i+1, C);
			strAr[i]=sc.next();
			for(int j=0; j<C; j++) {
				gameMap[i][j]=strAr[i].charAt(j); 
			}
		}
		
		//6, 2차원 배열에 들어있는 값 출력하기
		System.out.println(strAr);
		System.out.println(strAr[1]);
		System.out.println(strAr[2]);
		
		
		for(int i=0; i<R; i++) {
			System.out.printf("%d번째 행에 들어있는 문자열 : ", i+1);
			for(int j=0; j<C; j++) {
				System.out.print(gameMap[i][j]);
			}
			System.out.println();
		}
		
		
	}

}

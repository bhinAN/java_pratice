package if_Basic;

public class basic004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] : 변수 선언
		int kor=100, eng=100, math=80;
		int total_score;		
		total_score = kor + eng + math;

		// [2] : if ~ else if ~ else 조건문 사용하기
		if( total_score >= 270 )
			System.out.println( "당신의 토탈 점수는 "+ total_score+ " 입니다. 매우 매우 잘했어요~" );
			// System.out.println( "축하해요~" );  // 괄호가 없으면 한줄만 처리
		else if( total_score >= 240 )
			System.out.println( "당신의 토탈 점수는 "+ total_score+ " 입니다. 잘했어요~" );
		else if( total_score >= 210 )
			System.out.println( "당신의 토탈 점수는 "+ total_score+ " 입니다. 노력하세요~" );
		else
			if ( math >= 60 )
				System.out.printf( "당신의 토탈점수는 %d점이고, 수학점수는 %d점입니다. 수학이 60점 이상이므로 재수강 대상자는 아닙니다.", total_score, math );
			else
				System.out.printf( "당신의 토탈점수는 %d점이고, 수학점수는 %d점입니다. 수학이 60점 미만이므로 재수강 대상자입니다.", total_score, math );
	}

}

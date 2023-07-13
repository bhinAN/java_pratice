package variable;
// 자바의 Primitive Data Type의 크기를 출력하는 코드를 구현하시오.
// 정수형 타입과 문자형 타입에 대해서만 구현한다.
// 이때, 각 타입의 최댓값솨 최솟값도 같이 구하여 출력하시오
public class variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte, short, integer, long, char
		System.out.println("byte: "+Byte.BYTES +"바이트"+" "+Byte.SIZE+"비트"+" 최솟값~최대값: "+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("short: "+Short.BYTES +"바이트"+" "+Short.SIZE+"비트"+" 최솟값~최대값: "+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("long: "+Long.BYTES +"바이트"+" "+Long.SIZE+"비트"+" 최솟값~최대값: "+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("int: "+Integer.BYTES +"바이트"+" "+Integer.SIZE+"비트"+" 최솟값~최대값: "+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("char: "+Character.BYTES +"바이트"+" "+Character.SIZE+"비트"+" 최솟값~최대값: "+(int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);

		
	}

}

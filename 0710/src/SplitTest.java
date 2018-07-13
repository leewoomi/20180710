import java.util.ArrayList;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 200;
		int y = 100;
		String str = String.format("x:%d y:%d", x, y);
		System.out.println(str);
		String msg = "  I like Java ";
		System.out.println(msg);
		// 위의 문자열에서 java포함 여부를 확인 - 대소문자 구분없이
		int idx = msg.toLowerCase().indexOf("java".toLowerCase());
		if (idx >= 0) {
			System.out.println("java가 존재한다.");
		} else {
			System.out.println("java가 존재하지 않습니다.");
		}

		// 위의 msg를 공백단위로 구분해서 전부 출력
		String[] ar = msg.split(" ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + "/");
		}
		
		System.out.println(msg.indexOf("like"));
		System.out.println(msg.toLowerCase().lastIndexOf("j"));
		System.out.println(msg.toLowerCase());
		//좌우 공백 제거 후 대문자로 변환
		System.out.println(msg.trim().toUpperCase());
		//좌우 공백 제거
		System.out.println(msg.trim());
		// msg의 3번째 부터 7번째 글자까지를 가져와서 출력하기
		System.out.println(msg.substring(3, 8));
		
		System.out.println(msg.trim().substring(3,8));
		System.out.println(msg.substring(3));
		System.out.println(msg.trim().charAt(3));
		System.out.println(msg.trim().length());
		System.out.println(msg.charAt(msg.length()-2));
		System.out.println(msg.replace(" ", "|"));
		
	
	}

}

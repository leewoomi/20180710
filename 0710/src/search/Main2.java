package search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Movie[] movie = new Movie[4];

		// 인스턴스 생성
		movie[0] = new Movie();
		// 값을 채운다
		movie[0].setTitle("마녀");
		movie[0].setRelease("2018.06.27");
		movie[0].setDirector("박정훈");
		movie[0].setRunningTime(125);

		movie[1] = new Movie();
		movie[1].setTitle("변산");
		movie[1].setRelease("2018.07.04");
		movie[1].setDirector("이준익");
		movie[1].setRunningTime(123);

		movie[2] = new Movie();
		movie[2].setTitle("미드나잇 선");
		movie[2].setRelease("2018.06.21");
		movie[2].setDirector("스콧 스피어");
		movie[2].setRunningTime(92);

		movie[3] = new Movie();
		movie[3].setTitle("앤트맨과 와스프");
		movie[3].setRelease("2018.07.04");
		movie[3].setDirector("페이튼 리드");
		movie[3].setRunningTime(118);

		// 배열의 데이터를 정렬
		// 기본적으로 정렬을 하려면 각 데이터의 크기를 비교할 수 있어야 함.
		// 자바에서 크기비교를 하는 메소드는
		// Comparable 인터페이스의 Compare 메소드 입니다.
		// 직접 만든 클래스의 경우는 클래스에 Comparable 인터페이스를
		// implements 하던가 Comparator 인터페이스를 implements한
		// 인스턴스를 같이 대입해야 함.

		// Comparator 인터페이스를 implements 한 인스턴스 만들기

		Scanner sc = new Scanner(System.in);
		while (true) {
			// 비교한 Comparator 변수 생성
			Comparator<Movie> comparator = null;
			System.out.println("0 : 종료,1:제목오름차순,2:제목내림차순");
			int menu = sc.nextInt();
			if (menu == 0) {
				break;
			} else if (menu == 1) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Movie movie1 = (Movie) o1;
						Movie movie2 = (Movie) o2;
						// title을 이용해서 비교
						return movie1.getRelease().compareTo(movie2.getRelease());

					}
				};

			} else if (menu == 2) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Movie movie1 = (Movie) o1;
						Movie movie2 = (Movie) o2;
						// title을 이용해서 비교
						return movie2.getRelease().compareTo(movie1.getRelease());

					}
				};
			}
			Arrays.sort(movie,comparator);
			// 배열의 데이터를 전부 출력
			for (Movie temp : movie) {
				System.out.println(temp);
			}

		}

		System.out.println("-----------------------------");

		sc.close();

	}
}

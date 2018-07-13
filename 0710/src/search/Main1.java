package search;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {

		String[] day = { "A", "C", "D", "E", "B", "G", "F" };
		// 정렬 전 출력
		for (String i : day) {
			System.out.print(i + "\t");
		}
		System.out.println("\n--------------------");
		// 정렬
		Arrays.sort(day);
		// B의 위치를 검색
		int idx = Arrays.binarySearch(day, "B");
		System.out.println(idx);
		// D의 위치 검색
		idx = Arrays.binarySearch(day, "D");
		System.out.println(idx);

		// 정렬 후 출력
		for (String i : day) {
			System.out.print(i + "\t");
		}

	}

}

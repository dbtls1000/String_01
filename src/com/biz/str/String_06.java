package com.biz.str;

public class String_06 {

	public static void main(String[] args) {
			
		String strNation = "Republic of Korea";
		String[] s1 = strNation.split("");
		
		// s1은 낱개 문자열을 담고 있는 배열이다.
		// 이 s1 문자열 배열에서
		// 영문자 o 가 최초로 몇번째에서 나타나는지
		// 찾아봅시다.
		int intNum = strNation.length();
		for( int i = 0 ; i < intNum ; i++) {
			if (s1[i].equals("o")) {
				System.out.println("o는 " + i +"번째 입니다.");
				break;
			}
		}
		/*
		 * 문자열은 == 를 사용해서 비교를 할 경우
		 * 문자열 변수에 저장된 값을 상대로 비교하지 않고
		 * 실제 문자열이 저장된 주소를 상대로 비교를 한다.
		 * 
		 * 따라서 문자열 변수에 저장된 값을 어떤 문자열과 비교하고자 할때는
		 * == 대신에 equals() method를 사용해야 한다.
		 */
		
		
	}
	
}

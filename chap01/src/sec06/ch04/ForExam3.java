package sec06.ch04;
// for each문
public class ForExam3 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 10, 56 };

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("--------------");
		
		for (int val : arr) { // 순서가 있다면 모두 출력 가능, 다만 개별 인덱스 사용은 불가능함
			System.out.println(val);
		}
	}

}

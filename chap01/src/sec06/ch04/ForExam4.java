package sec06.ch04;

public class ForExam4 {
	public static void main(String[] args) {
		String[] strArr = {"A","B","C","D"};
		
		for(int z=strArr.length-1; z>=0; z--) {
			System.out.println(strArr[z]);
		}
		System.out.println("--------역순--------");
		
		for(String i : strArr) {
			System.out.println(i);
		}
	}

}

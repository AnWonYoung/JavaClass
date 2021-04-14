package sec06.ch07;

public class MyArrayList implements MyList {
	private int[] arr;

	public MyArrayList() {
		arr = new int[0];
	}

	// ArrayList 메소드 만들기
	@Override
	public void add(int value) {
		int[] temp = new int[arr.length + 1]; // temp가 1개의 방을 만드는 것
												// new와 동시에 배열이 하나 늘어남
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		temp[arr.length] = value; // 0번방 = value(10이 들어오면 10, 20이 들어오면 20)
		arr = temp; // temp의 값을 arr로 복사하여 붙이기 한 번 돌 때 10이라는 0번방을 갖고 있는 것
	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}

	@Override
	public int remove() {
		int[] temp = new int[arr.length - 1];

//		for(int i=0; i<temp.length; i++) {
//			temp[i] = arr[i];
//		}								다른 방법의 for문

		for (int i = 0; i < arr.length - 1; i++) {
			temp[i] = arr[i];
		}
		arr = temp;

		return temp[arr.length - 1];
	}
	@Override
	public void add(int idx, int value) {
		int[] temp = new int[arr.length+1];

		for (int i = 0; i < idx; i++) {
			temp[i] = arr[i];
		}
		temp[idx] = value;
		
//		알고리즘 연습하기 1)
		for(int i=idx; i<temp.length-1; i++) {
			temp[i+1] = arr[i-1];
		}
		
//		2)
//		for (int i = temp.length-1; i > idx; i--) {
//			temp[i] = arr[i-1];
//		}

		
//		3)
		
		arr = temp;

	}
	
	@Override
	public int remove(int value) {
		int[] temp = new int[arr.length-1];
		
		for(int i=0; i<value; i++) {
			temp[i] = arr[i];
		}
		
		for(int i=arr.length; i>value+1; i--) {
			temp[i-1-1] = arr[i-1];
		}
		int a = arr[value];
		arr = temp;
		
		return a;
	}

}

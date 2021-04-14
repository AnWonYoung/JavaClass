package sec06.ch07;

public class ArrayListMisson {
	public static void main(String[] args) {
		MyList list = new MyArrayList();
		
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(80);
		list.add(90);
		
		list.add(2,1000000);
		
//		int deVal = list.remove(1);
//		System.out.println("deVal : " + deVal);
		
//		int val = list.remove();
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d : %d\n", i, list.get(i));
		}
	}

}

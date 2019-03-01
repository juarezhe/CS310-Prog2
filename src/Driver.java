import data_structures.LinearList;
import data_structures.LinearListADT;

public class Driver {
	private static LinearListADT<Integer> list;

	public static void main(String[] args) {
		list = new LinearList<Integer>();
		testAddRemove();
	}
	
	public static void testAddRemove() {
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
	}
}

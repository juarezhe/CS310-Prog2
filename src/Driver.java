import data_structures.LinearList;
import data_structures.LinearListADT;

public class Driver {
	private static LinearListADT<Integer> list;

	public static void main(String[] args) {
		list = new LinearList<Integer>();
		testAddRemove();
	}
	
	public static void testAddRemove() {
		modifiedPeekFirst();
		modifiedPeekLast();
	}
	
	public static void modifiedPeekFirst() {
		Integer result = list.peekFirst();
		System.out.print("peekFirst result:\t");
		if (result == null && list.isEmpty())
			System.out.println(result + " (list empty)");
		else
			System.out.println("Unsure what happened.");
	}
	
	public static void modifiedPeekLast() {
		Integer result = list.peekLast();
		System.out.print("peekLast result:\t");
		if (result == null && list.isEmpty())
			System.out.println(result + " (list empty)");
		else
			System.out.println("Unsure what happened.");
	}
}

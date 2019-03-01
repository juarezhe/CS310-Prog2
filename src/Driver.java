import data_structures.LinearList;
import data_structures.LinearListADT;

public class Driver {
	private static LinearListADT<Integer> list;

	public static void main(String[] args) {
		list = new LinearList<Integer>();
		
		modifiedPeekFirst();
		modifiedPeekLast();
		modifiedAddFirst(10);
		modifiedPeekFirst();
		modifiedPeekLast();
	}
	
	public static void modifiedPeekFirst() {
		Integer result = list.peekFirst();
		System.out.print("peekFirst result:\t");
		if (result == null && list.isEmpty())
			System.out.println(result + " (list empty)");
		else if (result != null && !list.isEmpty())
			System.out.println(result + " (success!)");
		else
			System.out.println("Unsure what happened.");
	}
	
	public static void modifiedPeekLast() {
		Integer result = list.peekLast();
		System.out.print("peekLast result:\t");
		if (result == null && list.isEmpty())
			System.out.println(result + " (list empty)");
		else if (result != null && !list.isEmpty())
			System.out.println(result + " (success!)");
		else
			System.out.println("Unsure what happened.");
	}
	
	public static void modifiedAddFirst(Integer obj) {
		boolean result = list.addFirst(obj);
		System.out.print("addFirst result:\t");
		if (result == true)
			System.out.println(result + " (success!)");
		else
			System.out.println("Unsure what happened.");
	}
	
	public static void modifiedAddLast(Integer obj) {
		boolean result = list.addLast(obj);
		System.out.print("addLast result:\t");
		if (result == true)
			System.out.println(result + " (success!)");
		else
			System.out.println("Unsure what happened.");
	}
	
	public static void modifiedAddFirst(Integer obj) {
		boolean result = list.addFirst(obj);
		System.out.print("addFirst result:\t");
		if (result == true)
			System.out.println(result + " (success!)");
		else
			System.out.println("Unsure what happened.");
	}
}

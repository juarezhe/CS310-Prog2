import data_structures.LinearList;
import data_structures.LinearListADT;

public class Driver {
	private static LinearListADT<Integer> list;

	public static void main(String[] args) {
		list = new LinearList<Integer>();
		
		modifiedRemoveFirst();
		modifiedRemoveLast();
		modifiedPeekFirst();
		modifiedPeekLast();
		
		modifiedAddFirst(10);
		iterate();
		
		modifiedAddLast(15);
		iterate();
		
		modifiedAddFirst(20);
		iterate();
		
		modifiedAddLast(25);
		iterate();
		
		modifiedRemoveFirst();
		iterate();
		
		modifiedRemoveLast();
		iterate();
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
		
		System.out.print("addLast result:\t\t");
		if (result == true)
			System.out.println(result + " (success!)");
		else
			System.out.println("Unsure what happened.");
	}
	
	public static void modifiedRemoveFirst() {
		Integer result = list.removeFirst();
		
		System.out.print("removeFirst result:\t");
		if (result == null && list.isEmpty())
			System.out.println(result + " (list empty)");
		else if (result != null)
			System.out.println(result + " (success!)");
		else
			System.out.println("Unsure what happened.");
	}
	
	public static void modifiedRemoveLast() {
		Integer result = list.removeLast();
		
		System.out.print("removeLast result:\t");
		if (result == null && list.isEmpty())
			System.out.println(result + " (list empty)");
		else if (result != null)
			System.out.println(result + " (success!)");
		else
			System.out.println("Unsure what happened.");
	}
	
	public static void modifiedSize() {
		System.out.print("size:\t\t\t");
		System.out.println(list.size());
	}
	
	public static void iterate() {
		System.out.println("Should print " + list.size() + " elements from " + list.peekFirst() + " to " + list.peekLast() + ":");
		for (Integer node : list)
			System.out.print(node + ", ");
		System.out.println();
	}
}

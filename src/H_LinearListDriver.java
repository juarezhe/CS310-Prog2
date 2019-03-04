import data_structures.LinearList;
import data_structures.LinearListADT;

public class H_LinearListDriver {
	private static LinearListADT<Integer> list;
	private static Integer INTEGER_TO_ADD = 10;

	public static void main(String[] args) {
		list = new LinearList<Integer>();
		
		System.out.println("EMPTY LIST TESTS");
		modifiedRemove(INTEGER_TO_ADD);
		modifiedRemoveFirst();
		modifiedRemoveLast();
		modifiedPeekFirst();
		modifiedPeekLast();
		System.out.println();
		
		System.out.println("ONE-ELEMENT LIST TESTS");
		modifiedAddFirst(INTEGER_TO_ADD);
		iterate();
		modifiedRemove(INTEGER_TO_ADD);
		iterate();
		System.out.println();
		
		System.out.println("TWO-ELEMENT LIST TESTS");
		modifiedAddFirst(INTEGER_TO_ADD);
		modifiedAddFirst(INTEGER_TO_ADD + 5);
		iterate();
		modifiedRemove(INTEGER_TO_ADD);
		iterate();
		modifiedAddLast(INTEGER_TO_ADD);
		iterate();
		modifiedRemove(INTEGER_TO_ADD + 5);
		iterate();
		modifiedClear();
		System.out.println();
		
		System.out.println("THREE-ELEMENT LIST TESTS");
		modifiedAddFirst(INTEGER_TO_ADD);
		modifiedAddFirst(INTEGER_TO_ADD + 5);
		modifiedAddFirst(INTEGER_TO_ADD + 10);		
		iterate();
		modifiedRemove(INTEGER_TO_ADD);
		iterate();		
		modifiedAddLast(INTEGER_TO_ADD);
		iterate();
		modifiedRemove(INTEGER_TO_ADD + 10);
		iterate();		
		modifiedAddFirst(INTEGER_TO_ADD + 10);
		iterate();
		modifiedRemove(INTEGER_TO_ADD + 5);
		iterate();
		modifiedClear();
		System.out.println();
		
		System.out.println("CLEARED LIST TESTS");
		modifiedRemove(INTEGER_TO_ADD);
		modifiedRemoveFirst();
		modifiedRemoveLast();
		modifiedPeekFirst();
		modifiedPeekLast();
		iterate();
		System.out.println();
		
		System.out.println("LARGE LISTS TESTS");
		buildList(INTEGER_TO_ADD * 4);
		iterate();
		modifiedContains(INTEGER_TO_ADD);
		modifiedContains(INTEGER_TO_ADD * 4 + 1);
		modifiedAddLast(INTEGER_TO_ADD);
		modifiedRemove(INTEGER_TO_ADD);
		iterate();
		modifiedContains(INTEGER_TO_ADD);
	}
	
	public static void modifiedPeekFirst() {
		Integer result = list.peekFirst();
		
		System.out.print("peekFirst result:\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println(result + " successfully found");
		else
			System.out.println("not sure what happened...");
	}
	
	public static void modifiedPeekLast() {
		Integer result = list.peekLast();
		
		System.out.print("peekLast result:\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println(result + " successfully found");
		else
			System.out.println("not sure what happened...");
	}
	
	public static void modifiedAddFirst(Integer obj) {
		boolean result = list.addFirst(obj);
		
		System.out.print("addFirst result:\t");
		if (result == true)
			System.out.println(obj + " successfully added");
		else
			System.out.println("not sure what happened...");
	}
	
	public static void modifiedAddLast(Integer obj) {
		boolean result = list.addLast(obj);
		
		System.out.print("addLast result:\t\t");
		if (result == true)
			System.out.println(obj + " successfully added");
		else
			System.out.println("not sure what happened...");
	}
	
	public static void modifiedRemoveFirst() {
		Integer result = list.removeFirst();
		
		System.out.print("removeFirst result:\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println(result + " successfully removed");
		else
			System.out.println("not sure what happened...");
	}
	
	public static void modifiedRemoveLast() {
		Integer result = list.removeLast();
		
		System.out.print("removeLast result:\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println(result + " successfully removed");
		else
			System.out.println("not sure what happened...");
	}
	
	public static void modifiedSize() {
		System.out.print("size:\t\t\t");
		System.out.println(list.size());
	}
	
	public static void iterate() {
		int itemsInLine = 0;
		
		System.out.println("Should print " + list.size() + " elements from " + list.peekFirst() + " to " + list.peekLast() + ":");
		for (Integer node : list) {
			if (itemsInLine == 50) {
				System.out.println();
				itemsInLine = 0;
			}
			System.out.print(node + ", ");
			itemsInLine++;
		}
		System.out.println();
	}

	public static void modifiedClear() {
		System.out.println("clear");
		list.clear();
	}

	public static void buildList(Integer listSize) {
		for(int n = 1; n <= listSize; n++)
			list.addFirst(n);
	}

	public static void modifiedContains(Integer obj) {
		boolean result = list.contains(obj);
		
		System.out.print("search result:\t\t");
		if (result == true)
			System.out.println(obj + " successfully found");
		else
			System.out.println(obj + " could not be found");
	}

	public static void modifiedRemove(Integer obj) {
		Integer result = list.remove(obj);
		
		System.out.print("remove result:\t\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println(result + " successfully removed");
		else
			System.out.println("not sure what happened...");		
	}
}
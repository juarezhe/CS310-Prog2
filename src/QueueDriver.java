import data_structures.Queue;

public class QueueDriver {
	private static Queue<Integer> list;
	private static Integer INTEGER_TO_ADD = 10;

	public static void main(String[] args) {
		list = new Queue<Integer>();
		
		System.out.println("EMPTY LIST TESTS");
		modifiedRemove(INTEGER_TO_ADD);
		modifiedPeek();
		System.out.println();
		
		System.out.println("ONE-ELEMENT LIST TESTS");
		modifiedEnqueue(INTEGER_TO_ADD);
		iterate();
		modifiedRemove(INTEGER_TO_ADD);
		iterate();
		System.out.println();
		
		System.out.println("TWO-ELEMENT LIST TESTS");
		modifiedEnqueue(INTEGER_TO_ADD);
		modifiedEnqueue(INTEGER_TO_ADD + 5);
		iterate();
		modifiedRemove(INTEGER_TO_ADD);
		iterate();
		modifiedEnqueue(INTEGER_TO_ADD);
		iterate();
		modifiedRemove(INTEGER_TO_ADD + 5);
		iterate();
		modifiedMakeEmpty();
		System.out.println();
		
		System.out.println("THREE-ELEMENT LIST TESTS");
		modifiedEnqueue(INTEGER_TO_ADD);
		modifiedEnqueue(INTEGER_TO_ADD + 5);
		modifiedEnqueue(INTEGER_TO_ADD + 10);
		iterate();
		modifiedRemove(INTEGER_TO_ADD);
		iterate();		
		modifiedEnqueue(INTEGER_TO_ADD);
		iterate();
		modifiedRemove(INTEGER_TO_ADD + 10);
		iterate();		
		modifiedEnqueue(INTEGER_TO_ADD + 10);
		iterate();
		modifiedRemove(INTEGER_TO_ADD + 5);
		iterate();
		modifiedMakeEmpty();
		System.out.println();
		
		System.out.println("CLEARED LIST TESTS");
		modifiedRemove(INTEGER_TO_ADD);
		modifiedDequeue();
		modifiedDequeue();
		modifiedPeek();
		iterate();
		System.out.println();
		
		System.out.println("LARGE LISTS TESTS");
		buildList(INTEGER_TO_ADD * 4);
		iterate();
		modifiedContains(INTEGER_TO_ADD);
		modifiedContains(INTEGER_TO_ADD * 4 + 1);
		modifiedRemove(INTEGER_TO_ADD);
		iterate();
		modifiedContains(INTEGER_TO_ADD);
	}
	
	public static void modifiedPeek() {
		Integer result = list.peek();
		
		System.out.print("peek result:\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println(result + " successfully found");
		else
			System.out.println("not sure what happened...");
	}
	
	public static void modifiedEnqueue(Integer obj) {
		list.enqueue(obj);
		Integer result = null;
		for (Integer data : list)
			result = data;
		System.out.print("enqueue result:\t");
		if (result.compareTo(obj) == 0)
			System.out.println(obj + " successfully added");
		else
			System.out.println("not sure what happened...");
	}
	
	public static void modifiedDequeue() {
		Integer result = list.dequeue();
		
		System.out.print("dequeue result:\t");
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
		
		System.out.println("Should print " + list.size() + " elements starting with " + list.peek() + ":");
		for (Integer obj : list) {
			if (itemsInLine == 50) {
				System.out.println();
				itemsInLine = 0;
			}
			System.out.print(obj + ", ");
			itemsInLine++;
		}
		System.out.println();
	}

	public static void modifiedMakeEmpty() {
		System.out.println("clear");
		list.makeEmpty();
	}

	public static void buildList(Integer listSize) {
		for(int n = 1; n <= listSize; n++)
			list.enqueue(n);
	}

	public static void modifiedContains(Integer obj) {
		boolean result = list.contains(obj);
		
		System.out.print("search result:\t");
		if (result == true)
			System.out.println(obj + " successfully found");
		else
			System.out.println(obj + " could not be found");
	}

	public static void modifiedRemove(Integer obj) {
		boolean result = list.remove(obj);
		
		System.out.print("remove result:\t");
		if (result == false && list.isEmpty())
			System.out.println("list empty");
		else if (result == true)
			System.out.println(obj + " successfully removed");
		else
			System.out.println("not sure what happened...");		
	}
}
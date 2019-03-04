import data_structures.*;

public class K_QueueDriver {
	private static Queue<Integer> list;
	private static final int TEST_LOOP_COUNT = 5;

	public static void main(String[] args) {
		System.out.println("Requested new Linear List");
		list = new Queue<Integer>();
		System.out.println("Successfully created a new list");
		basicTest(list);
	}

	public static void basicTest(Queue<Integer> list) {
		System.out.println("Testing push from empty");
		System.out.println("Print " + TEST_LOOP_COUNT + " to 1..");
		fillList(TEST_LOOP_COUNT);	
		printInfo();
		
		System.out.println("");
		for (int i = 1; i <= TEST_LOOP_COUNT; i++) {
			list.dequeue();
			System.out.println("Pop: " + i + " | Contains: " + i + " = "+ list.contains(i));
		}
		printInfo();
		
		System.out.println("\nAdding obj 20..");
		list.enqueue(20);
		printInfo();
		System.out.println("Emptying..");
		list.makeEmpty();
		printInfo();
		System.out.println();
		
		fillList(TEST_LOOP_COUNT);	
		printInfo();
		for (int i = 1; i <= TEST_LOOP_COUNT; i++) {
			list.remove(i);
			System.out.println("Remove: " + i + " | Contains: " + list.contains(i));
		}
		list.remove(null); // heehee
		printInfo();		
	}
	
	public static void fillList(int num) {
		System.out.println("Filling list from 1 to " + num);
		for (int i = 1; i <= num; i++) {
			list.enqueue(i);
			System.out.println("Push: " + i);
			
		}
	}
	public static void printInfo() {
		System.out.println("Empty = " + list.isEmpty() + " | size = " + list.size());
		testPeek();
	}
	
	public static void testPeek() { //Check that peek returns something
		if (list.peek() != null) System.out.println("Found first = " + list.peek());
		System.out.print("Current list: " );
		for(Integer i : list)
            System.out.print(i + " ");
		System.out.println("");
	}
}
import data_structures.*;

public class LinearListDriverKarajo {
	private static LinearListADT<Integer> list;
	private static final int TEST_LOOP_COUNT = 5;

	public static void main(String[] args) {
		System.out.println("Requested new Linear List");
		list = new LinearList<Integer>();
		System.out.println("Successfully created a new list");
		basicTest(list);
	}

	public static void basicTest(LinearListADT<Integer> list) {
		System.out.println("Testing adds when empty");
		System.out.println("Print " + TEST_LOOP_COUNT + " to 1..");
		for (int i = 1; i <= TEST_LOOP_COUNT; i++) {
			list.addFirst(i);
			System.out.println("addFirst: " + i);
		}
		
		testPeek(TEST_LOOP_COUNT,1);
		for(Integer i : list)
            System.out.print(i + " ");
		
		list.clear();
		if (list.size() != 0) System.out.println("ERROR with size");
		
		System.out.println("\n\nPrint 1 to " + TEST_LOOP_COUNT + "..");
		for (int i = 1; i <= TEST_LOOP_COUNT; i++) {
			list.addLast(i);
			System.out.println("addLast: " + i);
		}
		for(Integer i : list)
            System.out.print(i + " ");
		
		if (list.size() == TEST_LOOP_COUNT) 
			System.out.println("\nPassed size check of " + TEST_LOOP_COUNT);
		
		System.out.println("\nTesting Peek:");
		testPeek(1,TEST_LOOP_COUNT);
		
		System.out.println("Testing size 1 peek:");
		list.clear();
		list.addFirst(1);
		testPeek(1,1);
		
		list.clear();
		list.addLast(2);
		testPeek(2,2);
		
		list.clear();
		System.out.println("\nShould print 9 7 5 3 1 2 4 6 8 10");
		for (int i = 1; i < 10; i++) {
			list.addFirst(i);
			list.addLast(++i);
		}
		for(Integer i : list)
            System.out.print(i + " ");
		System.out.println("");
		for (int i = 1; i <= 11; i++)
			testFindContain(i);
		
		System.out.println("\nRemove elements front to back");
		for (int i = 1; i < 10; i++)
			System.out.println("removeFirst: " + list.removeFirst());
		if (list.removeFirst() == 10)
			System.out.println("Successfully removed remaining element");
		if (list.removeFirst() != null)
			System.out.println("ERROR in removeFirst()");
		System.out.println("Should return null: " + list.removeFirst());
		if (list.size()!=0) System.out.println("ERROR in size:" + list.size());
		System.out.println("Should not print anything from list");
		for(Integer i : list)
            System.out.print(i + " ");
		testPeek();
		
		System.out.println("");
		fillListFront(TEST_LOOP_COUNT);
		for(Integer i : list)
            System.out.print(i + " ");
		System.out.println();
		testPeek();
		// TODO: CHECK PLACEMENT OF HEAD AND TAIL
		System.out.println("Remove elements back to front");
		for (int i = 1; i < TEST_LOOP_COUNT; i++)
			System.out.println("removeLast: " + list.removeLast() + " | Contains = " + list.contains(i));
		if (list.removeLast() == TEST_LOOP_COUNT)
			System.out.println("Successfully removed remaining element");
		if (list.removeLast() != null) System.out.println("ERROR in removeLast()");
		System.out.println("\nShould return null: " + list.removeLast());
		if (list.size()!=0) System.out.println("ERROR in size:" + list.size());
		for(Integer i : list)
            System.out.print(i + " ");
		
		fillListLast(TEST_LOOP_COUNT);
		for(Integer i : list)
            System.out.print(i + " ");
		
		System.out.println("\n\nTesting remove");
		for (int i = 1; i <= TEST_LOOP_COUNT; i++) {
			System.out.println("To remove: " + i + " | Removed: " + list.remove(i));
		}
		for(Integer i : list)
            System.out.print(i + " ");
		if (list.isEmpty()) System.out.println("Successfully Emptied list");		
	}
	
	public static void fillListFront(int num) {
		System.out.println("Filling list from " + num + " to 1");
		for (int i = 1; i <= num; i++) {
			list.addFirst(i);
			System.out.println("addFirst: " + i + " | Contains = " + list.contains(i));
			
		}
	}	
	public static void fillListLast(int num) {
		System.out.println("Filling list from 1 to " + num);
		for (int i = 1; i <= num; i++) {
			list.addLast(i);
			System.out.println("addLast: " + i + " | Contains = " + list.contains(i));
		}
	}
	
	public static void testPeek() { //Check that peek returns something
		if (list.peekFirst() != null) System.out.print("Found first = " + list.peekFirst());
		else System.out.print("Nothing first");
		
		if (list.peekLast() != null) System.out.println(" | last = " + list.peekLast());
		else System.out.println(" | nothing last");
	}
	public static boolean testPeek(int first, int last) { // Check that peek is returning the correct values
		if (list.peekFirst() == first) 	System.out.print("Correct first = " + first);
		else System.out.print("Incorrect first");
		
		if (list.peekLast() == last) System.out.println(" | Correct last = " + last);
		else System.out.println("Incorrect last");
		return list.peekFirst() == list.peekLast();
	}
	public static void testFindContain(int num) {
		if ((list.find(num) != null) && (list.find(num) == num))
			System.out.println("Found " + list.find(num) + " and contains = " + list.contains(num));
		else
			System.out.println("Did not find " + num + " and contains = " + list.contains(num));
		return;
	}
}


import data_structures.*;

public class H_QueueDriver {
	private static Queue<Pokemon> queue;
	private static final Pokemon TEST_POKEMON = new Pokemon("eevee");

	public static void main(String[] args) {
		queue = new Queue<Pokemon>();

		emptyListTest();
		oneElementTest();
		twoElementTest();
		threeElementTest();
		emptyListTest();
		largeListTest();		
		failFastTest();
	}
	
	public static Pokemon generatePokemon() {
		return new Pokemon((int) (Math.random() * (Pokemon.LAST_POKEMON - 1) + 1));
	}
	
	public static void emptyListTest() {		
		System.out.println("EMPTY LIST TESTS");
		modifiedRemove(TEST_POKEMON);
		modifiedDequeue();
		modifiedPeek();
		iterate();
		System.out.println();
	}
	
	public static void oneElementTest() {		
		System.out.println("ONE-ELEMENT LIST TESTS");
		modifiedEnqueue(generatePokemon());
		iterate();
		modifiedDequeue();
		iterate();
		modifiedEnqueue(TEST_POKEMON);
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedMakeEmpty();
		System.out.println();
	}
	
	public static void twoElementTest() {		
		System.out.println("TWO-ELEMENT LIST TESTS");
		modifiedEnqueue(generatePokemon());
		modifiedEnqueue(TEST_POKEMON);
		iterate();
		modifiedDequeue();
		iterate();
		modifiedEnqueue(generatePokemon());
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedEnqueue(TEST_POKEMON);
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedMakeEmpty();
		System.out.println();
	}

	public static void threeElementTest() {
		System.out.println("THREE-ELEMENT LIST TESTS");
		modifiedEnqueue(generatePokemon());
		modifiedEnqueue(TEST_POKEMON);
		modifiedEnqueue(generatePokemon());
		iterate();
		modifiedDequeue();
		iterate();
		modifiedEnqueue(TEST_POKEMON);
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedEnqueue(generatePokemon());
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedEnqueue(TEST_POKEMON);
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedMakeEmpty();
		System.out.println();
	}

	public static void largeListTest() {
		System.out.println("LARGE LISTS TESTS");
		buildList(1000);
		iterate();
		modifiedContains(TEST_POKEMON);
		System.out.println();
	}

	public static void failFastTest() {
		System.out.println("FAIL-FAST TEST");
		for (Pokemon curr : queue)
			if (curr.compareTo(TEST_POKEMON) == 0)
				modifiedRemove(TEST_POKEMON);
	}
	
	public static void modifiedPeek() {
		Pokemon result = queue.peek();

		System.out.print("peek result:\t");
		if (result == null && queue.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println(result + " successfully found");
		else
			System.out.println("not sure what happened...");
	}

	public static void modifiedEnqueue(Pokemon obj) {
		queue.enqueue(obj);
		Pokemon result = null;
		for (Pokemon data : queue)
			result = data;
		System.out.print("enqueue result:\t");
		if (result.compareTo(obj) == 0)
			System.out.println("added " + obj);
		else
			System.out.println("not sure what happened...");
	}

	public static void modifiedDequeue() {
		Pokemon result = queue.dequeue();

		System.out.print("dequeue result:\t");
		if (result == null && queue.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println("removed " + result);
		else
			System.out.println("not sure what happened...");
	}

	public static void modifiedSize() {
		System.out.print("size:\t\t\t");
		System.out.println(queue.size());
	}

	public static void iterate() {
		int elementCount = 0;
		int itemsInLine = 0;

		System.out.println("iterate result:");
		for (Pokemon node : queue) {
			if (elementCount == queue.size() - 1) {
				System.out.print(node);
				break;
			}
			if (itemsInLine == 10) {
				System.out.println();
				itemsInLine = 0;
			}
			System.out.print(node + ", ");
			itemsInLine++;
			elementCount++;
		}
		System.out.println();
	}

	public static void modifiedMakeEmpty() {
		System.out.println("makeEmpty");
		queue.makeEmpty();
	}

	public static void buildList(int listSize) {
		for (int n = 1; n <= listSize; n++)
			queue.enqueue(generatePokemon());
	}

	public static void modifiedContains(Pokemon obj) {
		boolean result = queue.contains(obj);

		System.out.print("search result:\t");
		if (result == true)
			System.out.println("found " + obj);
		else
			System.out.println("couldn't find " + obj);
	}

	public static void modifiedRemove(Pokemon obj) {
		boolean result = queue.remove(obj);

		System.out.print("remove result:\t");
		if (result == false && queue.isEmpty())
			System.out.println("list empty");
		else if (result == true)
			System.out.println("removed " + obj);
		else
			System.out.println("not sure what happened...");
	}
}
import data_structures.*;

public class H_LinearDriver {
	private static LinearListADT<Pokemon> list;
	private static final Pokemon TEST_POKEMON = new Pokemon("eevee");

	public static void main(String[] args) {
		list = new LinearList<Pokemon>();

		emptyListTest();
		oneElementTest();
		twoElementTest();
		threeElementTest();
		emptyListTest();
		largeListTest();		
		failFastTest();
	}
	
	public static Pokemon generatePokemon() {
		return new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1));
	}

	public static void emptyListTest() {
		System.out.println("EMPTY LIST TESTS");
		modifiedRemove(TEST_POKEMON);
		modifiedRemoveFirst();
		modifiedRemoveLast();
		modifiedPeekFirst();
		modifiedPeekLast();
		iterate();
		System.out.println();
	}

	public static void oneElementTest() {
		System.out.println("ONE-ELEMENT LIST TESTS");
		modifiedAddFirst(generatePokemon());
		iterate();
		modifiedRemoveFirst();
		iterate();
		modifiedAddLast(generatePokemon());
		iterate();
		modifiedRemoveLast();
		iterate();
		modifiedAddFirst(TEST_POKEMON);
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedClear();
		System.out.println();
	}

	public static void twoElementTest() {
		System.out.println("TWO-ELEMENT LIST TESTS");
		modifiedAddFirst(generatePokemon());
		modifiedAddLast(TEST_POKEMON);
		iterate();
		modifiedRemoveFirst();
		iterate();
		modifiedAddLast(generatePokemon());
		iterate();
		modifiedRemoveLast();
		iterate();
		modifiedAddLast(generatePokemon());
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedAddLast(TEST_POKEMON);
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedClear();
		System.out.println();
	}

	public static void threeElementTest() {
		System.out.println("THREE-ELEMENT LIST TESTS");
		modifiedAddFirst(generatePokemon());
		modifiedAddFirst(TEST_POKEMON);
		modifiedAddFirst(generatePokemon());
		iterate();
		modifiedRemoveFirst();
		iterate();
		modifiedAddLast(generatePokemon());
		iterate();
		modifiedRemoveLast();
		iterate();
		modifiedAddLast(TEST_POKEMON);
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedAddLast(generatePokemon());
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedAddLast(TEST_POKEMON);
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedClear();
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
		for (Pokemon curr : list)
			if (curr.compareTo(TEST_POKEMON) == 0)
				modifiedRemove(TEST_POKEMON);
	}
	
	public static void modifiedPeekFirst() {
		Pokemon result = list.peekFirst();

		System.out.print("peekFirst result:\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println("found " + result);
		else
			System.out.println("not sure what happened...");
	}

	public static void modifiedPeekLast() {
		Pokemon result = list.peekLast();

		System.out.print("peekLast result:\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println("found " + result);
		else
			System.out.println("not sure what happened...");
	}

	public static void modifiedAddFirst(Pokemon obj) {
		boolean result = list.addFirst(obj);

		System.out.print("addFirst result:\t");
		if (result == true)
			System.out.println("added " + obj);
		else
			System.out.println("not sure what happened...");
	}

	public static void modifiedAddLast(Pokemon obj) {
		boolean result = list.addLast(obj);

		System.out.print("addLast result:\t\t");
		if (result == true)
			System.out.println("added " + obj);
		else
			System.out.println("not sure what happened...");
	}

	public static void modifiedRemoveFirst() {
		Pokemon result = list.removeFirst();

		System.out.print("removeFirst result:\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println("removed " + result);
		else
			System.out.println("not sure what happened...");
	}

	public static void modifiedRemoveLast() {
		Pokemon result = list.removeLast();

		System.out.print("removeLast result:\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println("removed " + result);
		else
			System.out.println("not sure what happened...");
	}

	public static void modifiedRemove(Pokemon obj) {
		Pokemon result = list.remove(obj);

		System.out.print("remove result:\t\t");
		if (result == null && list.isEmpty())
			System.out.println("list empty");
		else if (result != null)
			System.out.println("removed " + result);
		else
			System.out.println(obj + " does not exist in the list");
	}

	public static void modifiedSize() {
		System.out.print("size:\t\t\t");
		System.out.println(list.size());
	}

	public static void iterate() {
		int itemsInLine = 0;

		System.out.print("Should print " + list.size() + " element");
		if (list.size() != 1)
			System.out.print("s");
		if (list.size() != 0)
			System.out.print(" from " + list.peekFirst() + " to " + list.peekLast());
		System.out.println(":");

		for (Pokemon node : list) {
			if (itemsInLine == 10) {
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

	public static void buildList(int listSize) {
		for (int n = 1; n <= listSize; n++)
			list.addFirst(generatePokemon());
	}

	public static void modifiedContains(Pokemon obj) {
		boolean result = list.contains(obj);

		System.out.print("search result:\t\t");
		if (result == true)
			System.out.println("found " + obj);
		else
			System.out.println("couldn't find " + obj);
	}
}
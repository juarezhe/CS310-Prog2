import data_structures.*;

public class H_LinearDriver {
	private static LinearListADT<Pokemon> list;
	private static final Pokemon TEST_POKEMON = new Pokemon("eevee");

	private static class Pokemon implements Comparable<Pokemon> {
		private static final int LAST_POKEMON = 809;
		private static final String[] POKEMON_NAMES = { null, "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon",
				"Charizard", "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle",
				"Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate", "Spearow", "Fearow",
				"Ekans", "Arbok", "Pikachu", "Raichu", "Sandshrew", "Sandslash", "NidoranM", "Nidorina", "Nidoqueen",
				"NidoranF", "Nidorino", "Nidoking", "Clefairy", "Clefable", "Vulpix", "Ninetales", "Jigglypuff",
				"Wigglytuff", "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Venonat",
				"Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian", "Psyduck", "Golduck", "Mankey", "Primeape",
				"Growlithe", "Arcanine", "Poliwag", "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam", "Machop",
				"Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel", "Tentacool", "Tentacruel", "Geodude",
				"Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro", "Magnemite", "Magneton", "Farfetch'd",
				"Doduo", "Dodrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder", "Cloyster", "Gastly", "Haunter",
				"Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb", "Electrode", "Exeggcute",
				"Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan", "Lickitung", "Koffing", "Weezing",
				"Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra", "Goldeen", "Seaking",
				"Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar", "Pinsir", "Tauros",
				"Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Porygon",
				"Omanyte", "Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos", "Moltres",
				"Dratini", "Dragonair", "Dragonite", "Mewtwo", "Mew", "Chikorita", "Bayleef", "Meganium", "Cyndaquil",
				"Quilava", "Typhlosion", "Totodile", "Croconaw", "Feraligatr", "Sentret", "Furret", "Hoothoot",
				"Noctowl", "Ledyba", "Ledian", "Spinarak", "Ariados", "Crobat", "Chinchou", "Lanturn", "Pichu",
				"Cleffa", "Igglybuff", "Togepi", "Togetic", "Natu", "Xatu", "Mareep", "Flaaffy", "Ampharos",
				"Bellossom", "Marill", "Azumarill", "Sudowoodo", "Politoed", "Hoppip", "Skiploom", "Jumpluff", "Aipom",
				"Sunkern", "Sunflora", "Yanma", "Wooper", "Quagsire", "Espeon", "Umbreon", "Murkrow", "Slowking",
				"Misdreavus", "Unown", "Wobbuffet", "Girafarig", "Pineco", "Forretress", "Dunsparce", "Gligar",
				"Steelix", "Snubbull", "Granbull", "Qwilfish", "Scizor", "Shuckle", "Heracross", "Sneasel", "Teddiursa",
				"Ursaring", "Slugma", "Magcargo", "Swinub", "Piloswine", "Corsola", "Remoraid", "Octillery", "Delibird",
				"Mantine", "Skarmory", "Houndour", "Houndoom", "Kingdra", "Phanpy", "Donphan", "Porygon2", "Stantler",
				"Smeargle", "Tyrogue", "Hitmontop", "Smoochum", "Elekid", "Magby", "Miltank", "Blissey", "Raikou",
				"Entei", "Suicune", "Larvitar", "Pupitar", "Tyranitar", "Lugia", "Ho-Oh", "Celebi", "Treecko",
				"Grovyle", "Sceptile", "Torchic", "Combusken", "Blaziken", "Mudkip", "Marshtomp", "Swampert",
				"Poochyena", "Mightyena", "Zigzagoon", "Linoone", "Wurmple", "Silcoon", "Beautifly", "Cascoon",
				"Dustox", "Lotad", "Lombre", "Ludicolo", "Seedot", "Nuzleaf", "Shiftry", "Taillow", "Swellow",
				"Wingull", "Pelipper", "Ralts", "Kirlia", "Gardevoir", "Surskit", "Masquerain", "Shroomish", "Breloom",
				"Slakoth", "Vigoroth", "Slaking", "Nincada", "Ninjask", "Shedinja", "Whismur", "Loudred", "Exploud",
				"Makuhita", "Hariyama", "Azurill", "Nosepass", "Skitty", "Delcatty", "Sableye", "Mawile", "Aron",
				"Lairon", "Aggron", "Meditite", "Medicham", "Electrike", "Manectric", "Plusle", "Minun", "Volbeat",
				"Illumise", "Roselia", "Gulpin", "Swalot", "Carvanha", "Sharpedo", "Wailmer", "Wailord", "Numel",
				"Camerupt", "Torkoal", "Spoink", "Grumpig", "Spinda", "Trapinch", "Vibrava", "Flygon", "Cacnea",
				"Cacturne", "Swablu", "Altaria", "Zangoose", "Seviper", "Lunatone", "Solrock", "Barboach", "Whiscash",
				"Corphish", "Crawdaunt", "Baltoy", "Claydol", "Lileep", "Cradily", "Anorith", "Armaldo", "Feebas",
				"Milotic", "Castform", "Kecleon", "Shuppet", "Banette", "Duskull", "Dusclops", "Tropius", "Chimecho",
				"Absol", "Wynaut", "Snorunt", "Glalie", "Spheal", "Sealeo", "Walrein", "Clamperl", "Huntail",
				"Gorebyss", "Relicanth", "Luvdisc", "Bagon", "Shelgon", "Salamence", "Beldum", "Metang", "Metagross",
				"Regirock", "Regice", "Registeel", "Latias", "Latios", "Kyogre", "Groudon", "Rayquaza", "Jirachi",
				"Deoxys", "Turtwig", "Grotle", "Torterra", "Chimchar", "Monferno", "Infernape", "Piplup", "Prinplup",
				"Empoleon", "Starly", "Staravia", "Staraptor", "Bidoof", "Bibarel", "Kricketot", "Kricketune", "Shinx",
				"Luxio", "Luxray", "Budew", "Roserade", "Cranidos", "Rampardos", "Shieldon", "Bastiodon", "Burmy",
				"Wormadam", "Mothim", "Combee", "Vespiquen", "Pachirisu", "Buizel", "Floatzel", "Cherubi", "Cherrim",
				"Shellos", "Gastrodon", "Ambipom", "Drifloon", "Drifblim", "Buneary", "Lopunny", "Mismagius",
				"Honchkrow", "Glameow", "Purugly", "Chingling", "Stunky", "Skuntank", "Bronzor", "Bronzong", "Bonsly",
				"Mime Jr.", "Happiny", "Chatot", "Spiritomb", "Gible", "Gabite", "Garchomp", "Munchlax", "Riolu",
				"Lucario", "Hippopotas", "Hippowdon", "Skorupi", "Drapion", "Croagunk", "Toxicroak", "Carnivine",
				"Finneon", "Lumineon", "Mantyke", "Snover", "Abomasnow", "Weavile", "Magnezone", "Lickilicky",
				"Rhyperior", "Tangrowth", "Electivire", "Magmortar", "Togekiss", "Yanmega", "Leafeon", "Glaceon",
				"Gliscor", "Mamoswine", "Porygon-Z", "Gallade", "Probopass", "Dusknoir", "Froslass", "Rotom", "Uxie",
				"Mesprit", "Azelf", "Dialga", "Palkia", "Heatran", "Regigigas", "Giratina", "Cresselia", "Phione",
				"Manaphy", "Darkrai", "Shaymin", "Arceus", "Victini", "Snivy", "Servine", "Serperior", "Tepig",
				"Pignite", "Emboar", "Oshawott", "Dewott", "Samurott", "Patrat", "Watchog", "Lillipup", "Herdier",
				"Stoutland", "Purrloin", "Liepard", "Pansage", "Simisage", "Pansear", "Simisear", "Panpour", "Simipour",
				"Munna", "Musharna", "Pidove", "Tranquill", "Unfezant", "Blitzle", "Zebstrika", "Roggenrola", "Boldore",
				"Gigalith", "Woobat", "Swoobat", "Drilbur", "Excadrill", "Audino", "Timburr", "Gurdurr", "Conkeldurr",
				"Tympole", "Palpitoad", "Seismitoad", "Throh", "Sawk", "Sewaddle", "Swadloon", "Leavanny", "Venipede",
				"Whirlipede", "Scolipede", "Cottonee", "Whimsicott", "Petilil", "Lilligant", "Basculin", "Sandile",
				"Krokorok", "Krookodile", "Darumaka", "Darmanitan", "Maractus", "Dwebble", "Crustle", "Scraggy",
				"Scrafty", "Sigilyph", "Yamask", "Cofagrigus", "Tirtouga", "Carracosta", "Archen", "Archeops",
				"Trubbish", "Garbodor", "Zorua", "Zoroark", "Minccino", "Cinccino", "Gothita", "Gothorita",
				"Gothitelle", "Solosis", "Duosion", "Reuniclus", "Ducklett", "Swanna", "Vanillite", "Vanillish",
				"Vanilluxe", "Deerling", "Sawsbuck", "Emolga", "Karrablast", "Escavalier", "Foongus", "Amoonguss",
				"Frillish", "Jellicent", "Alomomola", "Joltik", "Galvantula", "Ferroseed", "Ferrothorn", "Klink",
				"Klang", "Klinklang", "Tynamo", "Eelektrik", "Eelektross", "Elgyem", "Beheeyem", "Litwick", "Lampent",
				"Chandelure", "Axew", "Fraxure", "Haxorus", "Cubchoo", "Beartic", "Cryogonal", "Shelmet", "Accelgor",
				"Stunfisk", "Mienfoo", "Mienshao", "Druddigon", "Golett", "Golurk", "Pawniard", "Bisharp", "Bouffalant",
				"Rufflet", "Braviary", "Vullaby", "Mandibuzz", "Heatmor", "Durant", "Deino", "Zweilous", "Hydreigon",
				"Larvesta", "Volcarona", "Cobalion", "Terrakion", "Virizion", "Tornadus", "Thundurus", "Reshiram",
				"Zekrom", "Landorus", "Kyurem", "Keldeo", "Meloetta", "Genesect", "Chespin", "Quilladin", "Chesnaught",
				"Fennekin", "Braixen", "Delphox", "Froakie", "Frogadier", "Greninja", "Bunnelby", "Diggersby",
				"Fletchling", "Fletchinder", "Talonflame", "Scatterbug", "Spewpa", "Vivillon", "Litleo", "Pyroar",
				"Flabébé", "Floette", "Florges", "Skiddo", "Gogoat", "Pancham", "Pangoro", "Furfrou", "Espurr",
				"Meowstic", "Honedge", "Doublade", "Aegislash", "Spritzee", "Aromatisse", "Swirlix", "Slurpuff",
				"Inkay", "Malamar", "Binacle", "Barbaracle", "Skrelp", "Dragalge", "Clauncher", "Clawitzer",
				"Helioptile", "Heliolisk", "Tyrunt", "Tyrantrum", "Amaura", "Aurorus", "Sylveon", "Hawlucha", "Dedenne",
				"Carbink", "Goomy", "Sliggoo", "Goodra", "Klefki", "Phantump", "Trevenant", "Pumpkaboo", "Gourgeist",
				"Bergmite", "Avalugg", "Noibat", "Noivern", "Xerneas", "Yveltal", "Zygarde", "Diancie", "Hoopa",
				"Volcanion", "Rowlet", "Dartrix", "Decidueye", "Litten", "Torracat", "Incineroar", "Popplio", "Brionne",
				"Primarina", "Pikipek", "Trumbeak", "Toucannon", "Yungoos", "Gumshoos", "Grubbin", "Charjabug",
				"Vikavolt", "Crabrawler", "Crabominable", "Oricorio", "Cutiefly", "Ribombee", "Rockruff", "Lycanroc",
				"Wishiwashi", "Mareanie", "Toxapex", "Mudbray", "Mudsdale", "Dewpider", "Araquanid", "Fomantis",
				"Lurantis", "Morelull", "Shiinotic", "Salandit", "Salazzle", "Stufful", "Bewear", "Bounsweet",
				"Steenee", "Tsareena", "Comfey", "Oranguru", "Passimian", "Wimpod", "Golisopod", "Sandygast",
				"Palossand", "Pyukumuku", "Type: Null", "Silvally", "Minior", "Komala", "Turtonator", "Togedemaru",
				"Mimikyu", "Bruxish", "Drampa", "Dhelmise", "Jangmo-o", "Hakamo-o", "Kommo-o", "Tapu Koko", "Tapu Lele",
				"Tapu Bulu", "Tapu Fini", "Cosmog", "Cosmoem", "Solgaleo", "Lunala", "Nihilego", "Buzzwole",
				"Pheromosa", "Xurkitree", "Celesteela", "Kartana", "Guzzlord", "Necrozma", "Magearna", "Marshadow",
				"Poipole", "Naganadel", "Stakataka", "Blacephalon", "Zeraora", "Meltan", "Melmetal" };
		private int mNumber;
		private String mName;

		/*
		 * Constructor - creates new Pokemon using National Pokedex number
		 */
		public Pokemon(int number) {
			if (number < 1 || number > 809)
				throw new RuntimeException("No such Pokemon.");
			this.mNumber = number;
			this.mName = POKEMON_NAMES[number];
		}

		/*
		 * Constructor - creates new Pokemon using name (capitalization doesn't matter)
		 */
		public Pokemon(String name) {
			int idx;
			for (idx = 1; idx <= LAST_POKEMON; idx++) {
				if (POKEMON_NAMES[idx].toLowerCase().compareTo(name.toLowerCase()) == 0)
					break;
			}
			if (idx == LAST_POKEMON + 1)
				throw new RuntimeException("No such Pokemon.");
			else {
				this.mNumber = idx;
				this.mName = POKEMON_NAMES[idx];
			}
		}

		/*
		 * (non-Javadoc)
		 * @see java.lang.Object#toString()
		 * Output: [###-Name]
		 */
		@Override
		public String toString() {
			String stringToReturn = "[" + this.mNumber + "-" + this.mName + "]";
			return stringToReturn;
		}

		@Override
		public int compareTo(Pokemon o) {
			if (this.mNumber < o.mNumber)
				return -1;
			if (this.mNumber > o.mNumber)
				return 1;
			return 0;
		}
	}

	public static void main(String[] args) {
		list = new LinearList<Pokemon>();

		emptyListTest();
		oneElementTest();
		twoElementTest();
		threeElementTest();
		largeListTest();
		emptyListTest();
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
		modifiedAddFirst(new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1)));
		iterate();
		modifiedRemoveFirst();
		iterate();
		modifiedAddLast(new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1)));
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
		modifiedAddFirst(new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1)));
		modifiedAddFirst(new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1)));
		iterate();
		modifiedRemoveLast();
		iterate();
		modifiedAddLast(new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1)));
		iterate();
		modifiedRemoveFirst();
		iterate();
		modifiedAddFirst(TEST_POKEMON);
		iterate();
		modifiedRemove(TEST_POKEMON);
		iterate();
		modifiedClear();
		System.out.println();
	}

	public static void threeElementTest() {
		System.out.println("THREE-ELEMENT LIST TESTS");
		modifiedAddFirst(new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1)));
		modifiedAddFirst(TEST_POKEMON);
		modifiedAddFirst(new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1)));
		iterate();
		modifiedRemoveFirst();
		modifiedAddLast(new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1)));
		iterate();
		modifiedRemoveLast();
		modifiedAddFirst(new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1)));
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
		while (list.contains(TEST_POKEMON))
			modifiedRemove(TEST_POKEMON);
		modifiedClear();
		System.out.println();
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
			list.addFirst(new Pokemon((int) Math.floor(Math.random() * (Pokemon.LAST_POKEMON - 1) + 1)));
	}

	public static void modifiedContains(Pokemon obj) {
		boolean result = list.contains(obj);

		System.out.print("search result:\t\t");
		if (result == true)
			System.out.println(obj + " successfully found");
		else
			System.out.println(obj + " could not be found");
	}
}
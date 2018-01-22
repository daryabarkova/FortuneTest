package by.htp.fortuneCollectionUsing.logic;

import java.util.*;

import by.htp.fortuneCollectionUsing.bean.Bud;
import by.htp.fortuneCollectionUsing.bean.Flower;

public class Fortune {

	private Map<String, String[]> fortuneIvents;
	private int chosenIventValue;
	private String chosenIventTitle;
	private Bud bud;
	
	public Fortune() {} // DB: constructor is added

	public Fortune(Flower flower, Map<String, String[]> fortuneIvents) { //DB: Map<String, String[]> fortuneIvents initialization is removed to separate static method setFortuneIvents()
		this.bud = flower.getBud();
		this.fortuneIvents = fortuneIvents;
	}

	public int getChosenIventValue() { // DB: getter is added for chosenIventValue
		return chosenIventValue;
	}

	public void setChosenIventValue(int chosenIventValue) { // DB: // DB: setter is added for chosenIventValue
		this.chosenIventValue = chosenIventValue;
	}

	public String getChosenIventTitle() { // DB: getter is added for chosenIventTitle
		return chosenIventTitle;
	}

	public void setChosenIventTitle(String chosenIventTitle) { // DB: setter is added for chosenIventTitle
		this.chosenIventTitle = chosenIventTitle;
	}

	public Map<String, String[]> getFortuneIvents() { // DB: getter is added for fortuneIvents
		return fortuneIvents;
	}

	public void setFortuneIvents(Map<String, String[]> fortuneIvents) { // DB: setter is added for fortuneIvents
		this.fortuneIvents = fortuneIvents;
	}
	
	public static void setFortuneTypes(Map<String, String[]> fortuneIvents) { // DB: separate method is created, HashMap<String, String[]>() initialization is removed from constructor
		fortuneIvents.put(new String("love"), new String[] { "loves", "almost loves", "does not love", "neutral" });
		fortuneIvents.put(new String("lucky"), new String[] { "lucky", "failure", "great luck", "luck is somewhere hear" });
		fortuneIvents.put(new String("present"), new String[] { "car", "flat", "movie ticket", "$1M", "consolation prize" });
	}
	
	@Override // DB: toString override is added for Fortune
	public String toString() {
		return "Fortune [fortuneIvents=" + fortuneIvents + ", chosenIventValue=" + chosenIventValue
				+ ", chosenIventTitle=" + chosenIventTitle + ", bud=" + bud + "]";
	}

	public void printFortuneIvents() {
		int i = 1;
		// Iterator it = fortuneIvents.entrySet().iterator();
		for (Map.Entry<String, String[]> ivent : fortuneIvents.entrySet()) {
			System.out.print(i + ": " + ivent.getKey().toUpperCase() + "-> ");
			for (String str : ivent.getValue()) {
				System.out.print(str + "| ");
			}
			i++;
			System.out.println();
		}
	}

	public void readChoiceToFortune() {
		int i = 1;
		System.out.print("Please, make a choise (1 - " + fortuneIvents.size() + "): ");
		Scanner sc = new Scanner(System.in);
		this.chosenIventValue = sc.nextInt();
		if (sc != null) {
			sc.close();
		}
		for (Map.Entry<String, String[]> ivent : fortuneIvents.entrySet()) {
			if (i == chosenIventValue) {
				this.chosenIventTitle = ivent.getKey();
				break;
			}
			i++;
		}
		System.out.println("\nFortune for " + chosenIventTitle.toUpperCase());
	}

	public String printResultOfFortune() {
		String[] options = fortuneIvents.get(this.chosenIventTitle); // DB: return operator is added
		int j = 0;
		for (int i = 0; i < bud.getLeaves().length; i++) {
			bud.getLeaves()[i] = null;
			if (j == options.length) {
				j = 0;
			}
			j++;
		}
		String result = options[((j == 0) ? 0 : j - 1)]; 
		System.out.println("\nYour result is: " + options[((j == 0) ? 0 : j - 1)].toUpperCase() + "!");
		return result;
	}

}

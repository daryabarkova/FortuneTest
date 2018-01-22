package by.htp.fortuneCollectionUsing.runner;

import java.util.HashMap;
import java.util.Map;

import by.htp.fortuneCollectionUsing.bean.Flower;
import by.htp.fortuneCollectionUsing.bean.Stem;
import by.htp.fortuneCollectionUsing.logic.BotanicEncyclopedia;
import by.htp.fortuneCollectionUsing.logic.Fortune;

public class MainApp {

	public static void main(String[] args) {

		BotanicEncyclopedia enc = new BotanicEncyclopedia();
		Flower flower = new Flower("Cammomile", 10, 1);

		System.out.println("Flower bloom");
		flower.bloom(8, "yellow");
		enc.printFlowerInfo(flower);
		
		System.out.println("\nFortune options:");
		
		HashMap<String, String[]> fortuneIvents = new HashMap<String, String[]>();
		Fortune.setFortuneTypes(fortuneIvents);
		
		Fortune fort = new Fortune(flower, fortuneIvents);
		fort.printFortuneIvents();
		System.out.println();
		fort.readChoiceToFortune();
		fort.printResultOfFortune();
		enc.printLeaves(flower.getBud());

	}

}

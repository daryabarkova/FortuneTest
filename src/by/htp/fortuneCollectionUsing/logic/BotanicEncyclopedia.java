package by.htp.fortuneCollectionUsing.logic;

import by.htp.fortuneCollectionUsing.bean.Bud;
import by.htp.fortuneCollectionUsing.bean.Flower;
import by.htp.fortuneCollectionUsing.bean.Leaf;

public class BotanicEncyclopedia {

	private boolean isArrEmpty;

	public void printFlowerInfo(Flower flower) {
		System.out.println("Title: " + flower.getTitle());
		System.out.println("bud size, color: " + flower.getBud().getSize() + ", " + flower.getBud().getColor());
		System.out.println(
				"stem height, weight: " + flower.getStem().getHeight() + ", " + flower.getStem().getWidth() + "\n");
		printLeaves(flower.getBud());
	}

	public void printLeaves(Bud bud) {
		Leaf[] leaves = bud.getLeaves();
		if (bud != null && bud.getLeaves() != null) {
			isArrEmpty = true;
			for (Leaf leaf : leaves) {
				if (leaf != null) {
					isArrEmpty = false;
					break;
				}
			}
			if (isArrEmpty == false) {
				System.out.println("Cammomile has " + bud.getLeaves().length + " leaves:");
				for (Leaf leaf : leaves) {
					if (leaf != null) {
						System.out.println("leaf color: " + leaf.getColor() + "; shape: " + leaf.getShape());
					}
				}
			} else {
				System.out.println("\nAll leaves were pulled out");
			}
		}
	}

}

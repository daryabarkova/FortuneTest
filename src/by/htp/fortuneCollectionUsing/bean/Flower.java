package by.htp.fortuneCollectionUsing.bean;

/* Создать класс Цветок, используя классы Лепесток, Стебель
 */

public class Flower {

	private String title;
	private Bud bud;
	private Stem stem;
	
	public Flower() {} // DB: constructor is added

	public Flower(String title, int stemH, int stemW) {

		this.title = title;
		stem = new Stem(stemH, stemW);
		bud = new Bud();

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Bud getBud() {
		return bud;
	}

	public void setBud(Bud bud) {
		this.bud = bud;
	}

	public Stem getStem() {
		return stem;
	}

	public void setStem(Stem stem) {
		this.stem = stem;
	}

	public void grow(int newStemH, int newStemW, int newBudSize) {
		this.stem.setHeight(newStemH);
		this.stem.setWidth(newStemW);
		bud.setSize(newBudSize);
	}

	public void bloom(int newBudSize, String newBudColor) {
		bud.setSize(newBudSize);
		bud.setColor(newBudColor);
		bud.addFreshLeaves((2 + (int) (Math.random() * 8)), "White", "ellipse");
	}

	public void wither(int witheredLeavesSize) {
		bud.setSize(bud.getSize() - 2);
		stem.setWidth(stem.getWidth() - 1);
		stem.setHeight(stem.getHeight() - 1);
		bud.getWitherBud(witheredLeavesSize);
	}

}

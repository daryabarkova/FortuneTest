package by.htp.fortuneCollectionUsing.bean;

public class Bud {

	private static final String DEFAUL_BUD_COLOR = "green";
	private static final int DEFAUL_BUD_SIZE = 1;

	private String color;
	private int size;
	private Leaf[] leaves;

	Bud() {
		color = DEFAUL_BUD_COLOR;
		size = DEFAUL_BUD_SIZE;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void addFreshLeaves(int leafNubmer, String leafColor, String leafShape) {
		if (leaves == null) {
			leaves = new Leaf[leafNubmer];
			for (int i = 0; i < leaves.length; i++) {
				leaves[i] = new Leaf(leafColor, leafShape);
			}
		}
	}

	void getWitherBud(int witheredLeafNubmer) {
		for (int i = 0; i < witheredLeafNubmer; i++) {
			leaves[i] = null;
		}
}

	public Leaf[] getLeaves() {
		return leaves;
	}

}
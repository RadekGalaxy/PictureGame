

public class Item {
	private String jmeno;
	private int hmotnost;
	private ItemType typ;
	
	public Item(String jmeno, int hmotnost, ItemType typ) {
		this.jmeno = jmeno;
		this.hmotnost = hmotnost;
		this.typ = typ;
	}
	
	public ItemType getTyp() {
		return typ;
	}
	public void setTyp(ItemType typ) {
		this.typ = typ;
	}
	public int getHmotnost() {
		return hmotnost;
	}

	@Override
	public String toString() {
		return jmeno + " - " + hmotnost + "kg";
	}
}

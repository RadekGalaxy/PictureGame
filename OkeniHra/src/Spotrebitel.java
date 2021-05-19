

public class Spotrebitel {
	private String jmeno;
	private int hmotnost;
	private SpotrebitelskeItems typ;
		

	public Spotrebitel(String jmeno, int hmotnost, SpotrebitelskeItems typ) {
		super();
		this.jmeno = jmeno;
		this.hmotnost = hmotnost;
		this.typ = typ;
	}
	public SpotrebitelskeItems getTyp() {
		return typ;
	}
	public void setTyp(SpotrebitelskeItems typ) {
		this.typ = typ;
	}
	public int getHmotnost() {
		return hmotnost;
	}

	@Override
	public String toString() {
		return jmeno + " - " + hmotnost + "g";
	}
}

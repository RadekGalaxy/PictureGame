import java.util.HashMap;

public class Predmet {
	private int id;
	private String nazev;
	private int hmotnost;
	public Predmet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Predmet(int id, String nazev, int hmotnost) {
		super();
		this.id = id;
		this.nazev = nazev;
		this.hmotnost = hmotnost;
	}
	public Predmet(String nazev, int hmotnost) {
		super();
		this.nazev = nazev;
		this.hmotnost = hmotnost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public int getHmotnost() {
		return hmotnost;
	}
	public void setHmotnost(int hmotnost) {
		this.hmotnost = hmotnost;
	}
	@Override
	public String toString() {
		return "Predmet [ " + nazev + ", " + hmotnost + "Kg ]  ";
	}
	HashMap<Integer, Predmet> predmety = new HashMap<Integer, Predmet>();
	
}

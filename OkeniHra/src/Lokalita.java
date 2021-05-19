
public class Lokalita {
	private String nazev;
	private int id;
	int[] smery = new int[4]; 
	
	public Lokalita(String nazev, int id){
		this.nazev = nazev;
		this.id = id;
	}
	public void pripojLokalitu(int smer, int kam) {    
		smery[smer] = kam;
	}
	public String toString() {
		return nazev;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSmer(int smer) { 
		return smery[smer];
	}	
}

public class NPC {
	private int id;
	private int zivoty;
	private int utok;
	
	public NPC() {
		super();
	}
	public NPC(int id, int zivoty, int utok) {
		super();
		this.id = id;
		this.zivoty = zivoty;
		this.utok = utok;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getZivoty() {
		return zivoty;
	}
	public void setZivoty(int zivoty) {
		this.zivoty = zivoty;
	}
	public int getUtok() {
		return utok;
	}
	public void setUtok(int utok) {
		this.utok = utok;
	}
	@Override
	public String toString() {
		return "NPC [ " + zivoty + "HP, utok= " + utok + "]  ";
	}
}

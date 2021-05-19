

public class Postava {
	private String jmeno;
	private String chrakter;
	private Equipment equipment;
	private Inventory inventory;
	
	public Postava() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Postava(String jmeno, String chrakter, Equipment equipment, Inventory inventory) {
		super();
		this.jmeno = jmeno;
		this.chrakter = chrakter;
		this.equipment = equipment;
		this.inventory = inventory;
	}
	public String getJmeno() {
		return jmeno;
	}
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	public String getChrakter() {
		return chrakter;
	}
	public void setChrakter(String chrakter) {
		this.chrakter = chrakter;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	@Override
	public String toString() {
		return "Postava \n"
				+ " jmeno= " + jmeno + "\n chrakter= " + chrakter + "\n \n equipment= " + equipment + "\n inventory="
				+ inventory + "";
	}
	
	
}

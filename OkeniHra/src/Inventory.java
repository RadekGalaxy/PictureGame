

import java.util.HashMap;
/**
 * 
 * @author radak
 *	v teto tride mam nastaveno pocet itemu v inventory na jenom jeden od kazdeho druhu
 */
public class Inventory {
	private HashMap<SpotrebitelskeItems, Spotrebitel> inventory = new HashMap<>();

	public Inventory() {
		inventory.put(SpotrebitelskeItems.Maso, null);
		inventory.put(SpotrebitelskeItems.Pecivo, null);
		inventory.put(SpotrebitelskeItems.Leky, null);
		inventory.put(SpotrebitelskeItems.Lektvar, null);
	}
	
	public Spotrebitel addInv(Spotrebitel spotrebitel) {
		return inventory.put(spotrebitel.getTyp(), spotrebitel);
	}
	public Spotrebitel inEquipment(SpotrebitelskeItems type) {
		return inventory.get(type);
	}

	@Override
	public String toString() {
		String vypis = "Výstroj:\n";
		for(SpotrebitelskeItems type : inventory.keySet()) {
			vypis += type.printSpotrebitelItem() +": "+inventory.get(type).toString()+"\n";
		}
		return vypis;
	}
}
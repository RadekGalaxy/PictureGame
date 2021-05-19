

import java.util.HashMap;
/**
 * 
 * @author radak
 *	v teto tride mam nastaveno pocet itemu v equipment na jenom jeden od kazdeho druhu
 */
public class Equipment {
	private HashMap<ItemType, Item> equipment = new HashMap<>();

	public Equipment() {
		equipment.put(ItemType.Zbran, null);
		equipment.put(ItemType.Stit, null);
		equipment.put(ItemType.Brnko, null);
		equipment.put(ItemType.Amulet, null);
	}
	
	public Item add(Item item) {
		return equipment.put(item.getTyp(), item);
	}
	
	public Item inEquipment(ItemType type) {
		return equipment.get(type);
	}

	@Override
	public String toString() {
		String vypis = "Výstroj:\n";
		for(ItemType type : equipment.keySet()) {
			vypis += type.printItemType() +": "+equipment.get(type).toString()+"\n";
		}
		return vypis;
	}
}
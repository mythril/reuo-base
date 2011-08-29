package reuo.event;

import reuo.Item;

public interface ItemListener extends InventoryListener{
	public void itemActivated(Item item);
	public void itemDestroyed(Item item);
}

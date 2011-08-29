package reuo;

import java.nio.ByteBuffer;

public class Item extends Element{
	protected int x, y;
	protected int artwork;
	protected int stackId;
	protected int container;
	protected int hue;
	
	protected Item(){}

	public Item(ByteBuffer buffer){
		id = buffer.getInt();
		artwork = buffer.getShort();
		stackId = buffer.get();
		x = buffer.getShort();
		y = buffer.getShort();
		container = buffer.getInt();
		hue = buffer.getShort();
	}
}

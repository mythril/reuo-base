package reuo.event;

import reuo.Mobile;

public interface MobileListener{
	public void mobileCreated(Mobile mob);
	public void mobileDestroyed(Mobile mob);
	public void mobileMoved(Mobile mob);
}

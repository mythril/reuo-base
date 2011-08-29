package reuo.util;


public class Partition extends Rect{
	Partition parent;
	
	public Partition allocate(int width, int height){
		return null;
	}
	
	public void free(){
		if(parent == null){
			return;
		}
	}
}
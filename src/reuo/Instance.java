package reuo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@SuppressWarnings("unchecked")
public abstract class Instance{
	Map<Class, Map<Integer, ?>> elementsByClass;
	Map listeners;
	
	
	private <T> Map<Integer, T> getIndex(Class<T> c){
		Map<Integer, T> map = (Map<Integer, T>)elementsByClass.get(c);
		
		if(map == null){
			map = new HashMap<Integer, T>();
			elementsByClass.put(c, map);
		}
		
		return(map);
	}
	
	public <T> T get(Class<T> c, int id){
		return(getIndex(c).get(id));
	}
	
	public <T> Iterator<T> iterator(Class<T> c){
		return(getIndex(c).values().iterator());
	}
	
	public <T> void put(int id, T obj){
		Class c = obj.getClass();
		
		getIndex(c).put(id, obj);
	}
}
package reuo;


public abstract class Request<R>{
	
	public abstract boolean hasResponse();
	public abstract void getResponse();
}

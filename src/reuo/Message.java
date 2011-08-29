package reuo;

import java.nio.ByteBuffer;


public abstract class Message{
	protected static ByteBuffer itemBuffer = ByteBuffer.allocate(19);
	protected int id;
	protected Instance instance;
	
	public Message(){
		
	}
	
	protected Message(int id, Instance instance){
		this.id = id;
		this.instance = instance;
	}
}

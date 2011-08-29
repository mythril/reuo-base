package reuo;

public enum Gender{
	MALE,
	FEMALE;
	
	public static Gender fromId(int id){
		if(id == 0) return(MALE);
		return(FEMALE);
	}
}

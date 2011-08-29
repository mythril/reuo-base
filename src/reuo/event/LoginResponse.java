package reuo.event;

/**
 * Describes a response from the Login Server. Unless the value is
 * OK the login failed. 
 * @author Kristopher Ives
 */
public enum LoginResponse{
	INVALID_ACCOUNT,
	IN_USE,
	BLOCKED,
	UNKNOWN_ACCOUNT,
	DATA_ERROR,
	SERVER_FULL,
	TIMEOUT,
	GENERAL,
	OK;
}

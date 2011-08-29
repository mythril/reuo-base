package reuo.event;

/**
 * Describes a response from the Shard to login with the selected character. Any value
 * except {@link #OK} describes an error.
 * @author Kristopher Ives
 */
public enum ShardLoginResponse{
	INVALID_PASSWORD,
	CHARACTER_DELETED,
	CHARACTER_TAKEN,
	UNKNOWN1, UNKNOWN2,
	LOGGED_IN,
	SYNC_ERROR,
	TIMEOUT,
	TRANSFER,
	OK;
}

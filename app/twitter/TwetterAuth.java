/**
 * 
 */
package twitter;

/**
 * 20160519-AtividadeFinal-Twitter / TwetterAuth.java
 * FIAP / RM30222 - Vagner Panarello
 */
public enum TwetterAuth {
	
	/* Insert here your personal "Consumer Key (API Key)" from Twitter */
	API_KEY("xxx"),
	/* Insert here your personal "Consumer Secret (API Secret)" from Twitter */
	API_SECRET("xxx"),
	/* Insert here your personal "Access Token" from Twitter */
	ACCESS_TOKEN("xxx"),
	/* Insert here your personal "Access Token Secret" from Twitter */
	ACCESS_TOKEN_SECRET("xxx"),
	
	
	/* Insert here your name "Owner"  from Twitter */
	OWNER("xxx"),
	/* Insert here your "Owner ID" from Twitter */
	OWNER_ID("xxx");
	
	private String key;

	/**
	 * @param arg0
	 */
	private TwetterAuth(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}

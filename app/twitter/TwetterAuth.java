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
	API_KEY("7a1Xsmki44SiWq7lgzGzSrhW8"),
	/* Insert here your personal "Consumer Secret (API Secret)" from Twitter */
	API_SECRET("a9OU88s5PQ41UlWFFu0ZRxqZKmAzKWK4qMYhoJpAjjcJGkP7hP"),
	/* Insert here your personal "Access Token" from Twitter */
	ACCESS_TOKEN("469755089-6jRLw61dINKgdbnswQBEpiXJgVPCvlHjhDdgvDej"),
	/* Insert here your personal "Access Token Secret" from Twitter */
	ACCESS_TOKEN_SECRET("ik1dQq8MO9auRxjdITGE5dTSqboEjINZyjFuoZlaXD9Jb"),
	
	
	/* Insert here your name "Owner"  from Twitter */
	OWNER("ViniciusDuart37"),
	/* Insert here your "Owner ID" from Twitter */
	OWNER_ID("469755089");
	
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

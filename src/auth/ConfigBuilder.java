package auth;

import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class ConfigBuilder {
	private static Configuration config;
	
	/* Enter your actual KEYS from Twitter Account */

	private static final String API_KEY = "";
	private static final String API_SECRET = "";
	private static final String ACCESS_TOKEN = "";
	private static final String ACCESS_SECRET = "";
	
	static {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey(API_KEY);
		cb.setOAuthConsumerSecret(API_SECRET);
		cb.setOAuthAccessToken(ACCESS_TOKEN);
		cb.setOAuthAccessTokenSecret(ACCESS_SECRET);
		config = cb.build();
	}
	
	public static Configuration getConfig() {
		return config;
	}
}

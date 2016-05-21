package app;

import java.util.ArrayList;
import java.util.List;

import twitter.TwetterAuth;
import twitter.TwitterDef;
import twitter4j.*;

/**
 * 20160519-AtividadeFinal-Twitter / FrontEnd.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class FrontEnd {
	
	
	public static void main(String[] args) {
		
		TwitterDef t = new TwitterDef();
		
		/*try {
			
			t.getTweet().updateStatus("Olá Twitter! ");
			
		} catch (TwitterException e) {
			e.printStackTrace();
		}
		
		System.out.println("Test Main");
		*/
		
		try {
			
			Query query = new Query("java");
			query.setSince("2016-05-08");
			query.setUntil("2016-05-14");
			QueryResult result;
			int contador=0;
			List<Usuarios> usuarios = new ArrayList<>();
			result = t.getTweet().search(query);
			while (result.hasNext())
			{
				query = result.nextQuery();
				for (Status status : result.getTweets()) {
					contador++;
					//System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
					
					Usuarios usuario =  new Usuarios(status.getUser().getScreenName(), status.getText(), status.getCreatedAt());
					usuarios.add(usuario);
					//System.out.println("Número de Favoritos: " + status.getFavoriteCount());
					//System.out.println("Lugar: " + status.getPlace());
					//System.out.println("Número de Retweets: " + status.getRetweetCount());

				}
				result = t.getTweet().search(query);
			}
			
			usuarios.sort();
			
			System.out.println("Tag java:"+contador+" tweets");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

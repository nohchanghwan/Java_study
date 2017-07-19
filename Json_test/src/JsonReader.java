import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {

	  private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }

	  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));	      
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);

	      return json;
	    }/*catch(Exception e){
	    	e.setStackTrace(null);
	    }*/
	    finally {
	      is.close();
	    }
	  }
	  
	  public static void main(String[] args) throws IOException, JSONException {
	    JSONObject json = readJsonFromUrl("https://blockchain.info/ko/ticker");
	    System.out.println(json.toString());
	    System.out.println("----------------------------------------------------------------------");
	    System.out.println("한국:"+json.get("KRW"));
	    System.out.println("달러:"+json.get("USD"));
	    System.out.println("일본:"+json.get("JPY"));
	    System.out.println("유로:"+json.get("EUR"));
	    System.out.println("중꿔:"+json.get("CHF"));
	  }
	}

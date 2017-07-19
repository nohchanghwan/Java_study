import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

public class JsonParserTest2 {

	public static void main(String[] args) throws IOException, ParseException  {
		
		URL url = new URL("https://blockchain.info/ko/ticker");
	
		// 한글 처리를 위해 InputStreamReader를 UTF-8 인코딩으로 감싼다
		InputStreamReader isr = new InputStreamReader(url.openConnection().getInputStream(), "UTF-8");
		// JSON을 Parsing 한다. 문법오류가 날 경우 Exception 발생, without Exception -> parse 메소드
		JSONObject object = (JSONObject)JSONValue.parseWithException(isr);
		// 객체
		JSONObject channel = (JSONObject)(object.get("channel"));
		// item 배열
		JSONArray items = (JSONArray)channel.get("item");
		for(int i = 0 ; i < items.size(); i++) {
		JSONObject obj1 = (JSONObject)items.get(i);        
		System.out.println(obj1.get("title").toString());
		}
	}

}

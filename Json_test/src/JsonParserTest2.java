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
	
		// �ѱ� ó���� ���� InputStreamReader�� UTF-8 ���ڵ����� ���Ѵ�
		InputStreamReader isr = new InputStreamReader(url.openConnection().getInputStream(), "UTF-8");
		// JSON�� Parsing �Ѵ�. ���������� �� ��� Exception �߻�, without Exception -> parse �޼ҵ�
		JSONObject object = (JSONObject)JSONValue.parseWithException(isr);
		// ��ü
		JSONObject channel = (JSONObject)(object.get("channel"));
		// item �迭
		JSONArray items = (JSONArray)channel.get("item");
		for(int i = 0 ; i < items.size(); i++) {
		JSONObject obj1 = (JSONObject)items.get(i);        
		System.out.println(obj1.get("title").toString());
		}
	}

}
package refactoring_study.remove_control_flag_simple_database4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleDatabase { //83p
	private Map<String, String> map = new HashMap<>();
	private static Pattern pattern = Pattern.compile("([^=]+)=(.*)");
			//static은 빼도 상관없음
	
	public SimpleDatabase(Reader r) throws IOException {
		BufferedReader reader = new BufferedReader(r);
		while (true) {
			String line = reader.readLine();
			
			if(line == null) {
				break;
			}
			
			Matcher matcher = pattern.matcher(line);
			if(matcher.matches()) {
				String key = matcher.group(1);
				String value = matcher.group(2);
				map.put(key, value);
			}
		}
	}

	public void putValue(String key, String value) {
		map.put(key, value);
	}

	public String getValue(String key) {
		return map.get(key);
	}

	public Iterator<String> iterator() {
		return map.keySet().iterator();
	}
}

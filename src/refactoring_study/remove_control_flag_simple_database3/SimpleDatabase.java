package refactoring_study.remove_control_flag_simple_database3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase { //74p
	private Map<String, String> map = new HashMap<>();

	public SimpleDatabase(Reader r) throws IOException {
		BufferedReader reader = new BufferedReader(r);
		boolean reading = false;
		String line;
		while ((line = reader.readLine()) != null) {
			int equalIndex = line.indexOf("=");
			if(equalIndex > 0) {
				String key = line.substring(0, equalIndex);
				String value = line.substring(equalIndex+1);
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

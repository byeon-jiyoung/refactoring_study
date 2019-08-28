package refactoring_study.remove_control_flag_simple_database4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

public class Main { //75p
	public static void main(String[] args) {
        try {
        	//resources폴더 안에 파일이 존재할 경우
//          String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
//          SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
            
        	//프로젝트 안에 파일이 존재할 경우
            SimpleDatabase db = new SimpleDatabase(new FileReader("dbfile.txt"));
            Iterator<String> iterator = db.iterator();
            while(iterator.hasNext()) {
                String key = iterator.next();
                System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        loadProperties();
    }

	private static void loadProperties() {
		// SimpleDatabase -> Properties로 변경. 훨씬 간단한 방법. (이래서 API를 많이 알고 있는게 좋대)
		String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
		Properties properties = new Properties();
		
		try(FileReader reader = new FileReader(fileUrl)) {
			properties.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Entry<Object, Object> e : properties.entrySet()) {
			System.out.printf("KEY : %s%nVALUE : %s%n%n", e.getKey(), e.getValue());
		}
	}
}

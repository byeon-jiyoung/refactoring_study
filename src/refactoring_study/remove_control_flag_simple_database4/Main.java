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
        	//resources���� �ȿ� ������ ������ ���
//          String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
//          SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
            
        	//������Ʈ �ȿ� ������ ������ ���
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
		// SimpleDatabase -> Properties�� ����. �ξ� ������ ���. (�̷��� API�� ���� �˰� �ִ°� ����)
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

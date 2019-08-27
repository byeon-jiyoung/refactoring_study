package refactoring_study.remove_control_flag_simple_database;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
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
    }
}

package Service;

import java.util.ResourceBundle;

public class TestDataReader {
    private static ResourceBundle bundle=ResourceBundle.getBundle("item");
    public static String getTestData(String key){
        return bundle.getString(key);

    }
}

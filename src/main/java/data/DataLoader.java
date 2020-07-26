package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataLoader {
    private static Properties property;

    static {
        property = new Properties();
        try {
            property.load(new FileInputStream("src/main/resources/prop.properties"));
            property.load(new FileInputStream("src/main/resources/testdata.properties"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return property.getProperty(key);
    }
}

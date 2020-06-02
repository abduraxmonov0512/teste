package helpers;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigHelper {
    Properties property = new Properties();
    FileInputStream fis;

    private void loadUserConfig(){
        try {
            fis = new FileInputStream("src/test/resources/UserConfig.properties");
            property.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getLoginUser(){
        loadUserConfig();
        return property.getProperty("login");
    }

    public String getPasswordUser(){
        loadUserConfig();
        return property.getProperty("password");
    }

}

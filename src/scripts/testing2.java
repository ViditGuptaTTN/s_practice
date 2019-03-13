package scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testing2 {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        File f= new File("/home/ttn/IdeaProjects/s_practice/src/scripts/abc.properties");
        FileInputStream fip= new FileInputStream(f);
        prop.load(fip);
        System.out.println(prop.getProperty("s_name"));
    }
}

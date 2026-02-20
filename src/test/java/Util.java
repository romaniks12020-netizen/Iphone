import org.openqa.selenium.devtools.v143.filesystem.model.File;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Util {
    public static String getResourcePath (String resourceName){
        ClassLoader classLoader = PageLogin.class.getClassLoader();
        URL resource = classLoader.getResource(resourceName);
        if (resource == null){
            return "Такой файл не найден";
        }
        return Paths.get(resource.getFile()).toFile().getAbsolutePath();
    }
}
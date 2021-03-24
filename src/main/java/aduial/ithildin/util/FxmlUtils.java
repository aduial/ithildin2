package aduial.ithildin.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class FxmlUtils {

    private FxmlUtils(){}

    public static Pane fxmlLoader(String fxmlPath){
        FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getResource(fxmlPath));
        loader.setResources(getResourceBundle());
        try {
            return loader.load();
        } catch (Exception e) {
            DialogsUtils.errorAlert(e.getMessage());
        }
        return null;
    }

    public static FXMLLoader getLoaderWithResources(String fxmlPath){
        FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getResource(fxmlPath));
        loader.setResources(getResourceBundle());
        return loader;
    }

    public static ResourceBundle getResourceBundle(){
        return ResourceBundle.getBundle("bundles.messages");
    }
}

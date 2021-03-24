package aduial.ithildin;

import aduial.ithildin.controller.HennethController;
import aduial.ithildin.util.DialogsUtils;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class Ithildin extends Application {

    public static final String HENNETH_FXML = "/fxml/Henneth.fxml";
    public static final String MABED_FXML = "/fxml/Mabed.fxml";
    public static final String ECHAD_FXML = "/fxml/Echad.fxml";

    private Stage      hennethStage;
    private StackPane  stackPane;

    @Override
    public void start(Stage primaryStage) {
        Locale.setDefault(new Locale("en"));
        this.hennethStage = primaryStage;
        primaryStage.setTitle("Ithildin");
        initRootLayout();
    }

    public void initRootLayout() {
        try {
            FXMLLoader hennethLoader = new FXMLLoader(Ithildin.class.getResource(HENNETH_FXML));
            hennethLoader.setResources(ResourceBundle.getBundle("bundles.messages"));
            BorderPane henneth = hennethLoader.load();

            // give the controller access to the main.
            HennethController hennethController = hennethLoader.getController();
            hennethController.setMain(this);


            this.stackPane = (StackPane) henneth.getCenter();
            Scene hennethScene = new Scene(henneth); // send rootLayout to the Scene;
            hennethStage.setScene(hennethScene);     // set the Scene in the primary Stage;

            hennethStage.show();                     // and display the primary Stage

//            initEditView(); <- that's for later, gentlepeople
            initSearchView();
        } catch (IOException e) {
            DialogsUtils.errorAlert(e.getMessage());
            e.printStackTrace();
        }
    }

    //Shows the edit view inside the root layout.
    public void initSearchView() {
        try {
            FXMLLoader mabedLoader = new FXMLLoader(Ithildin.class.getResource(MABED_FXML));
            VBox mabed = mabedLoader.load();
            stackPane.getChildren().add(mabed);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Shows the search view inside the root layout.
    public void initEditView() {
        try {
            FXMLLoader echadLoader = new FXMLLoader(Ithildin.class.getResource(ECHAD_FXML));
            VBox echad = echadLoader.load();
            stackPane.getChildren().add(echad);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void swapViews(){
        ObservableList<Node> nodes = this.stackPane.getChildren();
        nodes.get(nodes.size()-2).toFront();
    }

    @Override
    public void stop() {
        Platform.exit();
    }


    public static void main(String[] args) {
//        try {
//        File outputFile = File.createTempFile("debug", ".log", FileSystemView.getFileSystemView().getDefaultDirectory());
//        PrintStream output = new PrintStream(new BufferedOutputStream(new FileOutputStream(outputFile)), true);
//        System.setOut(output);
//        System.setErr(output);
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
        launch(args);

    }
}

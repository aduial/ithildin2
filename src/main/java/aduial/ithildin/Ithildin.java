package aduial.ithildin;

import aduial.ithildin.controller.HennethController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.swing.filechooser.FileSystemView;
import java.io.*;

public class Ithildin extends Application {

    private Stage      hennethStage;
    private BorderPane henneth;
    private StackPane  stackPane;

    @Override
    public void start(Stage primaryStage) {
        this.hennethStage = primaryStage;
        primaryStage.setTitle("Ithildin");
        initRootLayout();
    }

    public void initRootLayout() {
        try {
            FXMLLoader hennethLoader = new FXMLLoader();
            hennethLoader.setLocation(Ithildin.class.getResource("controller/Henneth.fxml"));
            henneth = hennethLoader.load();

            this.stackPane = (StackPane) henneth.getCenter();
            Scene hennethScene = new Scene(henneth); //send rootLayout to the Scene.
            hennethStage.setScene(hennethScene); //set the scene in primary stage.

            // give the controller access to the main.
            HennethController hennethController = hennethLoader.getController();
            hennethController.setMain(this);
            hennethStage.show(); //display the primary stage

//            initEditView();
            initSearchView();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Shows the edit view inside the root layout.
    public void initSearchView() {
        try {
            FXMLLoader mabedLoader = new FXMLLoader();
            mabedLoader.setLocation(Ithildin.class.getResource("controller/Mabed.fxml"));
            VBox mabed = mabedLoader.load();
            stackPane.getChildren().add(mabed);
//      for (Node node: stackPane.getChildren()){
//        node.setVisible(false);
//      }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Shows the search view inside the root layout.
    public void initEditView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Ithildin.class.getResource("controller/Echad.fxml"));
            VBox searchView = loader.load();
            stackPane.getChildren().add(searchView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void swapViews(){
        ObservableList<Node> nodes = this.stackPane.getChildren();
        nodes.get(nodes.size()-2).toFront();
    }

    @Override
    public void stop() throws Exception {
//        context.close();
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

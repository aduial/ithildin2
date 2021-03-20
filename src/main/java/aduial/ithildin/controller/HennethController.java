package aduial.ithildin.controller;

import aduial.ithildin.Ithildin;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import aduial.ithildin.Main;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

/**
 * @author Lúthien
 * S. henneth n. “window”
 */
public class HennethController {

  @FXML
  private MenuItem searchMenuItem;
  
  @FXML
  private MenuItem editMenuItem;
  
  
  //Reference to the main application
  private Ithildin ithildin;
  //Is called by the main application to give a reference back to itself.

  public void setMain(Ithildin ithildin) {
    this.ithildin = ithildin;
  }

  //Exit the program
  public void handleExit(ActionEvent actionEvent) {
    System.exit(0);
  }

  @FXML
  public void handleEditAction(ActionEvent event) {
    ithildin.swapViews();
    editMenuItem.setDisable(true);
    searchMenuItem.setDisable(false);
  }

  @FXML
  public void handleSearchAction(ActionEvent event) {
    ithildin.swapViews();
    editMenuItem.setDisable(false);
    searchMenuItem.setDisable(true);
  }

  //Help Menu button behavior
  public void handleHelp(ActionEvent actionEvent) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Beep");
    alert.setHeaderText("Yeah. Right.");
    alert.setContentText("No, no, no, no!");
    alert.show();
  }
}
